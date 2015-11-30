package p1;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;

public class Subtraction extends JPanel {

    public Subtraction(){
        MigLayout mg = new MigLayout("");
        setLayout(mg);
        setSize(400, 400);

        JLabel title = new JLabel("Math check subtraction lets you visualize how subtraction is done!");
        JLabel var1Label = new JLabel("Enter Value1");
        JTextField value1 = new JTextField(8);
        JLabel var2Label = new JLabel("Enter Value2");
        JTextField value2 = new JTextField(8);

        add(title, "split2,right, wrap");

        add(var1Label,"split 2, sg a");
        add(value1,"wrap");

        add(var2Label,"split 2, sg a");
        add(value2,"wrap");







    }

}
