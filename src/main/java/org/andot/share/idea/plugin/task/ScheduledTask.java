package org.andot.share.idea.plugin.task;

import com.intellij.notification.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

import static com.intellij.openapi.vcs.ui.VcsBalloonProblemNotifier.NOTIFICATION_GROUP;
import static java.util.concurrent.TimeUnit.HOURS;
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * 定时器
 * @author Lucas
 */
public class ScheduledTask {
    private final ScheduledExecutorService scheduler =
            Executors.newScheduledThreadPool(1);

    private final NotificationGroup NOTIFICATION_GROUP =
            new NotificationGroup("Groovy DSL errors", NotificationDisplayType.BALLOON, true);

    private final Notification notification = NOTIFICATION_GROUP.createNotification("一时一次提醒您", "一时已到，请您开始休息，做一下扩胸运动， 舒展下筋骨！",
            NotificationType.INFORMATION, NotificationListener.URL_OPENING_LISTENER);

    public void beepForAnHour(Project project) {
        final Runnable beeper = () -> notification.notify(project);
        scheduler.scheduleWithFixedDelay(beeper,  1, 1, HOURS);
    }

    public void beepForAnSeconds(Project project) {
        final Runnable beeper = () -> notification.notify(project);
        scheduler.scheduleWithFixedDelay(beeper,  1, 1, SECONDS);
    }
}
