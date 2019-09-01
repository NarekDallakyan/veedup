package am.varmtech.veedup.apprtc.callback;

import org.webrtc.StatsReport;

public interface UpdateEncoderCallBack {
    void updateEncoderStatistics(final StatsReport[] reports);
}
