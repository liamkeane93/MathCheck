package p1;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Subtraction extends JPanel {

    private int valueEntered1;
    private int valueEntered2,ans;
    private int number;

    public Subtraction() {
        MigLayout mg = new MigLayout("");
        setLayout(mg);
        setSize(400, 400);

        JLabel title = new JLabel("Math check subtraction lets you visualize how subtraction is done!");
        title.setBackground(Color.yellow);
        title.setOpaque(true);
        title.setBorder(BorderFactory.createEtchedBorder());

        JLabel var1Label = new JLabel("Enter Value1");
        JTextField value1 = new JTextField(8);

        JLabel var2Label = new JLabel("Enter Value2");
        JTextField value2 = new JTextField(8);

        JButton calculate = new JButton("Calculate");

        JTextArea firstEntered = new JTextArea(2, 3);

        JLabel minus = new JLabel("Minus");

        JTextArea secondEntered = new JTextArea(2, 3);

        JLabel equals = new JLabel("Equals");

        JTextArea answer = new JTextArea(2, 3);

        JTextArea square1= new JTextArea(2,3);

        JButton howToDo = new JButton("Show me how its done:");
        JLabel weHad = new JLabel("We Had: ");

        add(title, "split3,center, wrap");

        add(var1Label, "split 2, sg a");
        add(value1, "wrap");

        add(var2Label, "split 7, sg a");
        add(value2, "wrap");

        add(calculate, "");
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueEntered1 = Integer.parseInt(value1.getText());
                valueEntered2 = Integer.parseInt(value2.getText());
                ans = valueEntered1 - valueEntered2;

                add(firstEntered, "");
                firstEntered.setBorder(BorderFactory.createEtchedBorder());
                firstEntered.setText("" + valueEntered1);
                firstEntered.setEditable(false);
                add(minus);

                add(secondEntered, "");
                secondEntered.setBorder(BorderFactory.createEtchedBorder());
                secondEntered.setText("" + valueEntered2);
                secondEntered.setEditable(false);
                add(equals);

                add(answer, "");
                answer.setBorder(BorderFactory.createEtchedBorder());
                answer.setText("" + ans);
                answer.setEditable(false);
                add(answer, "wrap");

                add(howToDo, "wrap");
            }
        });

        howToDo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                add(weHad, "wrap");
                number = Integer.parseInt(value1.getText());

                for(int i=0; i<number; i++)
                {
                    JTextArea square2 = new JTextArea(2,3);
                    add(square2,"split 10");
                    square2.setBackground(Color.blue);
                    square2.setOpaque(true);
                    square2.setEditable(false);

                    

                }

                number = Integer.parseInt(value2.getText());
                for (int i=0; i<number;i++){
                    JTextArea square3 = new JTextArea(2,3);
                    add(square3,"split 10");
                    square3.setBackground(Color.blue);
                    square3.setOpaque(true);
                    square3.setEditable(false);


                }

            }
        });
    }
}
