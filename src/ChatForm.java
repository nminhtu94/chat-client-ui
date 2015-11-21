import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ChatForm extends JFrame {
    private JList userList;
    private JPanel rootPanel;
    private JSplitPane splitPaneVertical;
    private JTextArea chatTxa;
    private JTextField inputTxt;
    private JButton sendBtn;
    private JSplitPane splitPaneHorizontal;
    private JScrollPane userScrollPane;

    public ChatForm() {
        super("Chat App");
        setContentPane(rootPanel);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        userList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        userList.setVisibleRowCount(-1);
        userList.setLayoutOrientation(JList.VERTICAL);

        // TODO: Apply list data with user objects and customize in UserCell.
        ArrayList<String> data = new ArrayList<String>();

        for (Integer i = 1; i < 20; i++) {
            data.add(i.toString());
        }

        userList.setCellRenderer(new UserCell());
        userList.setListData(data.toArray());

        System.out.println(userList.getSize().height);

        userList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting() == false) {
                    if (userList.getSelectedIndex() == -1) {
                        // TODO: Handling unselect.

                    } else {
                        // TODO: Start a chat session with a user.
                        System.out.println("Selected index: " + userList.getSelectedIndex());
                    }
                }
            }
        });

        sendBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = inputTxt.getText();

                if (!text.trim().equalsIgnoreCase("")) {
                    sendMessage(text);
                }
            }
        });
    }

    private void sendMessage(String text) {
        // TODO: Implement sending message.
    }
}
