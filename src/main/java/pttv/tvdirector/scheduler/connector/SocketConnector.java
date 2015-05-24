package pttv.tvdirector.scheduler.connector;

import pttv.tvdirector.scheduler.data.ConfigVO;

/**
 * Created by unclejoe33 on 24.05.2015.
 */
public class SocketConnector {
    ConfigVO params;

    public ConfigVO getParams() {
        return params;
    }

    public void setParams(ConfigVO params) {
        this.params = params;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SocketConnector{");
        sb.append("params=").append(params);
        sb.append('}');
        return sb.toString();
    }
}
