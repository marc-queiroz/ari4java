package ch.loway.oss.ari4java.tools;

/**
 * Callback interface for asynchronous ARI operations 
 * 
 * @author mwalton
 *
 * @param <T>
 * The type of result returned in callback
 */
@FunctionalInterface
public interface AriCallback<T> {
    void onSuccess(T result);
    default void onFailure(RestException e) {
      e.printStackTrace();
    }
}


//To achieve this one can add two additional interfaces:
//
//public interface FutureCompletionCallback<V> {
//    public void onSuccess(V result);
//}
//
//public interface FutureFailureCallback {
//    void onFailure(Throwable t);
//}
//
//And the folling methods to Futures class:
//
//public static <V> void onComplete(ListenableFuture<V> future, FutureCompletionCallback<? super V> callback)
//
//public static <V> void onFailure(ListenableFuture<V> future, FutureFailureCallback callback)
//
