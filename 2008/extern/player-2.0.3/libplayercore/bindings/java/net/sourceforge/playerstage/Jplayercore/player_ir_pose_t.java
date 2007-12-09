/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.sourceforge.playerstage.Jplayercore;

public class player_ir_pose_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected player_ir_pose_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(player_ir_pose_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      playercore_javaJNI.delete_player_ir_pose_t(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected static long[] cArrayUnwrap(player_ir_pose_t[] arrayWrapper) {
      long[] cArray = new long[arrayWrapper.length];
      for (int i=0; i<arrayWrapper.length; i++)
        cArray[i] = player_ir_pose_t.getCPtr(arrayWrapper[i]);
      return cArray;
  }

  protected static player_ir_pose_t[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    player_ir_pose_t[] arrayWrapper = new player_ir_pose_t[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new player_ir_pose_t(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public void setPoses_count(long poses_count) {
    playercore_javaJNI.set_player_ir_pose_t_poses_count(swigCPtr, poses_count);
  }

  public long getPoses_count() {
    return playercore_javaJNI.get_player_ir_pose_t_poses_count(swigCPtr);
  }

  public void setPoses(player_pose_t[] poses) {
    playercore_javaJNI.set_player_ir_pose_t_poses(swigCPtr, player_pose_t.cArrayUnwrap(poses));
  }

  public player_pose_t[] getPoses() {
    return player_pose_t.cArrayWrap(playercore_javaJNI.get_player_ir_pose_t_poses(swigCPtr), false);
  }

  public player_ir_pose_t() {
    this(playercore_javaJNI.new_player_ir_pose_t(), true);
  }

}
