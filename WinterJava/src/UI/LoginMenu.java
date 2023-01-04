/*
 * Created by JFormDesigner on Wed Jan 04 14:31:59 KST 2023
 */

package UI;

import javax.swing.*;
import javax.swing.GroupLayout;

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
        var contentPane = getContentPane();

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
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(102, 102, 102)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(textField1)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(loginBtn)
                            .addGap(52, 52, 52)
                            .addComponent(registerBtn))
                        .addComponent(textField2))
                    .addContainerGap(84, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(152, Short.MAX_VALUE)
                    .addComponent(titleLabel)
                    .addGap(134, 134, 134))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(113, Short.MAX_VALUE)
                    .addComponent(titleLabel)
                    .addGap(51, 51, 51)
                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(23, 23, 23)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(registerBtn)
                        .addComponent(loginBtn))
                    .addGap(109, 109, 109))
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
