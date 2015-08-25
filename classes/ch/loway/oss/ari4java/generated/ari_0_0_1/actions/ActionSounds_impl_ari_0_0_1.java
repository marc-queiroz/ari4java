package ch.loway.oss.ari4java.generated.ari_0_0_1.actions;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Tue Aug 25 09:57:19 BRT 2015
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.BaseAriAction;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.HttpParam;
import ch.loway.oss.ari4java.tools.HttpResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import ch.loway.oss.ari4java.generated.ari_0_0_1.models.*;

/**********************************************************
 * 
 * Generated by: Apis
 *********************************************************/


public class ActionSounds_impl_ari_0_0_1 extends BaseAriAction  implements ActionSounds {
/**********************************************************
 * Sounds
 * 
 * List all sounds.
 *********************************************************/
private void buildList(String lang, String format) {
reset();
url = "/sounds";
method = "GET";
lParamQuery.add( HttpParam.build( "lang", lang) );
lParamQuery.add( HttpParam.build( "format", format) );
}

@Override
public List<Sound> list(String lang, String format) throws RestException {
buildList(lang, format);
String json = httpActionSync();
return deserializeJsonAsAbstractList( json,
   new TypeReference<List<Sound_impl_ari_0_0_1>>() {} ); 
}

@Override
public void list(String lang, String format, AriCallback<List<Sound>> callback) {
buildList(lang, format);
httpActionAsync(callback, new TypeReference<List<Sound_impl_ari_0_0_1>>() {});
}

/**********************************************************
 * Individual sound
 * 
 * Get a sound's details.
 *********************************************************/
private void buildGet(String soundId) {
reset();
url = "/sounds/" + soundId + "";
method = "GET";
}

@Override
public Sound get(String soundId) throws RestException {
buildGet(soundId);
String json = httpActionSync();
return deserializeJson( json, Sound_impl_ari_0_0_1.class ); 
}

@Override
public void get(String soundId, AriCallback<Sound> callback) {
buildGet(soundId);
httpActionAsync(callback, Sound_impl_ari_0_0_1.class);
}

/** No missing signatures from interface */
};

