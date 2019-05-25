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
public class rum extends JFrame 
{
    public void add()
    {
        JFrame fr= new JFrame("ADD RUMOUR");
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
				fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fr.setBounds(0,0,(int) dim.getWidth(),(int) dim.getHeight());
				fr.setTitle("Rumours");
				fr.setResizable(true);
                      
        Container c1=fr.getContentPane();
        c1.setLayout(null);
        JLabel wal=new JLabel();
        JLabel Head=new JLabel();
        
        Font font = new Font("Trebuchet",Font.BOLD,15);
        Font font2 = new Font("Trebuchet",Font.BOLD,30);
	Font font1 = new Font("Butler",Font.BOLD,15);
        Head=new JLabel("ADD TRANSFER RUMOURS");
        Head.setBounds(400,30,500,100);
        Head.setFont(font2);
        Head.setForeground(Color.WHITE);
        c1.add(Head);
	JLabel b1 = new JLabel("Position");
	b1.setBounds(75,125,100,50);
        b1.setForeground(Color.WHITE);
        c1.add(b1);
        JLabel b2 = new JLabel("Player Name");
	b2.setBounds(75,195,200,40);
        b2.setForeground(Color.WHITE);
        c1.add(b2);
        JLabel b3 = new JLabel("Rumoured Team");
	b3.setBounds(75,335,200,40);
        b3.setForeground(Color.WHITE);
        c1.add(b3);
        JLabel b4 = new JLabel("Price");
	b4.setBounds(75,405,200,40);
        b4.setForeground(Color.WHITE);
        c1.add(b4);
        JLabel b5 = new JLabel("Current Team");
	b5.setBounds(75,265,200,40);
        b5.setForeground(Color.WHITE);
        c1.add(b5);
        
        b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);
        JTextField t1 = new JTextField();
        t1.setBounds(245,123,200,30);
		c1.add(t1);
		JTextField t2 = new JTextField();
        t2.setBounds(245,193,200,30);
		c1.add(t2);
		JTextField t3 = new JTextField();
        t3.setBounds(245,263,200,30);
		c1.add(t3);
		JTextField t4 = new JTextField();
        t4.setBounds(245,333,200,30);
		c1.add(t4);
		JTextField t5 = new JTextField();
        t5.setBounds(245,403,200,30);
		c1.add(t5);
                wal.setIcon(new ImageIcon("C:\\Users\\RISHI\\Desktop\\FSproject\\rum1.jpg"));
				wal.setBounds(0, 0,(int)dim.getWidth(),(int) dim.getHeight());
                                wal.setOpaque(false);
                               
        JButton bb1 = new JButton("ENTER");
		bb1.setBounds(120,463,100,28);
		bb1.setFont(font);
		c1.add(bb1);
		
		JButton bb2 = new JButton("Clear");
		bb2.setBounds(120,540,100,30);
		bb2.setFont(font);
		c1.add(bb2);
                JButton bb3 = new JButton("BACK");
		bb3.setBounds(320,540,100,28);
		bb3.setFont(font);
		c1.add(bb1);
                c1.add(bb3);
                 c1.add(wal);
                fr.setVisible(true);
        bb2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent event)
		{
			t1.setText("");
            t2.setText("");
            t3.setText(""); 			
		    t4.setText("");
			t5.setText("");
		}});
        bb1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent event) 
		{
                    try
                    {
                        String position,pname,nextteam,price,cteam;
                        position=t1.getText();
                        pname=t2.getText();
                        nextteam=t3.getText();
                        price=t4.getText();
                        cteam=t5.getText();
                        boolean flag=false;
                        addRumour.addRumour(new rumour(position,pname,nextteam,price,cteam));
                        JOptionPane.showMessageDialog(null,"Details Entered");  
                        
		}
		catch(Exception exc)
            {
              System.out.println(exc);
            }
		
                }
                  

        });
    bb3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent evt)
		{try{
                    if(evt.getSource()==bb3)
                    {
                        new AdminHome();
                        
                    }
                    
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                    
                }
                    
                });}
	public static void main(String[] args)
	{
		rum obj=new rum();
                obj.add();
	}
}