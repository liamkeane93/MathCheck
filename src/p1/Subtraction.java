package p1;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class Subtraction extends JPanel {

    public Subtraction(){
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

        JTextArea value11 = new JTextArea(2,3);

        JLabel minus = new JLabel("Minus");

        JLabel equals = new JLabel("Minus");



        add(title, "split3,center, wrap");

        add(var1Label,"split 2, sg a");
        add(value1,"wrap");

        add(var2Label,"split 4, sg a");
        add(value2,"");

        add(value11,"");
        value11.setBorder(BorderFactory.createEtchedBorder());
        add(minus);

        //add(getImageButton("minus.png",""));







    }
    private JButton getImageButton(String imagePath, String text) {
        java.net.URL imgURL = getClass().getResource(imagePath);
        JButton button = new JButton(text,new ImageIcon(imgURL));
        return button;
    }

}
