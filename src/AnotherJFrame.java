import javax.swing.*;
import java.security.PublicKey;
import java.util.Stack;

public class AnotherJFrame extends JFrame {


    public void main(String[] ear)
    {
        getFrame ();
        add(new JTextField("Наимекнование Текстового поля", 32));

    }

    static JFrame getFrame (){
        JFrame jFrame= new JFrame();
        jFrame.setVisible(true);
        jFrame.setBounds(750,250,500,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }

}
