package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setTitle("Home");
					frame.setLayout(null);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		

		setContentPane(contentPane);
		
		JButton addbtn=new JButton("Add Book");
		JButton rtnbtn=new JButton("Return Book");
		JButton isubtn=new JButton("Issue Book");
		JButton updatebtn=new JButton("Update Book");
		JButton addmembtn=new JButton("Add Member");
		JButton updatemembtn=new JButton("Update Member");
		JButton viewbookbtn=new JButton("View All Book");
		JButton viewmembtn=new JButton("View All Member");
		JButton viewrtnbtn=new JButton("View All Return Book");
		JButton viewissuebtn=new JButton("View All Issue Book");
		JButton exitbtn=new JButton("EXIT");
		
		 LineBorder border = new LineBorder(Color.RED, 2);
		 
		 JButton backbtn=new JButton("Back To Home");
		 
		 Color myColor = new Color(192, 192, 192);
		 contentPane.setBackground(myColor);
		 
			Font font1 = new Font("Arial", Font.BOLD, 24);
			Font font2 = new Font("Arial", Font.BOLD, 20);
			Font font3 = new Font("Times New Roman", Font.BOLD, 26);
			Font font4 = new Font("Times New Roman", Font.BOLD, 60);
			
	        JLabel imageLabel = new JLabel();
			
		
		  
        addbtn.setSize(180,35);
        addbtn.setLocation(10,35);
        addbtn.setBackground(Color.BLUE);
        addbtn.setForeground(Color.WHITE);
        contentPane.add(addbtn);
    
        addbtn.setBorder(border);
        
        rtnbtn.setSize(180,35);
        rtnbtn.setLocation(10,115);
        rtnbtn.setBackground(Color.BLUE);
        rtnbtn.setForeground(Color.WHITE);
        contentPane.add(rtnbtn);
    
        rtnbtn.setBorder(border);
        
        isubtn.setSize(180,35);
        isubtn.setLocation(10,195);
        isubtn.setBackground(Color.BLUE);
        isubtn.setForeground(Color.WHITE);
        contentPane.add(isubtn);
    
        isubtn.setBorder(border);
        
        updatebtn.setSize(180,35);
        updatebtn.setLocation(10,275);
        updatebtn.setBackground(Color.BLUE);
        updatebtn.setForeground(Color.WHITE);
        contentPane.add(updatebtn);
    
        updatebtn.setBorder(border);
        
        addmembtn.setSize(180,35);
        addmembtn.setLocation(10,425);
        addmembtn.setBackground(Color.ORANGE);
        addmembtn.setForeground(Color.WHITE);
        contentPane.add(addmembtn);
    
        addmembtn.setBorder(border);
        
        updatemembtn.setSize(180,35);
        updatemembtn.setLocation(10,505);
        updatemembtn.setBackground(Color.ORANGE);
        updatemembtn.setForeground(Color.WHITE);
        contentPane.add(updatemembtn);
    
        updatemembtn.setBorder(border);
        
        exitbtn.setSize(180,35);
        exitbtn.setLocation(10,600);   
        exitbtn.setBackground(Color.RED);
        exitbtn.setForeground(Color.BLACK);
        contentPane.add(exitbtn);
    
        exitbtn.setBorder(border);
        
        backbtn.setSize(180,35);
        backbtn.setLocation(10,600);
        backbtn.setBackground(Color.BLUE);
        backbtn.setForeground(Color.WHITE);
        contentPane.add(backbtn);
    
        backbtn.setBorder(border);
        
        viewmembtn.setSize(300,30); 
		viewmembtn.setLocation(400,500);
		viewmembtn.setFont(font2);
		contentPane.add(viewmembtn);
		 viewmembtn.setBorder(border);
		 
		 
			viewbookbtn.setSize(300,30); 
			viewbookbtn.setLocation(400,35);
			viewbookbtn.setFont(font2);
			contentPane.add(viewbookbtn);
			viewbookbtn.setBorder(border);
			
			
			viewissuebtn.setSize(300,30); 
			viewissuebtn.setLocation(400,235);
			viewissuebtn.setFont(font2);
			contentPane.add(viewissuebtn);
			viewissuebtn.setBorder(border);
			

	        viewrtnbtn.setSize(300,30); 
			viewrtnbtn.setLocation(400,135);
			viewrtnbtn.setFont(font2);
			contentPane.add(viewrtnbtn);
			viewrtnbtn.setBorder(border);
			
	        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Ashen\\Desktop\\New folder\\download.jpeg"); 
	        Image image = imageIcon.getImage().getScaledInstance(250, 150, Image.SCALE_DEFAULT);
	        imageIcon = new ImageIcon(image);
	        imageLabel.setIcon(imageIcon);
	        imageLabel.setBounds(400, 280, 430, 200);
	        contentPane.add(imageLabel);
	        
	        addbtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					addbook.main(new String[] {});
					dispose();
				}
			});
	        
	        
            rtnbtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					returnbook.main(new String[] {});
					dispose();
				}
			});
            
            isubtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					issuebook.main(new String[] {});
					dispose();
				}
			});
            
            updatebtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					updatebook.main(new String[] {});
					dispose();
				}
			});
            
            addmembtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					addmember.main(new String[] {});
					dispose();
				}
			});
	       
            updatemembtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					updatemember.main(new String[] {});
					dispose();
				}
			});
            
            viewbookbtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					viewallbook.main(new String[] {});
					dispose();
				}
			});
            
            viewissuebtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					viewallissuebook.main(new String[] {});
					dispose();
				}
			});
            
            viewrtnbtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					viewallreturnbook.main(new String[] {});
					dispose();
				}
			});
            
            viewmembtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					viewallmember.main(new String[] {});
					dispose();
				}
			});
            
            exitbtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Login.main(new String[] {});
					dispose();
				}
			});
		
	}

}
