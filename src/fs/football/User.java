package fs.football;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class User implements ActionListener
{	
	JFrame fr=new JFrame();
        
	Color clr1=new Color(211,211,211);
	Color clr2=new Color(192,192,192);
	Cursor cr=new Cursor(Cursor.HAND_CURSOR);
	Font fh=new Font("Trebuchet MS",Font.BOLD,30);
	Font fs=new Font("Trebuchet MS",Font.BOLD,13);
	Font fl=new Font("Trebuchet MS",Font.BOLD,14);
	Font fi=new Font("Trebuchet MS",Font.ITALIC,12);
	Container c=fr.getContentPane();
	JLabel lbl1=new JLabel();
	JLabel lbl2=new JLabel();
	JLabel lbl3=new JLabel();
	JLabel lbl4=new JLabel();
	JTextField txt=new JTextField();
	JPasswordField pass=new JPasswordField();
	JButton btn=new JButton();
	JButton btn1=new JButton();
        JLabel b5 =new JLabel();
        public static String user;
	
	public void usr()
	{
		
             Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setBounds(0, 0, (int) dim.getWidth(), (int) dim.getHeight());
               System.out.println(dim.getHeight());
               System.out.println(dim.getWidth());
                fr.setTitle("User Login");
		fr.setResizable(true);
		c.setBackground(clr1);
		c.setLayout(null);
		lbl1.setBounds(30,30,350,50);
		lbl1.setText("User Login");
		lbl1.setFont(fh);
		lbl1.setForeground(Color.WHITE);
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setBounds(33,192,110,25);
		lbl2.setText("Password:");
		lbl2.setForeground(Color.WHITE);
		lbl2.setFont(fs);
		lbl2.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl3.setBounds(33,130,110,25);
		lbl3.setText("Username:");
		lbl3.setForeground(Color.WHITE);
		lbl3.setFont(fs);
		lbl3.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl4.setBounds(68,305,275,28);
		lbl4.setText("If you don't have an existing Account");	
		lbl4.setFont(fs);
		lbl4.setForeground(Color.WHITE);
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
                b5.setIcon(new ImageIcon("C:\\Users\\RISHI\\Desktop\\FSproject\\us3.jpg"));
                b5.setBounds(430,120,435,420);
               
    b5.setBounds(0, 0, (int) dim.getWidth(), (int) dim.getHeight());
   
               
                
fr.setExtendedState(JFrame.MAXIMIZED_BOTH); 
//fr.setUndecorated(true);
//fr.setVisible(true);
        
	
	 	txt.setBounds(194,127,155,30);
		txt.setFont(fs);
		txt.setForeground(Color.BLACK);
		pass.setBounds(194,190,155,30);
		pass.setFont(fs);
		pass.setEchoChar('*');	
		pass.setForeground(Color.BLACK);
		btn.setBounds(155,255,100,28);
		btn.setText("Log In");
		btn.setFont(fl);
		btn.setBackground(clr2);
		btn.setForeground(Color.BLACK);
		btn.setCursor(cr);
		btn.addActionListener(this);
		btn1.setBounds(117,336,175,28);
		btn1.setText("Create a New Account");
		btn1.setBackground(clr2);
		btn1.setForeground(Color.BLACK);
		btn1.setCursor(cr);
		btn1.addActionListener(this);
		c.add(lbl1);
		c.add(lbl2);
		c.add(lbl3);
		c.add(lbl4);
		c.add(txt);
		c.add(pass);
		c.add(btn);
		c.add(btn1);
		c.add(b5);
		fr.setVisible(true);
	}	
	public void actionPerformed(ActionEvent evt)
	{
		
			if(evt.getSource()==btn)
		{               
                        
                                String username,password;
                            
				username=txt.getText();
                                password=pass.getText();
                                File file = new File("C:\\Users\\RISHI\\Desktop\\Fsproject\\login.txt");
                                Path p =Paths.get("C:\\Users\\RISHI\\Desktop\\Fsproject\\login.txt");
                        
                                String[] var = null;
                                try
                                {
                                    if(file.exists())
                                    {
                                       Charset charset = Charset.forName("US-ASCII");
                                        try
                                            
                                        {  
                                                   
                                                   BufferedReader reader = Files.newBufferedReader(p,charset);
                                                   
                                                   while(file.exists())
                                                   {
                                                   String text = reader.readLine();
                                                   String[] strArray = text.split(" ");
                                                  // System.out.println(Arrays.toString(strArray));
                                                       System.out.println(strArray[0]);
                                                   StringBuffer s= new StringBuffer();
                                                   for (int i = 0; i < strArray.length; i++) 
                                                   {
                                                       //System.out.print(strArray[i]);
                                                       
                                                   }
                                                    Component login = null;
                                                    int u=0,pas=0;
                                                    System.out.println(s);
                                                  for(int i=0;i<strArray.length;i++)
                                                  {   String[] strary=strArray[i].split("!");
                                                      System.out.println(strary[0]);
                                                      if(username.equals(strary[0])){
                                                           u=1;}
                                                      if(password.equals(strary[1]))
                                                      {pas=1;
                                                      }
                                                  }
                                                  if(u==1&&pas==1){
                                                       JOptionPane.showMessageDialog(login,"login successful","alert",JOptionPane.WARNING_MESSAGE);
                                                       new UserHome();
                                                      fr.dispose();
                                                   }
                                                   else{JOptionPane.showMessageDialog(login,"please enter valid username and password","alert",JOptionPane.WARNING_MESSAGE);}
                                                   }} catch(Exception x)
                                        {
                                            System.out.println(x);
                                        }}}
                                   
                                        catch(Exception x)
                                        {
                                            System.out.println(x);
                                        }}
                        if(evt.getSource()==btn1)
                        {
                            new SignUp();
                        }
        }
        	
                                public static void main (String []args)
                                {
                                    User u=new User();
                                    
                                    u.usr();
                                }
}