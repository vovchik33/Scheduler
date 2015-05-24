package pttv.tvdirector.scheduler.task;

import pttv.tvdirector.scheduler.command.SchedulerCommand;
import pttv.tvdirector.scheduler.data.ConfigVO;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by unclejoe33 on 24.05.2015.
 */
public class SchedulerTask {
    private ConfigVO params;
    private List<SchedulerCommand> commands;
    private Timer timer;
    private ExecutorTimerTask timerTask;
    private int counter;

    public SchedulerTask() {
    }

    public List<SchedulerCommand> getCommands() {
        return commands;
    }

    public void setCommands(List<SchedulerCommand> commands) {
        this.commands = commands;
    }

    public ConfigVO getParams() {
        return params;
    }

    public void setParams(ConfigVO params) {
        this.params = params;
        //System.out.println(this.params.getData().get("repeatable"));
        //System.out.println(this.params.getData().get("interval"));
        timer = new Timer();
        timerTask = new ExecutorTimerTask();

    }

    public void run() {
        counter = 0;
        if (((String) this.params.getData().get("repeatable")).equals("false")) {
            timer.schedule(timerTask, Integer.parseInt((String) this.params.getData().get("interval")) * 1000);
        } else {
            timer.schedule(timerTask, Integer.parseInt((String) this.params.getData().get("delay")) * 1000, Integer.parseInt((String) this.params.getData().get("interval")) * 1000);
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SchedulerTask{");
        sb.append("params=").append(params);
        sb.append(", counter=").append(counter);
        sb.append(", commands=").append(commands);
        sb.append('}');
        return sb.toString();
    }

    class ExecutorTimerTask extends TimerTask {

        @Override
        public void run() {
            System.out.println(SchedulerTask.this.toString());
        }
    }
}
