package org.andot.share.idea.plugin;

import com.intellij.notification.*;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.ui.popup.ComponentPopupBuilder;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import org.andot.share.idea.plugin.task.ScheduledTask;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.concurrent.Future;


public class StartAction extends AnAction {



    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        Project project = event.getData(PlatformDataKeys.PROJECT);
        // 后台运行程序
        ScheduledTask scheduledTask = new ScheduledTask();
        scheduledTask.beepForAnHour(project);













//        Messages.showDialog("该休息了！", "一时一次提醒您", new String[]{"玩命继续工作", "休息会继续工作", "身体重要"}, 1, Messages.getQuestionIcon());
    }
}
