package fs.football;
import javax.swing.*;
import java.awt.*;
import java.awt.Component;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import javax.swing.JOptionPane;
import java.awt.event.*;

public class Admin implements ActionListener
{
       
        public String username;
        JFrame fr=new JFrame();
	Color clr1=new Color(211,211,211);
	Color clr2=new Color(192,192,192);
	JTextField txt1=new JTextField();
	JPasswordField pass=new JPasswordField();
	JLabel lbl=new JLabel();	
	JLabel lbl1=new JLabel();	
	JLabel lbl2=new JLabel();	
	JButton btn=new JButton();
        JLabel wal=new JLabel();
	Cursor cr=new Cursor(Cursor.HAND_CURSOR);
	Font fh=new Font("Trebuchet MS",Font.BOLD,30);
	Font fs=new Font("Trebuchet MS",Font.BOLD,13);
	Container c=fr.getContentPane();
	
		public Admin()
	{   
            
            
              
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setBounds(0, 0, (int) dim.getWidth(), (int) dim.getHeight());
		fr.setTitle("Administrator Login");
		fr.setResizable(true);
		
		
		c.setBackground(clr1);
		c.setLayout(null);
		
		txt1.setBounds(192,127,160,30);
		txt1.setFont(fs);
		txt1.setForeground(Color.BLACK);
		
		pass.setBounds(192,188,160,30);
		pass.setFont(fs);
		pass.setEchoChar('*');	
		pass.setForeground(Color.BLACK);
		
		lbl.setBounds(30,32,350,50);
		lbl.setText("Administrator Login");
		lbl.setFont(fh);
		lbl.setForeground(Color.WHITE);
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		
		lbl1.setBounds(43,130,110,25);
		lbl1.setText("Admin Username:");
		lbl1.setForeground(Color.WHITE);
		lbl1.setFont(fs);
		lbl1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lbl2.setBounds(43,192,110,25);
		lbl2.setText("Password:");
		lbl2.setForeground(Color.WHITE);
		lbl2.setFont(fs);
		lbl2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		btn.setBounds(155,270,100,28);
		btn.setText("Log In");
		btn.setBackground(clr2);
		btn.setForeground(Color.BLACK);
		btn.setCursor(cr);
		btn.addActionListener(this);
                wal.setIcon(new ImageIcon("C:\\Users\\RISHI\\Desktop\\Fsproject\\admin.jpg"));
		wal.setBounds(0, 0, (int) dim.getWidth(), (int) dim.getHeight());
		c.add(lbl);
		c.add(lbl1);
		c.add(lbl2);
		c.add(btn);
		c.add(txt1);
		c.add(pass);
                c.add(wal);
		fr.setVisible(true);
	}
	
		public void actionPerformed(ActionEvent evt)
		{
		try
		{  
				if(evt.getSource()==btn)
			{
                          
                                String username,password;
                             username=txt1.getText();
                                 password=pass.getText();
                                if(username.equals("Rishi")&&password.equals("2412"))
                                {
                                    JOptionPane.showMessageDialog(null,"User Found, Access Granted!");
                                   new AdminHome();
					
                                }
                                else
                                {
                                  JOptionPane.showMessageDialog(null,"Enter all details!");  
                                }
                        }}
                                catch(Exception e){
                                    JOptionPane.showMessageDialog(null,"User Not Found, Access Denied!");
                                }}
	public static void main(String[] args)
	{
		new Admin();
	}
	
	
	}