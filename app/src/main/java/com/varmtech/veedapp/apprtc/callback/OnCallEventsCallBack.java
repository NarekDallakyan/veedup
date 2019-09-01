
package com.varmtech.veedapp.apprtc.callback;

import org.webrtc.RendererCommon;

import java.io.Serializable;

/**
     * Call control interface for container activity.
     */
    public interface OnCallEventsCallBack extends Serializable {
        void onCallHangUp();

        void onCameraSwitch();

        void onVideoScalingSwitch(RendererCommon.ScalingType scalingType);

        void onCaptureFormatChange(int width, int height, int framerate);

        boolean onToggleMic();
    }