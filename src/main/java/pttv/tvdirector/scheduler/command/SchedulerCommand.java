package pttv.tvdirector.scheduler.command;

import pttv.tvdirector.scheduler.connector.SocketConnector;
import pttv.tvdirector.scheduler.data.ConfigVO;

/**
 * Created by unclejoe33 on 24.05.2015.
 */
public class SchedulerCommand {
    private ConfigVO params;
    private SocketConnector connector;

    public SchedulerCommand() {
        System.out.println("SchedulerCommand created.");
    }

    public ConfigVO getParams() {
        return params;
    }

    public void setParams(ConfigVO params) {
        this.params = params;
    }

    public SocketConnector getConnector() {
        return connector;
    }

    public void setConnector(SocketConnector connector) {
        this.connector = connector;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SchedulerCommand{");
        sb.append("params=").append(params);
        sb.append(", connector=").append(connector);
        sb.append('}');
        return sb.toString();
    }
}
