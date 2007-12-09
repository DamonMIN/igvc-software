/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.sourceforge.playerstage.Jplayercore;

public class player_mcom_data_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected player_mcom_data_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(player_mcom_data_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      playercore_javaJNI.delete_player_mcom_data_t(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected static long[] cArrayUnwrap(player_mcom_data_t[] arrayWrapper) {
      long[] cArray = new long[arrayWrapper.length];
      for (int i=0; i<arrayWrapper.length; i++)
        cArray[i] = player_mcom_data_t.getCPtr(arrayWrapper[i]);
      return cArray;
  }

  protected static player_mcom_data_t[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    player_mcom_data_t[] arrayWrapper = new player_mcom_data_t[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new player_mcom_data_t(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public void setFull(char full) {
    playercore_javaJNI.set_player_mcom_data_t_full(swigCPtr, full);
  }

  public char getFull() {
    return playercore_javaJNI.get_player_mcom_data_t_full(swigCPtr);
  }

  public void setData_count(long data_count) {
    playercore_javaJNI.set_player_mcom_data_t_data_count(swigCPtr, data_count);
  }

  public long getData_count() {
    return playercore_javaJNI.get_player_mcom_data_t_data_count(swigCPtr);
  }

  public void setData(String data) {
    playercore_javaJNI.set_player_mcom_data_t_data(swigCPtr, data);
  }

  public String getData() {
    return playercore_javaJNI.get_player_mcom_data_t_data(swigCPtr);
  }

  public player_mcom_data_t() {
    this(playercore_javaJNI.new_player_mcom_data_t(), true);
  }

}
