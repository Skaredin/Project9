import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends  JFrame implements ActionListener {
    private static JButton btn = new JButton();


    public Main()
    {

        super("Окно выбора");


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn = new JButton("Наименование кнопки");
        btn.addActionListener(this);
        btn.setActionCommand("Open");
        add(btn);
        pack();


    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String cmd = e.getActionCommand();

        if(cmd.equals("Open"))
        {
            dispose();
            new AnotherJFrame();
        }
    }

    public static void main(String[] args)
    {

        SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run()
            {


                new Main().setVisible(true);
            }

        });


    }

}