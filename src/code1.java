import java.awt.*;
import java.awt.event.*;

public class code1 {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT 範例");
        Button button = new Button("tag me！");
        Label label = new Label("");

        button.setBounds(100, 100, 80, 30);
        label.setBounds(100, 150, 200, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("why u tag me！"); 
            }
        });

        frame.add(button);
        frame.add(label);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
