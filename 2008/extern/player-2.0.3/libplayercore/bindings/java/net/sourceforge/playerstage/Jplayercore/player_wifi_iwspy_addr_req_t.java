/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.sourceforge.playerstage.Jplayercore;

public class player_wifi_iwspy_addr_req_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected player_wifi_iwspy_addr_req_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(player_wifi_iwspy_addr_req_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      playercore_javaJNI.delete_player_wifi_iwspy_addr_req_t(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected static long[] cArrayUnwrap(player_wifi_iwspy_addr_req_t[] arrayWrapper) {
      long[] cArray = new long[arrayWrapper.length];
      for (int i=0; i<arrayWrapper.length; i++)
        cArray[i] = player_wifi_iwspy_addr_req_t.getCPtr(arrayWrapper[i]);
      return cArray;
  }

  protected static player_wifi_iwspy_addr_req_t[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    player_wifi_iwspy_addr_req_t[] arrayWrapper = new player_wifi_iwspy_addr_req_t[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new player_wifi_iwspy_addr_req_t(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public void setAddress(String address) {
    playercore_javaJNI.set_player_wifi_iwspy_addr_req_t_address(swigCPtr, address);
  }

  public String getAddress() {
    return playercore_javaJNI.get_player_wifi_iwspy_addr_req_t_address(swigCPtr);
  }

  public player_wifi_iwspy_addr_req_t() {
    this(playercore_javaJNI.new_player_wifi_iwspy_addr_req_t(), true);
  }

}
