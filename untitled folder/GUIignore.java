
import javax.swing.JApplet;
import java.awt.GridLayout;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import java.awt.Choice;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.TextArea;
import java.awt.SystemColor;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class GUIignore extends JApplet {
    private final JTable table = new JTable();
    private JTable table_1;
    //private BufferedImage image;
    /**
     * Create the applet.
     */
    public GUIignore() {
        getContentPane().setLayout(null);
        table.setBackground(Color.LIGHT_GRAY);
        table.setBounds(60, 60, 660, 660);
        getContentPane().add(table);

        table_1 = new JTable();
        table_1.setBackground(Color.LIGHT_GRAY);
        table_1.setBounds(780, 60, 660, 660);
        getContentPane().add(table_1);

        JSpinner spinner = new JSpinner();
        spinner.setBounds(60, 732, 37, 28);
        getContentPane().add(spinner);

        JSpinner spinner_1 = new JSpinner();
        spinner_1.setBounds(109, 732, 37, 28);
        getContentPane().add(spinner_1);

        JToggleButton tglbtnVertical = new JToggleButton("Vertical");
        tglbtnVertical.setBounds(158, 732, 91, 29);
        getContentPane().add(tglbtnVertical);

        TextArea textArea = new TextArea();
        textArea.setBackground(SystemColor.window);
        textArea.setEditable(false);
        textArea.setText("Please input where you would like your Ships to be in (X,Y) coordinate order\nand please press the \"Vertical\" button if the ship is intended to be vertical.");
        textArea.setBounds(500, 732, 500, 70);
        getContentPane().add(textArea);

        TextArea textArea_1 = new TextArea();
        textArea_1.setBackground(SystemColor.window);
        textArea_1.setEditable(false);
        textArea_1.setText("     Carrier");
        textArea_1.setBounds(109, 766, 86, 20);
        getContentPane().add(textArea_1);

        JSpinner spinner_2 = new JSpinner();
        spinner_2.setBounds(294, 731, 37, 28);
        getContentPane().add(spinner_2);

        JSpinner spinner_3 = new JSpinner();
        spinner_3.setBounds(343, 731, 37, 28);
        getContentPane().add(spinner_3);

        JToggleButton toggleButton = new JToggleButton("Vertical");
        toggleButton.setBounds(392, 731, 91, 29);
        getContentPane().add(toggleButton);

        TextArea textArea_2 = new TextArea();
        textArea_2.setText("   Battleship");
        textArea_2.setEditable(false);
        textArea_2.setBackground(SystemColor.window);
        textArea_2.setBounds(343, 766, 86, 20);
        getContentPane().add(textArea_2);

        JSpinner spinner_4 = new JSpinner();
        spinner_4.setBounds(60, 793, 37, 28);
        getContentPane().add(spinner_4);

        JSpinner spinner_5 = new JSpinner();
        spinner_5.setBounds(109, 793, 37, 28);
        getContentPane().add(spinner_5);

        JToggleButton toggleButton_1 = new JToggleButton("Vertical");
        toggleButton_1.setBounds(158, 793, 91, 29);
        getContentPane().add(toggleButton_1);

        TextArea textArea_3 = new TextArea();
        textArea_3.setText("  Submarine");
        textArea_3.setEditable(false);
        textArea_3.setBackground(SystemColor.window);
        textArea_3.setBounds(109, 827, 86, 20);
        getContentPane().add(textArea_3);

        JSpinner spinner_6 = new JSpinner();
        spinner_6.setBounds(294, 792, 37, 28);
        getContentPane().add(spinner_6);

        JSpinner spinner_7 = new JSpinner();
        spinner_7.setBounds(343, 792, 37, 28);
        getContentPane().add(spinner_7);

        JToggleButton toggleButton_2 = new JToggleButton("Vertical");
        toggleButton_2.setBounds(392, 792, 91, 29);
        getContentPane().add(toggleButton_2);

        TextArea textArea_4 = new TextArea();
        textArea_4.setText("   Destroyer");
        textArea_4.setEditable(false);
        textArea_4.setBackground(SystemColor.window);
        textArea_4.setBounds(343, 827, 86, 20);
        getContentPane().add(textArea_4);

        JSpinner spinner_8 = new JSpinner();
        spinner_8.setBounds(60, 854, 37, 28);
        getContentPane().add(spinner_8);

        JSpinner spinner_9 = new JSpinner();
        spinner_9.setBounds(109, 854, 37, 28);
        getContentPane().add(spinner_9);

        JToggleButton toggleButton_3 = new JToggleButton("Vertical");
        toggleButton_3.setBounds(158, 854, 91, 29);
        getContentPane().add(toggleButton_3);

        TextArea textArea_5 = new TextArea();
        textArea_5.setText("      Patrol");
        textArea_5.setEditable(false);
        textArea_5.setBackground(SystemColor.window);
        textArea_5.setBounds(109, 888, 86, 20);
        getContentPane().add(textArea_5);

        TextArea textArea_6 = new TextArea();
        textArea_6.setBackground(SystemColor.window);
        textArea_6.setFont(new Font("Dialog", Font.PLAIN, 45));
        textArea_6.setText(" 0");
        textArea_6.setEditable(false);
        textArea_6.setBounds(0, 60, 60, 66);
        getContentPane().add(textArea_6);

        TextArea textArea_7 = new TextArea();
        textArea_7.setBackground(SystemColor.window);
        textArea_7.setText(" 1");
        textArea_7.setFont(new Font("Dialog", Font.PLAIN, 45));
        textArea_7.setEditable(false);
        textArea_7.setBounds(0, 126, 60, 66);
        getContentPane().add(textArea_7);

        TextArea textArea_8 = new TextArea();
        textArea_8.setBackground(SystemColor.window);
        textArea_8.setText(" 2");
        textArea_8.setFont(new Font("Dialog", Font.PLAIN, 45));
        textArea_8.setEditable(false);
        textArea_8.setBounds(0, 192, 60, 66);
        getContentPane().add(textArea_8);

        TextArea textArea_9 = new TextArea();
        textArea_9.setBackground(SystemColor.window);
        textArea_9.setText(" 3");
        textArea_9.setFont(new Font("Dialog", Font.PLAIN, 45));
        textArea_9.setEditable(false);
        textArea_9.setBounds(0, 258, 60, 66);
        getContentPane().add(textArea_9);

        TextArea textArea_10 = new TextArea();
        textArea_10.setBackground(SystemColor.window);
        textArea_10.setText(" 4");
        textArea_10.setFont(new Font("Dialog", Font.PLAIN, 45));
        textArea_10.setEditable(false);
        textArea_10.setBounds(0, 324, 60, 66);
        getContentPane().add(textArea_10);

        TextArea textArea_11 = new TextArea();
        textArea_11.setBackground(SystemColor.window);
        textArea_11.setText(" 5");
        textArea_11.setFont(new Font("Dialog", Font.PLAIN, 45));
        textArea_11.setEditable(false);
        textArea_11.setBounds(0, 390, 60, 66);
        getContentPane().add(textArea_11);

        TextArea textArea_12 = new TextArea();
        textArea_12.setBackground(SystemColor.window);
        textArea_12.setText(" 6");
        textArea_12.setFont(new Font("Dialog", Font.PLAIN, 45));
        textArea_12.setEditable(false);
        textArea_12.setBounds(0, 456, 60, 66);
        getContentPane().add(textArea_12);

        TextArea textArea_13 = new TextArea();
        textArea_13.setBackground(SystemColor.window);
        textArea_13.setText(" 7");
        textArea_13.setFont(new Font("Dialog", Font.PLAIN, 45));
        textArea_13.setEditable(false);
        textArea_13.setBounds(0, 522, 60, 66);
        getContentPane().add(textArea_13);

        TextArea textArea_14 = new TextArea();
        textArea_14.setBackground(SystemColor.window);
        textArea_14.setText(" 8");
        textArea_14.setFont(new Font("Dialog", Font.PLAIN, 45));
        textArea_14.setEditable(false);
        textArea_14.setBounds(0, 588, 60, 66);
        getContentPane().add(textArea_14);

        TextArea textArea_15 = new TextArea();
        textArea_15.setBackground(SystemColor.window);
        textArea_15.setText(" 9");
        textArea_15.setFont(new Font("Dialog", Font.PLAIN, 45));
        textArea_15.setEditable(false);
        textArea_15.setBounds(0, 654, 60, 66);
        getContentPane().add(textArea_15);

        TextArea textArea_16 = new TextArea();
        textArea_16.setText(" 0");
        textArea_16.setFont(new Font("Dialog", Font.PLAIN, 47));
        textArea_16.setEditable(false);
        textArea_16.setBackground(SystemColor.window);
        textArea_16.setBounds(60, 0, 66, 60);
        getContentPane().add(textArea_16);

        TextArea textArea_17 = new TextArea();
        textArea_17.setText(" 1");
        textArea_17.setFont(new Font("Dialog", Font.PLAIN, 47));
        textArea_17.setEditable(false);
        textArea_17.setBackground(SystemColor.window);
        textArea_17.setBounds(126, 0, 66, 60);
        getContentPane().add(textArea_17);

        TextArea textArea_18 = new TextArea();
        textArea_18.setText(" 2");
        textArea_18.setFont(new Font("Dialog", Font.PLAIN, 47));
        textArea_18.setEditable(false);
        textArea_18.setBackground(SystemColor.window);
        textArea_18.setBounds(192, 0, 66, 60);
        getContentPane().add(textArea_18);

        TextArea textArea_19 = new TextArea();
        textArea_19.setText(" 3");
        textArea_19.setFont(new Font("Dialog", Font.PLAIN, 47));
        textArea_19.setEditable(false);
        textArea_19.setBackground(SystemColor.window);
        textArea_19.setBounds(258, 0, 66, 60);
        getContentPane().add(textArea_19);

        TextArea textArea_20 = new TextArea();
        textArea_20.setText(" 4");
        textArea_20.setFont(new Font("Dialog", Font.PLAIN, 47));
        textArea_20.setEditable(false);
        textArea_20.setBackground(SystemColor.window);
        textArea_20.setBounds(324, 0, 66, 60);
        getContentPane().add(textArea_20);

        TextArea textArea_21 = new TextArea();
        textArea_21.setText(" 5");
        textArea_21.setFont(new Font("Dialog", Font.PLAIN, 47));
        textArea_21.setEditable(false);
        textArea_21.setBackground(SystemColor.window);
        textArea_21.setBounds(390, 0, 66, 60);
        getContentPane().add(textArea_21);

        TextArea textArea_22 = new TextArea();
        textArea_22.setText(" 6");
        textArea_22.setFont(new Font("Dialog", Font.PLAIN, 47));
        textArea_22.setEditable(false);
        textArea_22.setBackground(SystemColor.window);
        textArea_22.setBounds(456, 0, 66, 60);
        getContentPane().add(textArea_22);

        TextArea textArea_23 = new TextArea();
        textArea_23.setText(" 7");
        textArea_23.setFont(new Font("Dialog", Font.PLAIN, 47));
        textArea_23.setEditable(false);
        textArea_23.setBackground(SystemColor.window);
        textArea_23.setBounds(522, 0, 66, 60);
        getContentPane().add(textArea_23);

        TextArea textArea_24 = new TextArea();
        textArea_24.setText(" 8");
        textArea_24.setFont(new Font("Dialog", Font.PLAIN, 47));
        textArea_24.setEditable(false);
        textArea_24.setBackground(SystemColor.window);
        textArea_24.setBounds(588, 0, 66, 60);
        getContentPane().add(textArea_24);

        TextArea textArea_25 = new TextArea();
        textArea_25.setText(" 9");
        textArea_25.setFont(new Font("Dialog", Font.PLAIN, 47));
        textArea_25.setEditable(false);
        textArea_25.setBackground(SystemColor.window);
        textArea_25.setBounds(654, 0, 66, 60);
        getContentPane().add(textArea_25);

        TextArea textArea_26 = new TextArea();
        textArea_26.setText(" 0");
        textArea_26.setFont(new Font("Dialog", Font.PLAIN, 45));
        textArea_26.setEditable(false);
        textArea_26.setBackground(SystemColor.window);
        textArea_26.setBounds(720, 60, 60, 66);
        getContentPane().add(textArea_26);

        TextArea textArea_27 = new TextArea();
        textArea_27.setText(" 1");
        textArea_27.setFont(new Font("Dialog", Font.PLAIN, 45));
        textArea_27.setEditable(false);
        textArea_27.setBackground(SystemColor.window);
        textArea_27.setBounds(720, 126, 60, 66);
        getContentPane().add(textArea_27);

        TextArea textArea_28 = new TextArea();
        textArea_28.setText(" 2");
        textArea_28.setFont(new Font("Dialog", Font.PLAIN, 45));
        textArea_28.setEditable(false);
        textArea_28.setBackground(SystemColor.window);
        textArea_28.setBounds(720, 192, 60, 66);
        getContentPane().add(textArea_28);

        TextArea textArea_29 = new TextArea();
        textArea_29.setText(" 3");
        textArea_29.setFont(new Font("Dialog", Font.PLAIN, 45));
        textArea_29.setEditable(false);
        textArea_29.setBackground(SystemColor.window);
        textArea_29.setBounds(720, 258, 60, 66);
        getContentPane().add(textArea_29);

        TextArea textArea_30 = new TextArea();
        textArea_30.setText(" 4");
        textArea_30.setFont(new Font("Dialog", Font.PLAIN, 45));
        textArea_30.setEditable(false);
        textArea_30.setBackground(SystemColor.window);
        textArea_30.setBounds(720, 324, 60, 66);
        getContentPane().add(textArea_30);

        TextArea textArea_31 = new TextArea();
        textArea_31.setText(" 5");
        textArea_31.setFont(new Font("Dialog", Font.PLAIN, 45));
        textArea_31.setEditable(false);
        textArea_31.setBackground(SystemColor.window);
        textArea_31.setBounds(720, 390, 60, 66);
        getContentPane().add(textArea_31);

        TextArea textArea_32 = new TextArea();
        textArea_32.setText(" 6");
        textArea_32.setFont(new Font("Dialog", Font.PLAIN, 45));
        textArea_32.setEditable(false);
        textArea_32.setBackground(SystemColor.window);
        textArea_32.setBounds(720, 456, 60, 66);
        getContentPane().add(textArea_32);

        TextArea textArea_33 = new TextArea();
        textArea_33.setText(" 7");
        textArea_33.setFont(new Font("Dialog", Font.PLAIN, 45));
        textArea_33.setEditable(false);
        textArea_33.setBackground(SystemColor.window);
        textArea_33.setBounds(720, 522, 60, 66);
        getContentPane().add(textArea_33);

        TextArea textArea_34 = new TextArea();
        textArea_34.setText(" 8");
        textArea_34.setFont(new Font("Dialog", Font.PLAIN, 45));
        textArea_34.setEditable(false);
        textArea_34.setBackground(SystemColor.window);
        textArea_34.setBounds(720, 588, 60, 66);
        getContentPane().add(textArea_34);

        TextArea textArea_35 = new TextArea();
        textArea_35.setText(" 9");
        textArea_35.setFont(new Font("Dialog", Font.PLAIN, 45));
        textArea_35.setEditable(false);
        textArea_35.setBackground(SystemColor.window);
        textArea_35.setBounds(720, 654, 60, 66);
        getContentPane().add(textArea_35);

        TextArea textArea_36 = new TextArea();
        textArea_36.setText(" 0");
        textArea_36.setFont(new Font("Dialog", Font.PLAIN, 47));
        textArea_36.setEditable(false);
        textArea_36.setBackground(SystemColor.window);
        textArea_36.setBounds(780, 0, 66, 60);
        getContentPane().add(textArea_36);

        TextArea textArea_37 = new TextArea();
        textArea_37.setText(" 1");
        textArea_37.setFont(new Font("Dialog", Font.PLAIN, 47));
        textArea_37.setEditable(false);
        textArea_37.setBackground(SystemColor.window);
        textArea_37.setBounds(846, 0, 66, 60);
        getContentPane().add(textArea_37);

        TextArea textArea_38 = new TextArea();
        textArea_38.setText(" 2");
        textArea_38.setFont(new Font("Dialog", Font.PLAIN, 47));
        textArea_38.setEditable(false);
        textArea_38.setBackground(SystemColor.window);
        textArea_38.setBounds(912, 0, 66, 60);
        getContentPane().add(textArea_38);

        TextArea textArea_39 = new TextArea();
        textArea_39.setText(" 3");
        textArea_39.setFont(new Font("Dialog", Font.PLAIN, 47));
        textArea_39.setEditable(false);
        textArea_39.setBackground(SystemColor.window);
        textArea_39.setBounds(978, 0, 66, 60);
        getContentPane().add(textArea_39);

        TextArea textArea_40 = new TextArea();
        textArea_40.setText(" 4");
        textArea_40.setFont(new Font("Dialog", Font.PLAIN, 47));
        textArea_40.setEditable(false);
        textArea_40.setBackground(SystemColor.window);
        textArea_40.setBounds(1044, 0, 66, 60);
        getContentPane().add(textArea_40);

        TextArea textArea_41 = new TextArea();
        textArea_41.setText(" 5");
        textArea_41.setFont(new Font("Dialog", Font.PLAIN, 47));
        textArea_41.setEditable(false);
        textArea_41.setBackground(SystemColor.window);
        textArea_41.setBounds(1110, 0, 66, 60);
        getContentPane().add(textArea_41);

        TextArea textArea_42 = new TextArea();
        textArea_42.setText(" 6");
        textArea_42.setFont(new Font("Dialog", Font.PLAIN, 47));
        textArea_42.setEditable(false);
        textArea_42.setBackground(SystemColor.window);
        textArea_42.setBounds(1176, 0, 66, 60);
        getContentPane().add(textArea_42);

        TextArea textArea_43 = new TextArea();
        textArea_43.setText(" 7");
        textArea_43.setFont(new Font("Dialog", Font.PLAIN, 47));
        textArea_43.setEditable(false);
        textArea_43.setBackground(SystemColor.window);
        textArea_43.setBounds(1242, 0, 66, 60);
        getContentPane().add(textArea_43);

        TextArea textArea_44 = new TextArea();
        textArea_44.setText(" 8");
        textArea_44.setFont(new Font("Dialog", Font.PLAIN, 47));
        textArea_44.setEditable(false);
        textArea_44.setBackground(SystemColor.window);
        textArea_44.setBounds(1308, 0, 66, 60);
        getContentPane().add(textArea_44);

        TextArea textArea_45 = new TextArea();
        textArea_45.setText(" 9");
        textArea_45.setFont(new Font("Dialog", Font.PLAIN, 47));
        textArea_45.setEditable(false);
        textArea_45.setBackground(SystemColor.window);
        textArea_45.setBounds(1374, 0, 66, 60);
        getContentPane().add(textArea_45);

        TextArea textArea_46 = new TextArea();
        textArea_46.setText("-----------------------------KEY------------------------------\nCarrier = length of 5\nBattlesh = length of 4\nSubmarine = length of 3\nDestroyer = length of 3\nPatrol = length of 2");
        textArea_46.setEditable(false);
        textArea_46.setBackground(SystemColor.window);
        textArea_46.setBounds(500, 802, 500, 106);
        getContentPane().add(textArea_46);

        JSpinner spinner_10 = new JSpinner();
        spinner_10.setBounds(1024, 732, 37, 28);
        getContentPane().add(spinner_10);

        JSpinner spinner_11 = new JSpinner();
        spinner_11.setBounds(1073, 732, 37, 28);
        getContentPane().add(spinner_11);

        TextArea textArea_47 = new TextArea();
        textArea_47.setText("Use to give coordinates for your attempted shot.");
        textArea_47.setEditable(false);
        textArea_47.setBackground(SystemColor.window);
        textArea_47.setBounds(1118, 732, 322, 28);
        getContentPane().add(textArea_47);

        JButton btnNewButton = new JButton("FIRE!");
        btnNewButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                }
            });
        btnNewButton.setBounds(1019, 766, 91, 29);
        getContentPane().add(btnNewButton);

    }
}
