
package fs.football;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AdminHome extends JFrame implements ActionListener
{
	JFrame fr=new JFrame();
	ImageIcon icon = new ImageIcon("download.jpg");
	Color clr1=new Color(211,211,211);
	Color clr2=new Color(192,192,192);
		
	Cursor cr=new Cursor(Cursor.HAND_CURSOR);
		
	Font fh=new Font("Trebuchet MS",Font.BOLD,30);
	Font fl=new Font("Trebuchet MS",Font.BOLD,14);
		
	Container c=fr.getContentPane();
		
	JLabel lbl1=new JLabel(icon);
  
	JLabel wal=new JLabel();		
	JButton btn=new JButton();
	JButton btn1=new JButton();
	JButton btn2=new JButton();
        JButton bb3=new JButton();
	
	public AdminHome()
	{
             Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
				fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fr.setBounds(0,0,(int) dim.getWidth(),(int) dim.getHeight());
				fr.setTitle("Transfer Market(admin)");
				fr.setResizable(true);
                             
                                fr.add(lbl1);
			
				
				c.setLayout(null);
				
				lbl1.setBounds(400,40,500,100);
				lbl1.setText("Transfer Market(admin use)");
				lbl1.setFont(fh);
				lbl1.setForeground(Color.WHITE);
				lbl1.setHorizontalAlignment(SwingConstants.CENTER);
				
				btn.setBounds(400,245,500,50);
				btn.setText("Transfer Rumours");
				btn.setBackground(clr2);
				btn.setForeground(Color.BLACK);
				btn.setFont(fl);
				btn.setCursor(cr);
				btn.addActionListener(this);
				
				btn1.setBounds(400,295,500,50);
				btn1.setText("Top Transfer All Time");
				btn1.setBackground(clr2);
				btn1.setForeground(Color.BLACK);
				btn1.setFont(fl);
				btn1.setCursor(cr);
				btn1.addActionListener(this);
				
				btn2.setBounds(400,395,500,50);
				btn2.setText("Player Database");
				btn2.setBackground(clr2);
				btn2.setForeground(Color.BLACK);
				btn2.setFont(fl);
				btn2.setCursor(cr);
				btn2.addActionListener(this);
                                 bb3 = new JButton("BACK");
		bb3.setBounds(520,540,100,28);
		bb3.setFont(fl);
                bb3.addActionListener(this);
				
                                
                                
                                wal.setIcon(new ImageIcon("C:\\Users\\RISHI\\Desktop\\FSproject\\adminx.jpg"));
				wal.setBounds(0, 0,(int)dim.getWidth(),(int) dim.getHeight());
                                wal.setOpaque(false);
                                c.add(lbl1);
				c.add(btn);
				
				c.add(btn2);
                                c.add(bb3);
				c.add(wal);
				fr.setVisible(true);
	
	
	}
	
	public void actionPerformed(ActionEvent evt)
	{
		try
		{
			if(evt.getSource()==btn)
		{
			fr.dispose();
			rum obj=new rum();
                        obj.add();
		}
		
		if(evt.getSource()==btn1)
		{
			fr.dispose();
                             transfer ob=new transfer();
                             ob.setVisible(true);
                             
		}
		
		if(evt.getSource()==btn2)
		{
			fr.dispose();
			 Playerdb ob =new Playerdb();
                         ob.add();
                        
		}
                if(evt.getSource()==bb3)
		{
			fr.dispose();
			Fpage fp=new Fpage();
                        fp.setVisible(true);
		}
		}
		catch(Exception e)
		{}
	}
	
	public static void main(String [] args)
	{
		new AdminHome();
	}
}