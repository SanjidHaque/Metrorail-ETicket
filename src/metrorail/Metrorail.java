package metrorail;

import java.awt.Toolkit;


public class Metrorail 
{

    
    public static void main(String[] args)
    {
        
        Ticket ob = new Ticket();
        ob.setBounds(180, 62, 1006, 600);
        ob.setResizable(false);
        ob.setVisible(true);
        ob.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Documents\\Java's Babe\\Metrorail\\src\\metrorail\\m2.png"));
        ob.setDefaultCloseOperation(Ticket.EXIT_ON_CLOSE);
        
        
    }
    
}
