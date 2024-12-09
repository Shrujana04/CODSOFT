
package quizapplication;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score,int correctansw,int incorrectansw) 
    {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);
        
        JLabel heading = new JLabel("Thankyou " + name + " for playing Quiz.");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblscore);
        
        JLabel coransw = new JLabel("Number of correct answers are " + correctansw);
        coransw.setBounds(310, 220, 400,50);
        coransw.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(coransw);
        
        JLabel incoransw = new JLabel("Number of incorrect answers are " + incorrectansw);
        incoransw.setBounds(310, 240, 500, 60);
        incoransw.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(incoransw);
        
        /*JButton submit = new JButton("Play Again");
        submit.setBounds(380, 270, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);*/
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Mainpage();
    }

    public static void main(String[] args) {
        new Score("User", 0,0,0);
    }
}
