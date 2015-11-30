package p1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

public class Addition extends JPanel {

    private String numString;
    private int numInt;
    private int val1;
    private int val2;
    private int val3;
    private int val4;
    private int total;

    public Addition() {

        MigLayout mg = new MigLayout("wrap", "[grow]", "[][][][][][][][][]");
        setLayout(mg);
        setSize(400, 400);
        ///////////////////////////////Labels//////////////////////
        JLabel numLabel = new JLabel("How many values do you want to add ?");
        JLabel val1Lbl = new JLabel("Enter Value 1");
        JLabel val2Lbl = new JLabel("Enter Value 2");
        JLabel val3Lbl = new JLabel("Enter Value 3");
        JLabel val4Lbl = new JLabel("Enter Value 4");
        ///////////////////////////Text Fields/////////////////////
        JTextField txtFieldNum = new JTextField();
        JTextField txtFieldVal1 = new JTextField();
        JTextField txtFieldVal2 = new JTextField();
        JTextField txtFieldVal3 = new JTextField();
        JTextField txtFieldVal4 = new JTextField();
        JTextField txt1 = new JTextField();
        JTextField txt2 = new JTextField();
        JTextField txt3 = new JTextField();
        JTextField txt4 = new JTextField();
        JTextField txt5 = new JTextField();
        JTextField txt6 = new JTextField();
        JTextField txt7 = new JTextField();
        JTextField txt8 = new JTextField();
        JTextField txt9 = new JTextField();
        JTextField txtFieldResult = new JTextField();
        /////////////////////////Buttons///////////////////////////
        JButton addBtn = new JButton("Enter Numbers");
        JButton showBtn = new JButton("Show me hows its done!");
        JButton calcBtn = new JButton("Calculate");
        ///////////////////////Add components///////////////////////
        add(numLabel, "split 3,left");
        add(txtFieldNum, "left,grow");
        add(addBtn, "left,wrap");
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numInt = Integer.parseInt(txtFieldNum.getText());
                for (int x = 0; x < numInt; x++) {
                    if (x == 0) {
                        add(val1Lbl, "split 2,left");
                        add(txtFieldVal1, "left,wrap,grow");
                    } else if (x == 1) {
                        add(val2Lbl, "split 2,left");
                        add(txtFieldVal2, "left,wrap,grow");
                    } else if (x == 2) {
                        add(val3Lbl, "split 2,left");
                        add(txtFieldVal3, "left,wrap,grow");
                    } else if (x == 3) {
                        add(val4Lbl, "split 2,left");
                        add(txtFieldVal4, "left,wrap,grow");
                    }
                }
                add(calcBtn, "center,wrap");
                calcBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        for (int x = 0; x < numInt; x++) {
                            if (x == 0) {
                                val1 = Integer.parseInt(txtFieldVal1.getText());
                                total = val1;
                            } else if (x == 1) {
                                val1 = Integer.parseInt(txtFieldVal1.getText());
                                val2 = Integer.parseInt(txtFieldVal2.getText());
                                total = val1 + val2;
                            } else if (x == 2) {
                                val1 = Integer.parseInt(txtFieldVal1.getText());
                                val2 = Integer.parseInt(txtFieldVal2.getText());
                                val3 = Integer.parseInt(txtFieldVal3.getText());
                                total = val1 + val2 + val3;
                            } else if (x == 3) {
                                val1 = Integer.parseInt(txtFieldVal1.getText());
                                val2 = Integer.parseInt(txtFieldVal2.getText());
                                val3 = Integer.parseInt(txtFieldVal3.getText());
                                val4 = Integer.parseInt(txtFieldVal4.getText());
                                total = val1 + val2 + val3 + val4;
                            }
                        }
                        add(new JLabel("Result:"), "split 2,left");
                        add(txtFieldResult, "left,grow,wrap");
                        //txtFieldResult.setText(val1+" + "+val2+" + "+val3+" + "+val4+" = "+total);
                        txtFieldResult.setText("" + total);
                        add(showBtn, "center,wrap");
                        showBtn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                for (int x = 0; x < numInt; x++) {
                                    if (x == 0) {
                                        add(txt1, "split 3,center");
                                        txt1.setText("" + val1);
                                        txt1.setEditable(false);
                                        add(txt2, "center");
                                        txt2.setText(" = ");
                                        txt2.setEditable(false);
                                        add(txt3, "center");
                                        txt3.setText("" + total);
                                        txt3.setEditable(false);
                                    } else if (x == 1) {
                                        add(txt1, "split 5,center");
                                        txt1.setText("" + val1);
                                        txt1.setEditable(false);
                                        add(txt2, "center");
                                        txt2.setText(" + ");
                                        txt2.setEditable(false);
                                        add(txt3, "center");
                                        txt3.setText("" + val2);
                                        txt3.setEditable(false);
                                        add(txt4, "center");
                                        txt4.setText(" = ");
                                        txt4.setEditable(false);
                                        add(txt5, "center");
                                        txt5.setText("" + total);
                                        txt5.setEditable(false);
                                    } else if (x == 2) {
                                        add(txt1, "split 7,center");
                                        txt1.setText("" + val1);
                                        txt1.setEditable(false);
                                        add(txt2, "center");
                                        txt2.setText(" + ");
                                        txt2.setEditable(false);
                                        add(txt3, "center");
                                        txt3.setText("" + val2);
                                        txt3.setEditable(false);
                                        add(txt4, "center");
                                        txt4.setText(" + ");
                                        txt4.setEditable(false);
                                        add(txt5, "center");
                                        txt5.setText("" + val3);
                                        txt5.setEditable(false);
                                        add(txt6, "center");
                                        txt6.setText(" = ");
                                        txt6.setEditable(false);
                                        add(txt7, "center");
                                        txt7.setText("" + total);
                                        txt7.setEditable(false);
                                    } else if (x == 3) {
                                        add(txt1, "split 9,center");
                                        txt1.setText("" + val1);
                                        txt1.setEditable(false);
                                        add(txt2, "center");
                                        txt2.setText(" + ");
                                        txt2.setEditable(false);
                                        add(txt3, "center");
                                        txt3.setText("" + val2);
                                        txt3.setEditable(false);
                                        add(txt4, "center");
                                        txt4.setText(" + ");
                                        txt4.setEditable(false);
                                        add(txt5, "center");
                                        txt5.setText("" + val3);
                                        txt5.setEditable(false);
                                        add(txt6, "center");
                                        txt6.setText(" + ");
                                        txt6.setEditable(false);
                                        add(txt7, "center");
                                        txt7.setText("" + val4);
                                        txt7.setEditable(false);
                                        add(txt8, "center");
                                        txt8.setText(" = ");
                                        txt8.setEditable(false);
                                        add(txt9, "center");
                                        txt9.setText("" + total);
                                        txt9.setEditable(false);
                                    }
                                }
                            }
                        });
                    }
                });
            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Addition().setVisible(true);
            }
        });
    }
}
