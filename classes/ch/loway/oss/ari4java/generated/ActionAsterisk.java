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


public interface ActionAsterisk {

// void getInfo String AriCallback<AsteriskInfo> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void getInfo(String only, AriCallback<AsteriskInfo> callback);



// void getGlobalVar String AriCallback<Variable> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void getGlobalVar(String variable, AriCallback<Variable> callback);



// AsteriskInfo getInfo String
/**********************************************************
 * Gets Asterisk system information.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public AsteriskInfo getInfo(String only) throws RestException;



// void setGlobalVar String String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void setGlobalVar(String variable, String value, AriCallback<Void> callback);



// Variable getGlobalVar String
/**********************************************************
 * Get the value of a global variable.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public Variable getGlobalVar(String variable) throws RestException;



// void setGlobalVar String String
/**********************************************************
 * Set the value of a global variable.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void setGlobalVar(String variable, String value) throws RestException;


}
;
