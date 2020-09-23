package org.andot.share.idea.plugin.task;

import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

public class BackgoundTash {
    public static void main(String[] args) {
        Project project = null;
        ProgressManager.getInstance().run(new Task.Backgroundable(project, "OneHourOnce（一时一次）") {
            @Override
            public void run(@NotNull ProgressIndicator progressIndicator) {
                progressIndicator.setIndeterminate(false);
                for (; ;) {
                    try {
                        Thread.sleep(60*60*000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}
