package p1;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Multiplication extends JPanel
{
    private int result,val1,val2;
    public Multiplication()
    {

        MigLayout mg = new MigLayout("wrap", "[grow]", "[][][][][][][]");
        setLayout(mg);
        setSize(400, 400);
        ////////////////Labels////////////////////////////
        JLabel lblVal1 = new JLabel("Enter Value 1:");
        JLabel lblVal2 = new JLabel("Enter Value 2:");
        JLabel hadlbl = new JLabel("We had:");
        JLabel tooklbl = new JLabel("We Took:");
        JLabel havelbl = new JLabel("We have:");
        ////////////////Text Fields//////////////////////
        JTextField txtVal1 = new JTextField();
        JTextField txtVal2 = new JTextField();
        JTextField txt1 = new JTextField();
        JTextField txt2 = new JTextField();
        JTextField txt3 = new JTextField();
        JTextField txt4 = new JTextField();
        JTextField txt5 = new JTextField();
        ////////////////////Buttons/////////////////////
        JButton subBtn = new JButton("Multiply");
        JButton showBtn = new JButton("Show me how its done!!");
        ///////////////////Components added//////////////////
        add(lblVal1,"split 2,left");
        add(txtVal1,"left,wrap,grow");
        add(lblVal2,"split 2,left");
        add(txtVal2,"left,wrap,grow");
        add(subBtn,"center,wrap");
        subBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val1 = Integer.parseInt(txtVal1.getText());
                val2 = Integer.parseInt(txtVal2.getText());
                result = val1 * val2;
                add(txt1,"split 5,center");
                txt1.setText("" + val1);
                txt1.setEditable(false);
                add(txt2,"center");
                txt2.setText(" X ");
                txt2.setEditable(false);
                add(txt3,"center");
                txt3.setText("" + val2);
                txt3.setEditable(false);
                add(txt4,"center");
                txt4.setText(" = ");
                txt4.setEditable(false);
                add(txt5,"center,wrap");
                txt5.setText("" + result);
                txt5.setEditable(false);
                add(showBtn,"center,wrap");
                showBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        add(hadlbl,"split 3,left,wrap");
                        add(tooklbl,"split 3,left,wrap");
                        add(havelbl,"split 3,left,wrap");
                    }
                });
            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try
                {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                }
                catch(Exception e)
                {

                }
                new Multiplication().setVisible(true);
            }
        });
    }
}
