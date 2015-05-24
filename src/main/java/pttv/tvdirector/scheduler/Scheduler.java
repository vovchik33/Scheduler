package pttv.tvdirector.scheduler;

import pttv.tvdirector.scheduler.task.SchedulerTask;

import java.util.List;

/**
 * Created by unclejoe33 on 24.05.2015.
 */
public class Scheduler {
    private List<SchedulerTask> tasks;

    public Scheduler() {
    }

    public List<SchedulerTask> getTasks() {
        return tasks;
    }

    public void setTasks(List<SchedulerTask> tasks) {
        this.tasks = tasks;
    }

    public void run() {
        for (SchedulerTask task:tasks) {
            task.run();
        }
    }
}
