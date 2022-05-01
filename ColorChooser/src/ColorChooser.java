import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ColorChooser extends JFrame implements ActionListener {

    JButton button;
    JLabel label;


    ColorChooser() {

        button = new JButton("Choose Color");
        button.setFocusable(false);
        button.addActionListener(this);
        label = new JLabel("JColorChooser");
        label.setFont(new Font("MyFont",Font.TYPE1_FONT,100));

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {

            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null,"ColorChooser",Color.WHITE);

            label.setForeground(color);

        }
    }
}
