/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.sourceforge.playerstage.Jplayercore;

public class player_simulation_property_int_req_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected player_simulation_property_int_req_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(player_simulation_property_int_req_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      playercore_javaJNI.delete_player_simulation_property_int_req_t(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected static long[] cArrayUnwrap(player_simulation_property_int_req_t[] arrayWrapper) {
      long[] cArray = new long[arrayWrapper.length];
      for (int i=0; i<arrayWrapper.length; i++)
        cArray[i] = player_simulation_property_int_req_t.getCPtr(arrayWrapper[i]);
      return cArray;
  }

  protected static player_simulation_property_int_req_t[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    player_simulation_property_int_req_t[] arrayWrapper = new player_simulation_property_int_req_t[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new player_simulation_property_int_req_t(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public void setName_count(long name_count) {
    playercore_javaJNI.set_player_simulation_property_int_req_t_name_count(swigCPtr, name_count);
  }

  public long getName_count() {
    return playercore_javaJNI.get_player_simulation_property_int_req_t_name_count(swigCPtr);
  }

  public void setName(String name) {
    playercore_javaJNI.set_player_simulation_property_int_req_t_name(swigCPtr, name);
  }

  public String getName() {
    return playercore_javaJNI.get_player_simulation_property_int_req_t_name(swigCPtr);
  }

  public void setProp_count(long prop_count) {
    playercore_javaJNI.set_player_simulation_property_int_req_t_prop_count(swigCPtr, prop_count);
  }

  public long getProp_count() {
    return playercore_javaJNI.get_player_simulation_property_int_req_t_prop_count(swigCPtr);
  }

  public void setProp(String prop) {
    playercore_javaJNI.set_player_simulation_property_int_req_t_prop(swigCPtr, prop);
  }

  public String getProp() {
    return playercore_javaJNI.get_player_simulation_property_int_req_t_prop(swigCPtr);
  }

  public void setValue(int value) {
    playercore_javaJNI.set_player_simulation_property_int_req_t_value(swigCPtr, value);
  }

  public int getValue() {
    return playercore_javaJNI.get_player_simulation_property_int_req_t_value(swigCPtr);
  }

  public player_simulation_property_int_req_t() {
    this(playercore_javaJNI.new_player_simulation_property_int_req_t(), true);
  }

}
