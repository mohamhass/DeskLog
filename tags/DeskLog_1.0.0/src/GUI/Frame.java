package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.Image;


public class Frame extends JFrame {
    public Frame() {
        setUpFrame();
    }

    public void setUpFrame() {
        setLayout(new BorderLayout());
        setTitle("Desklog");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        setSize(600, 500); //Compatibility for MAC as aw16387 is using Macbook
        setLocation(100, 100);
        addPanels();
        setMinimumSize(new Dimension(600, 600));
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }

    public void addPanels() {
        Image icon = Toolkit.getDefaultToolkit().getImage(".\\src\\GUI\\images\\icon.png");
        setIconImage(icon);//Frame should set the logo to the icon.png file but has yet to be completed.
        TopPanel top = new TopPanel();
        MiddlePanel middle = new MiddlePanel();
        BottomPanel bottom = new BottomPanel();
        //3 panels inside a panel, the sub-panels are converted to local variables.
        add(top, BorderLayout.NORTH);
        add(middle, BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);
        setVisible(true);
        setBackground(new Color(255,255,255));
    }
}
