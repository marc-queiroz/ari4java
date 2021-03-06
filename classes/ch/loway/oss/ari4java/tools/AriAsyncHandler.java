
package ch.loway.oss.ari4java.tools;

import com.fasterxml.jackson.core.type.TypeReference;

/**
 * Delegate for handling asynchronous ARI responses.
 * 
 * 
 */
public class AriAsyncHandler<T> implements HttpResponseHandler {
    private final AriCallback<? super T> callback;
    private Class<T> klazz;
    private TypeReference<T> klazzType;

    public AriAsyncHandler(AriCallback<? super T> callback, Class<T> klazz) {
        this.callback = callback;
        this.klazz = klazz;
    }

    public AriAsyncHandler(AriCallback<? super T> callback, TypeReference<T> klazzType) {
        this.callback = callback;
        this.klazzType = klazzType;
    }

    public AriCallback<? super T> getCallback() {
        return callback;
    }

    void handleResponse(String json) {
        try {
            //System.out.println(String.format("json: %s",json)); 
            T result;
            if (Void.class.equals(klazz)) {
                result = null;
            } else if (klazz != null) {
                result = BaseAriAction.deserializeJson(json, klazz);
            } else {
                //System.out.println("Value of klazzType: " + klazzType);
                result = BaseAriAction.deserializeJson(json, klazzType);
            }
            this.callback.onSuccess(result);
        } catch (RestException e) {
            this.callback.onFailure(e);
        }
    }

    @Override
    public void onConnect() {
        // Client connected. That's good.
    }

    @Override
    public void onDisconnect() {
        this.callback.onFailure(new RestException("Asterisk WS is disconnected. Please retry."));
    }

    @Override
    public void onSuccess(String response) {
        handleResponse(response);
    }

    @Override
    public void onFailure(Throwable e) {
        this.callback.onFailure(new RestException(e));
    }

}

// $Log$
//
