/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.sourceforge.playerstage.Jplayercore;

public class player_add_replace_rule_req_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected player_add_replace_rule_req_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(player_add_replace_rule_req_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      playercore_javaJNI.delete_player_add_replace_rule_req_t(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected static long[] cArrayUnwrap(player_add_replace_rule_req_t[] arrayWrapper) {
      long[] cArray = new long[arrayWrapper.length];
      for (int i=0; i<arrayWrapper.length; i++)
        cArray[i] = player_add_replace_rule_req_t.getCPtr(arrayWrapper[i]);
      return cArray;
  }

  protected static player_add_replace_rule_req_t[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    player_add_replace_rule_req_t[] arrayWrapper = new player_add_replace_rule_req_t[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new player_add_replace_rule_req_t(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public void setInterf(int interf) {
    playercore_javaJNI.set_player_add_replace_rule_req_t_interf(swigCPtr, interf);
  }

  public int getInterf() {
    return playercore_javaJNI.get_player_add_replace_rule_req_t_interf(swigCPtr);
  }

  public void setIndex(int index) {
    playercore_javaJNI.set_player_add_replace_rule_req_t_index(swigCPtr, index);
  }

  public int getIndex() {
    return playercore_javaJNI.get_player_add_replace_rule_req_t_index(swigCPtr);
  }

  public void setType(int type) {
    playercore_javaJNI.set_player_add_replace_rule_req_t_type(swigCPtr, type);
  }

  public int getType() {
    return playercore_javaJNI.get_player_add_replace_rule_req_t_type(swigCPtr);
  }

  public void setSubtype(int subtype) {
    playercore_javaJNI.set_player_add_replace_rule_req_t_subtype(swigCPtr, subtype);
  }

  public int getSubtype() {
    return playercore_javaJNI.get_player_add_replace_rule_req_t_subtype(swigCPtr);
  }

  public void setReplace(int replace) {
    playercore_javaJNI.set_player_add_replace_rule_req_t_replace(swigCPtr, replace);
  }

  public int getReplace() {
    return playercore_javaJNI.get_player_add_replace_rule_req_t_replace(swigCPtr);
  }

  public player_add_replace_rule_req_t() {
    this(playercore_javaJNI.new_player_add_replace_rule_req_t(), true);
  }

}
