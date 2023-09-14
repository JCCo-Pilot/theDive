import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.*;
import javax.swing.*;
import java.io.File;
import javax.imageio.ImageIO;
public class MyPanel extends JPanel{
    private BufferedImage tierBlank;
    private BufferedImage playerIcon;
    private int playerPos;
    public MyPanel(){
        playerPos = 0;
        try{
            playerIcon = ImageIO.read(new File("player1.png"));
            tierBlank = ImageIO.read(new File("tierBlank.png"));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(tierBlank,150,100,100,100,null);
        g.drawImage(tierBlank,250,100,100,100,null);
        g.drawImage(tierBlank,350,100,100,100,null);
        g.drawImage(tierBlank,450,100,100,100,null);
        g.drawImage(tierBlank,550,100,100,100,null);
        g.drawImage(tierBlank,650,100,100,100,null);
        g.drawImage(tierBlank,750,100,100,100,null);
        g.drawImage(tierBlank,850,100,100,100,null);
        g.drawImage(tierBlank,950,100,100,100,null);
        g.drawImage(tierBlank,1050,100,100,100,null);
        if (playerPos==0){
            g.drawImage(playerIcon,100,100,100,100,null);
        }else if (playerPos==1){
            g.drawImage(playerIcon,150,100,100,100,null);
        }else if (playerPos==2){
            g.drawImage(playerIcon,250,100,100,100,null);
        }else if (playerPos==3){
            g.drawImage(playerIcon,350,100,100,100,null);
        }else if (playerPos==4){
            g.drawImage(playerIcon,450,100,100,100,null);
        }else if (playerPos==5){
            g.drawImage(playerIcon,550,100,100,100,null);
        }else if (playerPos==6){
            g.drawImage(playerIcon,650,100,100,100,null);
        }else if (playerPos==7){
            g.drawImage(playerIcon,750,100,100,100,null);
        }else if (playerPos==8){
            g.drawImage(playerIcon,850,100,100,100,null);
        }else if (playerPos==9){
            g.drawImage(playerIcon,950,100,100,100,null);
        }else if (playerPos==10){
            g.drawImage(playerIcon,1050,100,100,100,null);
        }
    }
    public void refresh(int player){
        playerPos = player;
    }
}
