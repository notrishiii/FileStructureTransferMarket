package fs.football;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Fpage extends JFrame implements ActionListener {
    JFrame fr=new JFrame();
    ImageIcon icon=new ImageIcon();
    Color clr1=new Color(211,211,211);
    	 Color clr2=new Color(211,211,211);
	Cursor cr=new Cursor(Cursor.HAND_CURSOR);
		
	Font fh=new Font("Trebuchet MS",Font.BOLD,30);
	Font fl=new Font("Trebuchet MS",Font.BOLD,14);
		
	Container c=fr.getContentPane();
		
	JLabel lbl1=new JLabel(icon);
  
	JLabel wal=new JLabel();		
	JButton btn=new JButton();
	JButton btn1=new JButton();
	JButton btn2=new JButton();
	
    
public Fpage()
	{
             Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
				fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fr.setBounds(0,0,(int) dim.getWidth(),(int) dim.getHeight());
				fr.setTitle("Home Page");
				fr.setResizable(true);
                             
                                fr.add(lbl1);
			
				
				c.setLayout(null);
				
				lbl1.setBounds(57,40,500,100);
				lbl1.setText("Home");
				lbl1.setFont(fh);
				lbl1.setForeground(Color.WHITE);
				lbl1.setHorizontalAlignment(SwingConstants.CENTER);
				
				btn.setBounds(150,195,125,50);
				btn.setText("Admin Login");
				btn.setBackground(clr2);
				btn.setForeground(Color.BLACK);
				btn.setFont(fl);
				btn.setCursor(cr);
				btn.addActionListener(this);
				
				btn1.setBounds(150,295,125,50);
				btn1.setText("User Login");
				btn1.setBackground(clr2);
				btn1.setForeground(Color.BLACK);
				btn1.setFont(fl);
				btn1.setCursor(cr);
				btn1.addActionListener(this);
				
				btn2.setBounds(150,395,125,50);
				btn2.setText("User Sign up");
				btn2.setBackground(clr2);
				btn2.setForeground(Color.BLACK);
				btn2.setFont(fl);
				btn2.setCursor(cr);
				btn2.addActionListener(this);
				
                                
                                
                                wal.setIcon(new ImageIcon("C:\\Users\\RISHI\\Desktop\\FSproject\\hp3.jpg"));
				wal.setBounds(0, 0,(int)dim.getWidth(),(int) dim.getHeight());
                                wal.setOpaque(false);
                                c.add(lbl1);
				c.add(btn);
				c.add(btn1);
				c.add(btn2);
				c.add(wal);
				fr.setVisible(true);
}
public void actionPerformed(ActionEvent evt)
	{
		try
		{
			if(evt.getSource()==btn)
                           new Admin();
		{
			
			
		}
		
		if(evt.getSource()==btn1)
		{
                    User obbj =new User();
			obbj.usr();
                    
			
		}
		
		if(evt.getSource()==btn2)
		{
                    new SignUp();
			fr.dispose();
			
		}
		}
		catch(Exception e)
		{}
	}
	
	public static void main(String [] args)
	{
            new Fpage();
		
	}
}