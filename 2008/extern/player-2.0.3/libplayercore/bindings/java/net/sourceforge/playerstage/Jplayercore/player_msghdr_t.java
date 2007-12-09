/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.sourceforge.playerstage.Jplayercore;

public class player_msghdr_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected player_msghdr_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(player_msghdr_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      playercore_javaJNI.delete_player_msghdr_t(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected static long[] cArrayUnwrap(player_msghdr_t[] arrayWrapper) {
      long[] cArray = new long[arrayWrapper.length];
      for (int i=0; i<arrayWrapper.length; i++)
        cArray[i] = player_msghdr_t.getCPtr(arrayWrapper[i]);
      return cArray;
  }

  protected static player_msghdr_t[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    player_msghdr_t[] arrayWrapper = new player_msghdr_t[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new player_msghdr_t(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public void setAddr(player_devaddr_t addr) {
    playercore_javaJNI.set_player_msghdr_t_addr(swigCPtr, player_devaddr_t.getCPtr(addr));
  }

  public player_devaddr_t getAddr() {
    long cPtr = playercore_javaJNI.get_player_msghdr_t_addr(swigCPtr);
    return (cPtr == 0) ? null : new player_devaddr_t(cPtr, false);
  }

  public void setType(short type) {
    playercore_javaJNI.set_player_msghdr_t_type(swigCPtr, type);
  }

  public short getType() {
    return playercore_javaJNI.get_player_msghdr_t_type(swigCPtr);
  }

  public void setSubtype(short subtype) {
    playercore_javaJNI.set_player_msghdr_t_subtype(swigCPtr, subtype);
  }

  public short getSubtype() {
    return playercore_javaJNI.get_player_msghdr_t_subtype(swigCPtr);
  }

  public void setTimestamp(double timestamp) {
    playercore_javaJNI.set_player_msghdr_t_timestamp(swigCPtr, timestamp);
  }

  public double getTimestamp() {
    return playercore_javaJNI.get_player_msghdr_t_timestamp(swigCPtr);
  }

  public void setSeq(long seq) {
    playercore_javaJNI.set_player_msghdr_t_seq(swigCPtr, seq);
  }

  public long getSeq() {
    return playercore_javaJNI.get_player_msghdr_t_seq(swigCPtr);
  }

  public void setSize(long size) {
    playercore_javaJNI.set_player_msghdr_t_size(swigCPtr, size);
  }

  public long getSize() {
    return playercore_javaJNI.get_player_msghdr_t_size(swigCPtr);
  }

  public player_msghdr_t() {
    this(playercore_javaJNI.new_player_msghdr_t(), true);
  }

}
