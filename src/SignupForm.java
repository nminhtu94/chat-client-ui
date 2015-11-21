import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupForm extends JFrame {
    private JTextField usernameTxf;
    private JButton signupBtn;
    private JPanel signupLyt;
    private JLabel passwordLbl;
    private JPasswordField passwordTxf;
    private JLabel usernameLbl;
    private JPanel rootPanel;
    private JButton cancelBtn;

    public SignupForm() {
        super("Chat App");
        setContentPane(rootPanel);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        signupBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Add event for signup.
            }
        });

        cancelBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Add extra event for cancel.
                NavigationController.getInstance().popFrame();
            }
        });
    }
}
