package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Tue Aug 25 09:57:19 BRT 2015
// ----------------------------------------------------

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.tags.*;

/**********************************************************
 * 
 * Generated by: JavaInterface
 *********************************************************/


public interface BridgeBlindTransfer {

// Channel getTransferee
/**********************************************************
 * The channel that is being transferred
 * 
 * @since ari_1_5_0
 *********************************************************/
 public Channel getTransferee();



// String getResult
/**********************************************************
 * The result of the transfer attempt
 * 
 * @since ari_1_5_0
 *********************************************************/
 public String getResult();



// void setExten String
/**********************************************************
 * The extension transferred to
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setExten(String val );



// Bridge getBridge
/**********************************************************
 * The bridge being transferred
 * 
 * @since ari_1_5_0
 *********************************************************/
 public Bridge getBridge();



// void setContext String
/**********************************************************
 * The context transferred to
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setContext(String val );



// void setReplace_channel Channel
/**********************************************************
 * The channel that is replacing transferer when the transferee(s) can not be transferred directly
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setReplace_channel(Channel val );



// Channel getReplace_channel
/**********************************************************
 * The channel that is replacing transferer when the transferee(s) can not be transferred directly
 * 
 * @since ari_1_5_0
 *********************************************************/
 public Channel getReplace_channel();



// String getContext
/**********************************************************
 * The context transferred to
 * 
 * @since ari_1_5_0
 *********************************************************/
 public String getContext();



// boolean getIs_external
/**********************************************************
 * Whether the transfer was externally initiated or not
 * 
 * @since ari_1_5_0
 *********************************************************/
 public boolean getIs_external();



// Channel getChannel
/**********************************************************
 * The channel performing the blind transfer
 * 
 * @since ari_1_5_0
 *********************************************************/
 public Channel getChannel();



// void setChannel Channel
/**********************************************************
 * The channel performing the blind transfer
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setChannel(Channel val );



// void setTransferee Channel
/**********************************************************
 * The channel that is being transferred
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setTransferee(Channel val );



// void setBridge Bridge
/**********************************************************
 * The bridge being transferred
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setBridge(Bridge val );



// void setIs_external boolean
/**********************************************************
 * Whether the transfer was externally initiated or not
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setIs_external(boolean val );



// void setResult String
/**********************************************************
 * The result of the transfer attempt
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setResult(String val );



// String getExten
/**********************************************************
 * The extension transferred to
 * 
 * @since ari_1_5_0
 *********************************************************/
 public String getExten();


}
;
