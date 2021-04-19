import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
public MyWindow(){
    setVisible(true); //Method from JFrame - create the window (0:0)
    setSize(500, 500);
    setLocation(400, 150);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    //setResizable(false);

    JButton firstButton = new JButton("Exit");
    ActionListener listener = new CloseActionListener();
    firstButton.addActionListener(listener); //переопределение метода
    //add(firstButton, BorderLayout.NORTH);

    JButton secondButton = new JButton("Button2");
    //add(secondButton, BorderLayout.SOUTH);

    JPanel panel = new JPanel(new GridLayout(1,2));
    panel.add(firstButton);
    panel.add(secondButton);

    add(panel, BorderLayout.SOUTH);

}

}
