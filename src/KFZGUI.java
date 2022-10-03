import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KFZGUI extends JFrame {
    private JLabel Jkfzpruefer;  //Inhalte der Gui werden deklariert
    private JPanel mainPanel;
    private JTextField textField1;
    private JLabel Jkennzeichen;
    private JButton pruefeButton;
    private boolean pruefung;

    public KFZGUI(){
     setVisible(true);
     setTitle("KFZGUI");
     setSize(300,180);
     setResizable(true);
     Jkfzpruefer.setVisible(true);
     setContentPane(mainPanel);
     setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        pruefeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pruefung = KFZPruefer.wortUntersuchen(textField1.getText());
                if(pruefung == true){
                    textField1.setBackground(Color.GREEN);
                }else{
                    textField1.setBackground(Color.RED);
                }
            }
        });
    }
}
