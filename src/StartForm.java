import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartForm extends JFrame {
    private JTextField usernameTxf;
    private JPanel rootPanel;
    private JLabel usernameLbl;
    private JLabel passwordLbl;
    private JPasswordField passwordField1;
    private JPanel passwordLyt;
    private JPanel usernameLyt;
    private JButton loginBtn;
    private JButton signupBtn;

    public StartForm() {
        super("Chat App");
        setContentPane(rootPanel);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Add event for login button.
                goToChat();
            }
        });

        signupBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Add extra event for signup.
                goToSignup();
            }
        });
    }

    private void goToSignup() {
        SignupForm signupForm = new SignupForm();
        NavigationController.getInstance().pushFrame(signupForm);
    }

    private void goToChat() {
        ChatForm chatForm = new ChatForm();
        NavigationController.getInstance().pushFrame(chatForm);
    }
}
