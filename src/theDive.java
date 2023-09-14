import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class theDive implements ActionListener{
    JFrame frame;
    MyPanel panel;
    JPanel buttons;
    JButton dive;
    JButton surface;
    Font myFont = new Font("SansSerif", Font.BOLD, 30);
    int playerPos;
    public theDive(){
        playerPos = 0;
        panel = new MyPanel();
        dive = new JButton("Dive");
        surface = new JButton("Surface");
        surface.addActionListener(this);
        dive.addActionListener(this);
        dive.setFont(myFont);
        surface.setFont(myFont);
        panel.add(dive);
        panel.add(surface);
        frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500,500);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.add(panel);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==dive){
            int diceRoll = (int)Math.random()*3+1;
            diceRoll += (int)Math.random()*3+1;
            if (playerPos+diceRoll<11){
                playerPos+=diceRoll;
            }
        }
        if (e.getSource()==surface){
            int diceRoll = (int)Math.random()*3+1;
            diceRoll += (int)Math.random()*3+1;
            if (playerPos-diceRoll>-1){
                playerPos-=diceRoll;
            }
        }
        panel.refresh(playerPos);
        panel.repaint();
    }
}
