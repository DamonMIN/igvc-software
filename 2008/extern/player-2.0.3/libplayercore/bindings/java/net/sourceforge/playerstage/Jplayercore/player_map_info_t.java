/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.sourceforge.playerstage.Jplayercore;

public class player_map_info_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected player_map_info_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(player_map_info_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      playercore_javaJNI.delete_player_map_info_t(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected static long[] cArrayUnwrap(player_map_info_t[] arrayWrapper) {
      long[] cArray = new long[arrayWrapper.length];
      for (int i=0; i<arrayWrapper.length; i++)
        cArray[i] = player_map_info_t.getCPtr(arrayWrapper[i]);
      return cArray;
  }

  protected static player_map_info_t[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    player_map_info_t[] arrayWrapper = new player_map_info_t[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new player_map_info_t(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public void setScale(float scale) {
    playercore_javaJNI.set_player_map_info_t_scale(swigCPtr, scale);
  }

  public float getScale() {
    return playercore_javaJNI.get_player_map_info_t_scale(swigCPtr);
  }

  public void setWidth(long width) {
    playercore_javaJNI.set_player_map_info_t_width(swigCPtr, width);
  }

  public long getWidth() {
    return playercore_javaJNI.get_player_map_info_t_width(swigCPtr);
  }

  public void setHeight(long height) {
    playercore_javaJNI.set_player_map_info_t_height(swigCPtr, height);
  }

  public long getHeight() {
    return playercore_javaJNI.get_player_map_info_t_height(swigCPtr);
  }

  public void setOrigin(player_pose_t origin) {
    playercore_javaJNI.set_player_map_info_t_origin(swigCPtr, player_pose_t.getCPtr(origin));
  }

  public player_pose_t getOrigin() {
    long cPtr = playercore_javaJNI.get_player_map_info_t_origin(swigCPtr);
    return (cPtr == 0) ? null : new player_pose_t(cPtr, false);
  }

  public player_map_info_t() {
    this(playercore_javaJNI.new_player_map_info_t(), true);
  }

}
