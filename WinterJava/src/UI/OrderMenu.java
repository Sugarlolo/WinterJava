/*
 * Created by JFormDesigner on Wed Jan 04 14:40:26 KST 2023
 */

package UI;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author jih86
 */
public class OrderMenu extends JFrame {
    public OrderMenu() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Inhyeok Jang
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        button1 = new JButton();
        button2 = new JButton();
        scrollPane2 = new JScrollPane();
        list1 = new JList();

        //======== this ========
        var contentPane = getContentPane();

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }

        //---- button1 ----
        button1.setText("\uc8fc\ubb38\ud558\uae30");

        //---- button2 ----
        button2.setText("\uc8fc\ubb38\ucde8\uc18c");

        //======== scrollPane2 ========
        {
            scrollPane2.setViewportView(list1);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(141, 141, 141)
                    .addComponent(button1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                    .addComponent(button2)
                    .addGap(115, 115, 115))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
                    .addGap(43, 43, 43)
                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(38, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE))
                    .addGap(38, 38, 38)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1)
                        .addComponent(button2))
                    .addContainerGap(58, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Inhyeok Jang
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton button1;
    private JButton button2;
    private JScrollPane scrollPane2;
    private JList list1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
