/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.sourceforge.playerstage.Jplayercore;

public class player_position3d_geom_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected player_position3d_geom_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(player_position3d_geom_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      playercore_javaJNI.delete_player_position3d_geom_t(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected static long[] cArrayUnwrap(player_position3d_geom_t[] arrayWrapper) {
      long[] cArray = new long[arrayWrapper.length];
      for (int i=0; i<arrayWrapper.length; i++)
        cArray[i] = player_position3d_geom_t.getCPtr(arrayWrapper[i]);
      return cArray;
  }

  protected static player_position3d_geom_t[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    player_position3d_geom_t[] arrayWrapper = new player_position3d_geom_t[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new player_position3d_geom_t(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public void setPose(player_pose3d_t pose) {
    playercore_javaJNI.set_player_position3d_geom_t_pose(swigCPtr, player_pose3d_t.getCPtr(pose));
  }

  public player_pose3d_t getPose() {
    long cPtr = playercore_javaJNI.get_player_position3d_geom_t_pose(swigCPtr);
    return (cPtr == 0) ? null : new player_pose3d_t(cPtr, false);
  }

  public void setSize(player_bbox3d_t size) {
    playercore_javaJNI.set_player_position3d_geom_t_size(swigCPtr, player_bbox3d_t.getCPtr(size));
  }

  public player_bbox3d_t getSize() {
    long cPtr = playercore_javaJNI.get_player_position3d_geom_t_size(swigCPtr);
    return (cPtr == 0) ? null : new player_bbox3d_t(cPtr, false);
  }

  public player_position3d_geom_t() {
    this(playercore_javaJNI.new_player_position3d_geom_t(), true);
  }

}
