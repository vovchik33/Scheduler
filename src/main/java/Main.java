import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pttv.tvdirector.scheduler.Scheduler;

/**
 * Created by unclejoe33 on 24.05.2015.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("scheduler.xml");
        Scheduler scheduler = (Scheduler) context.getBean("scheduler");
        scheduler.run();
    }
}
