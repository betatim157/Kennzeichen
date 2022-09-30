import javax.swing.*;

public class KFZGUI extends JFrame {
    private JLabel Jkfzpruefer;  //Inhalte der Gui werden deklariert
    private JPanel mainPanel;
    private JTextField textField1;
    private JLabel Jkennzeichen;
    private JButton pruefeButton;

    public KFZGUI(){
     setVisible(true);
     setTitle("KFZGUI");
     setSize(300,180);
     setResizable(true);
     Jkfzpruefer.setVisible(true);
     setContentPane(mainPanel);
     setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     KFZPruefer p = new KFZPruefer();        //KFZPruefer wird erstellt

    }
}
