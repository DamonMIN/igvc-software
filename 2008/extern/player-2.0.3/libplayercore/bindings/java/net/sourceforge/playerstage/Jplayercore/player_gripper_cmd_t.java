/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.sourceforge.playerstage.Jplayercore;

public class player_gripper_cmd_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected player_gripper_cmd_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(player_gripper_cmd_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      playercore_javaJNI.delete_player_gripper_cmd_t(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected static long[] cArrayUnwrap(player_gripper_cmd_t[] arrayWrapper) {
      long[] cArray = new long[arrayWrapper.length];
      for (int i=0; i<arrayWrapper.length; i++)
        cArray[i] = player_gripper_cmd_t.getCPtr(arrayWrapper[i]);
      return cArray;
  }

  protected static player_gripper_cmd_t[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    player_gripper_cmd_t[] arrayWrapper = new player_gripper_cmd_t[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new player_gripper_cmd_t(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public void setCmd(long cmd) {
    playercore_javaJNI.set_player_gripper_cmd_t_cmd(swigCPtr, cmd);
  }

  public long getCmd() {
    return playercore_javaJNI.get_player_gripper_cmd_t_cmd(swigCPtr);
  }

  public void setArg(long arg) {
    playercore_javaJNI.set_player_gripper_cmd_t_arg(swigCPtr, arg);
  }

  public long getArg() {
    return playercore_javaJNI.get_player_gripper_cmd_t_arg(swigCPtr);
  }

  public player_gripper_cmd_t() {
    this(playercore_javaJNI.new_player_gripper_cmd_t(), true);
  }

}
