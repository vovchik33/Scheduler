package pttv.tvdirector.scheduler.data;


import java.util.Map;

/**
 * Created by unclejoe33 on 24.05.2015.
 */
public class ConfigVO {
    Map data;

    public Map getData() {
        return data;
    }

    public void setData(Map data) {
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ConfigVO{");
        sb.append("data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
