package ch.loway.oss.ari4java.generated.ari_1_0_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Tue Aug 25 09:57:19 BRT 2015
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * Event showing the start of a media playback operation.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class PlaybackStarted_impl_ari_1_0_0 extends Event_impl_ari_1_0_0 implements PlaybackStarted, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Playback control object  */
  private Playback playback;
 public Playback getPlayback() {
   return playback;
 }

 @JsonDeserialize( as=Playback_impl_ari_1_0_0.class )
 public void setPlayback(Playback val ) {
   playback = val;
 }

/** No missing signatures from interface */
}

