/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package nl.igorski.lib.audio.nativeaudio;

public class Limiter extends BaseProcessor {
  private long swigCPtr;

  protected Limiter(long cPtr, boolean cMemoryOwn) {
    super(NativeAudioEngineJNI.Limiter_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Limiter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        NativeAudioEngineJNI.delete_Limiter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Limiter() {
    this(NativeAudioEngineJNI.new_Limiter__SWIG_0(), true);
  }

  public Limiter(float attackMs, float releaseMs, int sampleRate, int amountOfChannels) {
    this(NativeAudioEngineJNI.new_Limiter__SWIG_1(attackMs, releaseMs, sampleRate, amountOfChannels), true);
  }

  public float getLinearGR() {
    return NativeAudioEngineJNI.Limiter_getLinearGR(swigCPtr, this);
  }

  public void process(SWIGTYPE_p_AudioBuffer sampleBuffer, boolean isMonoSource) {
    NativeAudioEngineJNI.Limiter_process(swigCPtr, this, SWIGTYPE_p_AudioBuffer.getCPtr(sampleBuffer), isMonoSource);
  }

  public boolean isCacheable() {
    return NativeAudioEngineJNI.Limiter_isCacheable(swigCPtr, this);
  }

}