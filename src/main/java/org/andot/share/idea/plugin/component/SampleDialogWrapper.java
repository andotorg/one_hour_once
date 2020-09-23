package org.andot.share.idea.plugin.component;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

public class SampleDialogWrapper extends DialogWrapper {

    public SampleDialogWrapper() {
        super(true);
        init();
        setTitle("一时一次（OneHourOnce）提醒您");
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        JPanel dialogPanel = new JPanel(new BorderLayout());

        JLabel label = new JLabel("testing");
        label.setPreferredSize(new Dimension(100, 100));
        dialogPanel.add(label, BorderLayout.CENTER);

        return dialogPanel;
    }
}
