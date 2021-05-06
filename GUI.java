
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



/**
 *
 * @author markose aycheh
 */
public class GUI implements ActionListener {
    
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;
    

    
    public static void main(String[] args) {

       JPanel panel = new JPanel();
       
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(panel);
        
        panel.setLayout(null);
        
        userLabel = new JLabel("CENTRAL INTELEGENCE AGENCY");
        userLabel.setBounds(110, 20, 260, 25);
        panel.add(userLabel);
        
        userLabel = new JLabel("INTER NAME");
        userLabel.setBounds(140, 50, 260, 25);
        panel.add(userLabel);
        
        userText = new JTextField();
        userText.setBounds(60, 80, 260, 25);
        panel.add(userText);
        
        passwordLabel = new JLabel("INTER PASSWORD TO ACCESS TERMINAL");
        passwordLabel.setBounds(60, 110, 260, 25);
        panel.add(passwordLabel);
        
        //make the password invisible
        passwordText = new JPasswordField();
        passwordText.setBounds(60, 140, 260, 25);
        panel.add(passwordText);
        
        button = new JButton("Enter");
        button.setBounds(135, 170, 120, 25);
        button.addActionListener(new GUI());
        panel.add(button);
        
        success = new JLabel("");
        success.setBounds(25, 235, 400, 25);
        panel.add(success);
        
      
        
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        
        
        if(user.equals("Job") && password.equals("123")){
          success.setText("Login Successful! now you can send and receive messages.");
        }
    }
    
}
