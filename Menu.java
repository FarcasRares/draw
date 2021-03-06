package Draw;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Menu extends JFrame {
	JFrame frame;
	JPanel firstPanel;
	JButton Start;
	JButton Quit;
	JButton R;
	JButton G;
	JButton B;
	JButton O;
	JButton P;
	MyCanvas can;
	JPanel secondPanel;
	JButton close;
	JLabel number;
	JTextField insertNumber;
	String options[]= {"--","Circle","Square"};
	String options2[]= {"--","Fill","Empty"};
	JComboBox selectOption;
	JComboBox FillEmpty;
	JLabel FillOrEmpty;
	JLabel shape;
	JButton Draw;
	int n;
	String Shape,Type;
	JPanel blank;
	Menu(String text){
		frame=new JFrame(text);
	    frame.setVisible(true);
	    frame.setLayout(null);
	    
	    firstPanel=new JPanel();
	    firstPanel.setLayout(null);
	    firstPanel.setBackground(new Color(100,30,255));
	    firstPanel.setVisible(true);
	    firstPanel.setBounds(0,0,800,500);
	    frame.add(firstPanel);
	    
	    Start=new JButton("START");
	    Start.setFont(new Font("Arial",Font.BOLD,36));
	    Start.setBounds(330,210,160,70);
	    Start.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.black));
	    Start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstPanel.setVisible(false);
				secondPanel.setVisible(true);
			}
	    	
	    });
	    firstPanel.add(Start);
	    
	    Quit=new JButton("QUIT");
	    Quit.setFont(new Font("Arial",Font.BOLD,22));
	    Quit.setBounds(650,360,90,70);
	    Quit.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.black));
	    Quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
	    	
	    });
	    firstPanel.add(Quit);
	    
	    R=new JButton("");
	    R.setBackground(new Color(255,0,0));
	    R.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.black));
	    R.setBounds(60,60,60,60);
	    R.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstPanel.setBackground(new Color(255,0,0));
				secondPanel.setBackground(new Color(255,0,0));
			}
	    });
	    firstPanel.add(R);
	    
	    G=new JButton("");
	    G.setBackground(new Color(0,255,0));
	    G.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.black));
	    G.setBounds(180,60,60,60);
	    G.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstPanel.setBackground(new Color(0,255,0));
				secondPanel.setBackground(new Color(0,255,0));
			}
	    });
	    firstPanel.add(G);
	    
	    B=new JButton("");
	    B.setBackground(new Color(0,0,255));
	    B.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.black));
	    B.setBounds(300,60,60,60);
	    B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstPanel.setBackground(new Color(0,0,255));
				secondPanel.setBackground(new Color(0,0,255));
			}
	    });
	    firstPanel.add(B);
	    
	    O=new JButton("");
	    O.setBackground(new Color(255,165,0));
	    O.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.black));
	    O.setBounds(420,60,60,60);
	    O.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstPanel.setBackground(new Color(255,165,0));
				secondPanel.setBackground(new Color(255,165,0));
			}
	    });
	    firstPanel.add(O);
	    
	    P=new JButton("");
	    P.setBackground(new Color(255,0,191));
	    P.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
	    P.setBounds(540,60,60,60);
	    P.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			firstPanel.setBackground(new Color(255,0,191));
			secondPanel.setBackground(new Color(255,0,191));
			} 	
	    });
	    firstPanel.add(P);
	 
	    
	    secondPanel=new JPanel();
	    secondPanel.setLayout(null);
	    secondPanel.setBackground(new Color(100,30,255));
	    secondPanel.setVisible(false);
	    secondPanel.setBounds(0,0,800,500);
	    frame.add(secondPanel);
	    
	    can=new MyCanvas();
	    can.setBounds(45,100,700,350);
	    
	    blank=new JPanel();
	    blank.setBounds(45,100,700,350);
	    blank.setBackground(new Color(255,255,255));
	    secondPanel.add(blank);
	    
	    close=new JButton("Close");
	    close.setFont(new Font("Arial",Font.BOLD,16));
	    close.setBounds(670,20,80,60);
	    close.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.black));
	    close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondPanel.setVisible(false);
				firstPanel.setVisible(true);
				
			}
	    	
	    });
	    secondPanel.add(close);
	    
	    number=new JLabel("Insert the number of shapes :");
	    number.setFont(new Font("Arial",Font.BOLD,14));
	    number.setBounds(20,20,210,50);
	    number.setForeground(Color.black);
	    secondPanel.add(number);
	    
	    insertNumber=new JTextField();
	    insertNumber.setBounds(235,30,40,30);
	    insertNumber.setFont(new Font("Arial",Font.BOLD,14));
	    insertNumber.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.black));
	    insertNumber.addKeyListener( new KeyAdapter() {
        	public void keyTyped(KeyEvent ke) {
        		char c=ke.getKeyChar();
        		if ((c<'0') || (c>'9') && (c!= KeyEvent.VK_BACK_SPACE)) ke.consume();
        	}
        	
        });
	    secondPanel.add(insertNumber);
	    
	    shape=new JLabel("Select the shape :");
	    shape.setFont(new Font("Arial",Font.BOLD,14));
	    shape.setBounds(290,20,140,50);
	    shape.setForeground(Color.black);
	    secondPanel.add(shape);
	    
	    selectOption=new JComboBox(options);
	    selectOption.setFont(new Font("Arial",Font.BOLD,14));
	    selectOption.setBounds(420,30,90,30);
	    secondPanel.add(selectOption);
	    
	    FillOrEmpty=new JLabel("Select the type :");
	    FillOrEmpty.setFont(new Font("Arial",Font.BOLD,14));
	    FillOrEmpty.setForeground(new Color(0,0,0));
	    FillOrEmpty.setBounds(290,50,140,50);
	    secondPanel.add(FillOrEmpty);
	    
	    FillEmpty=new JComboBox(options2);
	    FillEmpty.setFont(new Font("Arial",Font.BOLD,14));
	    FillEmpty.setBounds(420,60,90,30);
	    secondPanel.add(FillEmpty);
	    
	    Draw=new JButton("Draw");
	    Draw.setFont(new Font("Arial",Font.BOLD,16));
	    Draw.setBounds(580,20,80,60);
	    Draw.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.black));
	    Draw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n=Integer.parseInt(insertNumber.getText());
				Shape=(String) selectOption.getSelectedItem();
				Type=(String)  FillEmpty.getSelectedItem();
				secondPanel.add(can);
				can.draw(n,Shape,Type);
				blank.setVisible(false);
			}
	    	
	    });
	    secondPanel.add(Draw);
	    
	    
	    frame.setBounds(500,300,800,500);
	    frame.getContentPane().setBackground(new Color(100,30,255));
	}
}
