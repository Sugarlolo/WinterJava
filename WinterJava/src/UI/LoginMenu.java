/*
 * Created by JFormDesigner on Tue Jan 03 15:01:01 KST 2023
 */

package UI;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

/**
 * @author jih86
 */
public class LoginMenu extends JFrame {
    public LoginMenu() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Inhyeok Jang
        loginBtn = new JButton();
        registerBtn = new JButton();
        titleLabel = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();

        //======== this ========
        Container contentPane = getContentPane();

        //---- loginBtn ----
        loginBtn.setText("\ub85c\uadf8\uc778");

        //---- registerBtn ----
        registerBtn.setText("\ud68c\uc6d0\uac00\uc785");

        //---- titleLabel ----
        titleLabel.setText("Coffee Order System");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .add(102, 102, 102)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.LEADING, false)
                        .add(textField1)
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(loginBtn)
                            .add(52, 52, 52)
                            .add(registerBtn))
                        .add(textField2))
                    .addContainerGap(84, Short.MAX_VALUE))
                .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(152, Short.MAX_VALUE)
                    .add(titleLabel)
                    .add(134, 134, 134))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(113, Short.MAX_VALUE)
                    .add(titleLabel)
                    .add(51, 51, 51)
                    .add(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.RELATED)
                    .add(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .add(23, 23, 23)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                        .add(registerBtn)
                        .add(loginBtn))
                    .add(109, 109, 109))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Inhyeok Jang
    private JButton loginBtn;
    private JButton registerBtn;
    private JLabel titleLabel;
    private JTextField textField1;
    private JTextField textField2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
