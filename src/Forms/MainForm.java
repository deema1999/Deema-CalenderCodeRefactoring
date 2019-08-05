
/*
 *
 *  Copyright (C) 2019.  PSEU - Palestine Polytechnic University - All Rights Reserved
 *  * SPDX-License-Identifier: Apache-2.0
 *
 */

/*
 * Created by Basel.Altamimi on 8/4/2019.
 */

package Forms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static Forms.SwingCalendar.gitInstance;

public class MainForm extends JFrame {

    SwingCalendar calendar1 ;
    SwingCalendar calendar2 ;
    public MainForm() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application on JForm exit
        this.setTitle("Main Form");
        this.setSize(600, 200);
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.setVisible(true);

        JButton b1 = new JButton("Show Calender 1"); // Button 1 (Create Calender 1)
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
              calendar1 =  SwingCalendar.gitInstance();
               Util.Logger.log("Object HC: " + calendar1.hashCode());
            }
        });

        JButton b2 = new JButton("Show Calender 2"); // Button 2 (Create Calender 2)
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
               calendar2 =  SwingCalendar.gitInstance();
               Util.Logger.log("Object HC: " + calendar2.hashCode());
            }
        });


        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panel.add(b1);
        panel.add(b2);

        this.add(panel);
    }

    /**
     * Create and show new calender object
     * Todo: This method logs the object HashCode in a text file, after refactoring the code; show warning message if the HashCode of Calender1 doesn't equal Calender2 HashCode
     */
    private void showNewCalender() {
        //compare the hash codes of the two calendars.
        if ( calendar1.hashCode() != calendar2.hashCode())
        {

            JOptionPane.showMessageDialog(null,"Calendars hashes aren't equal", "Error !!", ERROR_MESSAGE);// a dialog massage will appear if the hash code of calendar1 does not equal claendar2 hash

        }
        //SwingCalendar sc = new SwingCalendar();
        //Util.Logger.log("Object HC: " + gitInstance().hashCode()); // Log Calender hash code
    }


}
