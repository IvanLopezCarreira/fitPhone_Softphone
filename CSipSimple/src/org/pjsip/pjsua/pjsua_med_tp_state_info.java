/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class pjsua_med_tp_state_info {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public pjsua_med_tp_state_info(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(pjsua_med_tp_state_info obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsuaJNI.delete_pjsua_med_tp_state_info(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMed_idx(long value) {
    pjsuaJNI.pjsua_med_tp_state_info_med_idx_set(swigCPtr, this, value);
  }

  public long getMed_idx() {
    return pjsuaJNI.pjsua_med_tp_state_info_med_idx_get(swigCPtr, this);
  }

  public void setState(pjsua_med_tp_st value) {
    pjsuaJNI.pjsua_med_tp_state_info_state_set(swigCPtr, this, value.swigValue());
  }

  public pjsua_med_tp_st getState() {
    return pjsua_med_tp_st.swigToEnum(pjsuaJNI.pjsua_med_tp_state_info_state_get(swigCPtr, this));
  }

  public void setStatus(int value) {
    pjsuaJNI.pjsua_med_tp_state_info_status_set(swigCPtr, this, value);
  }

  public int getStatus() {
    return pjsuaJNI.pjsua_med_tp_state_info_status_get(swigCPtr, this);
  }

  public void setSip_err_code(int value) {
    pjsuaJNI.pjsua_med_tp_state_info_sip_err_code_set(swigCPtr, this, value);
  }

  public int getSip_err_code() {
    return pjsuaJNI.pjsua_med_tp_state_info_sip_err_code_get(swigCPtr, this);
  }

  public void setExt_info(byte[] value) {
    pjsuaJNI.pjsua_med_tp_state_info_ext_info_set(swigCPtr, this, value);
  }

  public byte[] getExt_info() {
	return pjsuaJNI.pjsua_med_tp_state_info_ext_info_get(swigCPtr, this);
}

  public pjsua_med_tp_state_info() {
    this(pjsuaJNI.new_pjsua_med_tp_state_info(), true);
  }

}
