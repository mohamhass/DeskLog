package GUI;

import javax.swing.*;
import java.awt.*;

public class TopPanel extends JPanel {

    private JLabel title;
    private JLabel slogan;


    public TopPanel() {
        setLayout(new BorderLayout());
        title = new JLabel("DeskLog");
        slogan = new JLabel("An application that produces a video log of your computer desktop activity");
        style();
        add(title, BorderLayout.NORTH);
        add(slogan, BorderLayout.CENTER);
    }

    private void style(){
        Font fTitle = new Font("Century Gothic", Font.BOLD, 28);
        Font fSlogan = new Font("Century Gothic", Font.PLAIN, 14);
        title.setFont(fTitle);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        slogan.setFont(fSlogan);
        slogan.setHorizontalAlignment(SwingConstants.CENTER);
        setBackground(new Color(255,255,255));
    }
}
