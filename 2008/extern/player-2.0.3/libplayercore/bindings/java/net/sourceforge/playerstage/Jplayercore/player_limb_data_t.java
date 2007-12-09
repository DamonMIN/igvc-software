/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.sourceforge.playerstage.Jplayercore;

public class player_limb_data_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected player_limb_data_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(player_limb_data_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      playercore_javaJNI.delete_player_limb_data_t(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected static long[] cArrayUnwrap(player_limb_data_t[] arrayWrapper) {
      long[] cArray = new long[arrayWrapper.length];
      for (int i=0; i<arrayWrapper.length; i++)
        cArray[i] = player_limb_data_t.getCPtr(arrayWrapper[i]);
      return cArray;
  }

  protected static player_limb_data_t[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    player_limb_data_t[] arrayWrapper = new player_limb_data_t[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new player_limb_data_t(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public void setPosition(player_point_3d_t position) {
    playercore_javaJNI.set_player_limb_data_t_position(swigCPtr, player_point_3d_t.getCPtr(position));
  }

  public player_point_3d_t getPosition() {
    long cPtr = playercore_javaJNI.get_player_limb_data_t_position(swigCPtr);
    return (cPtr == 0) ? null : new player_point_3d_t(cPtr, false);
  }

  public void setApproach(player_point_3d_t approach) {
    playercore_javaJNI.set_player_limb_data_t_approach(swigCPtr, player_point_3d_t.getCPtr(approach));
  }

  public player_point_3d_t getApproach() {
    long cPtr = playercore_javaJNI.get_player_limb_data_t_approach(swigCPtr);
    return (cPtr == 0) ? null : new player_point_3d_t(cPtr, false);
  }

  public void setOrientation(player_point_3d_t orientation) {
    playercore_javaJNI.set_player_limb_data_t_orientation(swigCPtr, player_point_3d_t.getCPtr(orientation));
  }

  public player_point_3d_t getOrientation() {
    long cPtr = playercore_javaJNI.get_player_limb_data_t_orientation(swigCPtr);
    return (cPtr == 0) ? null : new player_point_3d_t(cPtr, false);
  }

  public void setState(short state) {
    playercore_javaJNI.set_player_limb_data_t_state(swigCPtr, state);
  }

  public short getState() {
    return playercore_javaJNI.get_player_limb_data_t_state(swigCPtr);
  }

  public player_limb_data_t() {
    this(playercore_javaJNI.new_player_limb_data_t(), true);
  }

}
