package fs.football;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Desktop;
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


public class SignUp extends User implements ActionListener
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
	JLabel lbl5=new JLabel();
	JLabel lbl6=new JLabel();
	JLabel lbl7=new JLabel();
		
	JTextField txt1=new JTextField();
	JTextField txt2=new JTextField();
	JTextField txt3=new JTextField();
	JTextField txt4=new JTextField();
	JPasswordField pass=new JPasswordField();
	JLabel wal=new JLabel();	
	JButton btn=new JButton();
	JButton btn1=new JButton();
	JButton btn2=new JButton();
	
	
	
	public SignUp() 
	{
                                             Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

				fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setBounds(0, 0, (int) dim.getWidth(), (int) dim.getHeight());
               fr.setTitle("User Sign Up");
				fr.setResizable(true);
			
				c.setBackground(clr1);
				c.setLayout(null);
		
			lbl1.setBounds(57,30,350,50);
			lbl1.setText("User Sign Up");
			lbl1.setFont(fh);
			lbl1.setForeground(Color.WHITE);
			lbl1.setHorizontalAlignment(SwingConstants.CENTER);
			lbl2.setBounds(75,125,100,30);
			lbl2.setText("First Name:");
			lbl2.setFont(fs);
			lbl2.setForeground(Color.WHITE);
			lbl2.setHorizontalAlignment(SwingConstants.RIGHT);
			lbl3.setBounds(75,195,100,30);
			lbl3.setText("Last Name:");
			lbl3.setFont(fs);
			lbl3.setForeground(Color.WHITE);
			lbl3.setHorizontalAlignment(SwingConstants.RIGHT);
			lbl4.setBounds(75,335,100,30);
			lbl4.setText("Username:");
			lbl4.setFont(fs);
			lbl4.setForeground(Color.WHITE);
			lbl4.setHorizontalAlignment(SwingConstants.RIGHT);
			lbl5.setBounds(75,405,100,30);
			lbl5.setText("Password:");
			lbl5.setFont(fs);
			lbl5.setForeground(Color.WHITE);
			lbl5.setHorizontalAlignment(SwingConstants.RIGHT);
			lbl6.setBounds(75,265,100,30);
			lbl6.setText("Mobile Number:");
			lbl6.setFont(fs);
			lbl6.setForeground(Color.WHITE);
			lbl6.setHorizontalAlignment(SwingConstants.RIGHT);
			lbl7.setBounds(96,510,275,30);
			lbl7.setText("If you already have an Account");
			lbl7.setFont(fi);
			lbl7.setForeground(Color.WHITE);
			lbl7.setHorizontalAlignment(SwingConstants.CENTER);
                        wal.setIcon(new ImageIcon("C:\\Users\\RISHI\\Desktop\\FSproject\\sign.jpg"));
		wal.setBounds(0, 0, (int) dim.getWidth(), (int) dim.getHeight());
                
			txt1.setBounds(245,123,133,30);
			txt1.setFont(fs);
			txt1.setForeground(Color.BLACK);
			txt1.setHorizontalAlignment(SwingConstants.LEFT);
			txt2.setBounds(245,193,133,30);
			txt2.setFont(fs);
			txt2.setForeground(Color.BLACK);
			txt2.setHorizontalAlignment(SwingConstants.LEFT);
			txt3.setBounds(245,263,133,30);
			txt3.setFont(fs);
			txt3.setForeground(Color.BLACK);
			txt3.setHorizontalAlignment(SwingConstants.LEFT);  
			txt3.setColumns(10);
			txt4.setBounds(245,333,133,30);
			txt4.setFont(fs);
			txt4.setForeground(Color.BLACK);
			txt4.setHorizontalAlignment(SwingConstants.LEFT);
			pass.setBounds(245,403,133,30);
			pass.setFont(fs);
			pass.setEchoChar('*');	
			pass.setForeground(Color.BLACK);
		
			txt3.addKeyListener(new KeyAdapter()
			{
				public void keyTyped(KeyEvent e)
				{
					char c = e.getKeyChar();
					if (((c < '0') || (c > '9'))
                        && (c != '\b')) 
					{
						e.consume();
					}
				}
			});
		
			btn.setBounds(120,463,100,28);
			btn.setText("Sign Up");
			btn.setBackground(clr2);
			btn.setForeground(Color.BLACK);
			btn.setFont(fl);
			btn.setCursor(cr);
			btn.addActionListener(this);
			btn1.setBounds(140,540,200,28);
			btn1.setText("Login to existing Account");
			btn1.setBackground(clr2);
			btn1.setForeground(Color.BLACK);
			btn1.setFont(fl);
			btn1.setCursor(cr);
			btn1.addActionListener(this);
			btn2.setBounds(275,463,100,28);
			btn2.setText("Clear");
			btn2.setBackground(clr2);
			btn2.setForeground(Color.BLACK);
			btn2.setFont(fl);
			btn2.setCursor(cr);
			btn2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent event)
		{
			txt1.setText("");
            txt2.setText("");
            txt3.setText(""); 			
		    txt4.setText("");
			pass.setText("");
		}});
			c.add(lbl1);
			c.add(lbl2);
			c.add(lbl3);
			c.add(lbl4);
			c.add(lbl5);
			c.add(lbl6);
			c.add(lbl7);
			c.add(txt1);
			c.add(txt2);
			c.add(txt3);
			c.add(txt4);
			c.add(pass);
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
			{
                            String username,first,last,phone,password,uname;
                                    username=txt4.getText();
                                    first=txt1.getText();
                                    last=txt2.getText();
                                    phone=txt3.getText();
                                    password=pass.getText();
                                   boolean flag=false;
                                    if(username.equals("")||password.equals("")||first.equals("")||last.equals("")||phone.equals(""))
                                {
                                    flag=true;
                                    JOptionPane.showMessageDialog(null, "All fields are required","Alert",JOptionPane.WARNING_MESSAGE);
                                }
                                try{  
                                     if(!flag)
                                     {
                                        first=first+"!";
                                        last=last+"!";
                                        phone=phone+"!";
                                     
                                        username=username+"!";
                                        password=password+" ";
                                        String line=System.lineSeparator();
                                        File file = new File("C:\\Users\\RISHI\\Desktop\\FSproject\\signup.txt");
                                        Path q =Paths.get("C:\\Users\\RISHI\\Desktop\\FSproject\\signup.txt");
                                        Path p =Paths.get("C:\\Users\\RISHI\\Desktop\\FSproject\\login.txt");
                                        byte data1[]=first.getBytes();
                                        byte data2[]=last.getBytes();
                                        byte data3[]=phone.getBytes();
                                        byte data4[]=username.getBytes();
                                        byte data5[]=password.getBytes();
                        
                                        byte data6[]="\n".getBytes();
                                        byte data7[]=line.getBytes();
                                        
                                        try (OutputStream out = new BufferedOutputStream(
                                        Files.newOutputStream(q, CREATE, APPEND))) 
                                        {
                                            
                                            out.write(data1, 0, data1.length);
                                            out.write(data6, 0, data6.length);
                                             out.write(data2, 0, data2.length);
                                              out.write(data6, 0, data6.length);
                                             out.write(data3, 0, data3.length);
                                              out.write(data6, 0, data6.length);
                                          out.write(data4, 0, data4.length); 
                                           out.write(data6, 0, data6.length);
                                           out.write(data5, 0, data5.length);
                                           out.write(data6, 0, data6.length);
                                           JOptionPane.showMessageDialog(null, "USER SIGNED UP SUCCESSFULLY");
                                          
                                            //out.write(data5, 0, data5.length);
                                            //out.write(data3, 0, data3.length);
                                           // out.write(data6, 0, data6.length);
                                           // out.write(data3, 0, data3.length);
                                        }         catch (IOException x) 
                                        {
                                            System.err.println(x);
                                        }
                                        try (OutputStream out = new BufferedOutputStream(
                                        Files.newOutputStream(p, CREATE, APPEND))) 
                                        {
                                            
                                            out.write(data4, 0, data4.length);
                                            //out.write(data3, 0, data3.length);
                                            out.write(data5, 0, data5.length);
                                            //out.write(data7, 0, data7.length);
                                            //out.write(data3, 0, data3.length);
                                        } 
                                        catch (IOException x) 
                                        {
                                            System.err.println(x);
                                        }}}
                                      catch(Exception exc)
            {
              System.out.println(exc);
            }}
				
				
				
			try
			{
				if(evt.getSource()==btn1)
			{
				fr.dispose();
				User us = new User();
				us.usr();
			}}
			catch(NullPointerException ex)
			{}
		}
		catch(Exception exc)
            {
              System.out.println(exc);
            }
		
        }
               

	
	public static void main(String[] args)
	{
		new SignUp();
	}
}