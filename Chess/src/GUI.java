import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class GUI extends JFrame 
{

	private static final long serialVersionUID=-2;

	private Container contents;
	
	private JButton[][] square = new JButton[8][8];
	
	private ImageIcon King = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/king.png");
	
	private ImageIcon Queen = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/queen.png");
	
	private ImageIcon Rook1 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/Rook.png");
	
	private ImageIcon Rook2 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/Rook2.png");
 
	private ImageIcon Bishop1 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/bishop.png");
	
	private ImageIcon Bishop2 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/bishop2.png");
	
	private ImageIcon Knight1 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/knight.png");

	private ImageIcon Knight2 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/knight2.png");

	private ImageIcon Pawn1 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/pawn.png");
	
	private ImageIcon Pawn2 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/pawn2.png");
	
	private ImageIcon Pawn3 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/pawn3.png");
	
	private ImageIcon Pawn4 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/pawn4.png");
	
	private ImageIcon Pawn5 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/pawn5.png");
	
	private ImageIcon Pawn6 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/pawn6.png");
	
	private ImageIcon Pawn7 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/pawn7.png");
	
	private ImageIcon Pawn8 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/pawn8.png");
	
	
	private ImageIcon B_King = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/blackking.png");
	
	private ImageIcon B_Queen = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/blackqueen.png");

	private ImageIcon B_Rook1 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/blackrook1.png");
	
	private ImageIcon B_Rook2 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/blackrook2.png");

	private ImageIcon B_Bishop1 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/blackbishop.png");
	
	private ImageIcon B_Bishop2 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/blackbishop2.png");

	private ImageIcon B_Knight1 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/blackknight1.jpg");
	
	private ImageIcon B_Knight2 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/blackknight2.jpg");
	
	private ImageIcon B_Pawn1 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/blackpawn1.jpg");
	
	private ImageIcon B_Pawn2 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/blackpawn2.jpg");

	private ImageIcon B_Pawn3 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/blackpawn3.jpg");

	private ImageIcon B_Pawn4 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/blackpawn4.jpg");

	private ImageIcon B_Pawn5 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/blackpawn5.jpg");

	private ImageIcon B_Pawn6 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/blackpawn6.jpg");

	private ImageIcon B_Pawn7 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/blackpawn7.jpg");

	private ImageIcon B_Pawn8 = new ImageIcon("/home/satwik/eclipse-workspace/Chess/src/blackpawn8.jpg");


	private int Rook1_row = 7;
	private int Rook1_col= 0;
	
	private int Knight1_row = 7;
	private int Knight1_col= 1;
	
	private int Bishop1_row = 7;
	private int Bishop1_col= 2;
	
	private int King_row = 7;
	private int King_col= 4;
	
	private int Queen_row = 7;
	private int Queen_col= 3;
	
	private int Bishop2_row = 7;
	private int Bishop2_col= 5;
	
	private int Knight2_row = 7;
	private int Knight2_col= 6;
	
	private int Rook2_row = 7;
	private int Rook2_col= 7;
	
	private int Pawn1_row = 6;
	private int Pawn1_col= 0;
	
	private int Pawn2_row = 6;
	private int Pawn2_col= 1;
	
	private int Pawn3_row = 6;
	private int Pawn3_col= 2;
	
	private int Pawn4_row = 6;
	private int Pawn4_col= 3;
	
	private int Pawn5_row = 6;
	private int Pawn5_col= 4;
	
	private int Pawn6_row = 6;
	private int Pawn6_col= 5;
	
	private int Pawn7_row = 6;
	private int Pawn7_col= 6;
	
	private int Pawn8_row = 6;
	private int Pawn8_col= 7;
	
	private int B_Pawn1_row = 1;
	private int B_Pawn1_col= 0;

	private int B_Pawn2_row = 1;
	private int B_Pawn2_col= 1;
	
	private int B_Pawn3_row = 1;
	private int B_Pawn3_col= 2;
	
	private int B_Pawn4_row = 1;
	private int B_Pawn4_col= 3;
	
	private int B_Pawn5_row = 1;
	private int B_Pawn5_col= 4;
	
	private int B_Pawn6_row = 1;
	private int B_Pawn6_col= 5;
	
	private int B_Pawn7_row = 1;
	private int B_Pawn7_col= 6;
	
	private int B_Pawn8_row = 1;
	private int B_Pawn8_col= 7;
	
	private int B_Rook1_row = 0;
	private int B_Rook1_col= 0;

	private int B_Knight1_row = 0;
	private int B_Knight1_col= 1;
	
	private int B_Bishop1_row = 0;
	private int B_Bishop1_col= 2;

	private int B_King_row = 0;
	private int B_King_col= 4;
	
	private int B_Queen_row = 0;
	private int B_Queen_col= 3;

	private int B_Bishop2_row = 0;
	private int B_Bishop2_col= 5;
	
	private int B_Knight2_row = 0;
	private int B_Knight2_col= 6;

	private int B_Rook2_row = 0;
	private int B_Rook2_col= 7;
	
	
	Knight k1 = new Knight(Knight1_row,Knight1_col,"White");
	Knight k2 = new Knight(Knight2_row,Knight2_col,"White");
	
	Bishop b1 = new Bishop(Bishop1_row,Bishop1_col,"White");
	Bishop b2 = new Bishop(Bishop2_row,Bishop2_col,"White");
	
	Rook r1 = new Rook(Rook1_row,Rook1_col,"White");
	Rook r2 = new Rook(Rook2_row,Rook2_col,"White");
	
	King k = new King(King_row,King_col,"White");
	
	Queen q = new Queen(Queen_row,Queen_col,"White");
	
	Pawn p1 = new Pawn(Pawn1_row,Pawn1_col,"White");
	Pawn p2 = new Pawn(Pawn2_row,Pawn2_col,"White");
	Pawn p3 = new Pawn(Pawn3_row,Pawn3_col,"White");
	Pawn p4 = new Pawn(Pawn4_row,Pawn4_col,"White");
	Pawn p5 = new Pawn(Pawn5_row,Pawn5_col,"White");
	Pawn p6 = new Pawn(Pawn6_row,Pawn6_col,"White");
	Pawn p7 = new Pawn(Pawn7_row,Pawn7_col,"White");
	Pawn p8 = new Pawn(Pawn8_row,Pawn8_col,"White");
	
	Knight bk1 = new Knight(B_Knight1_row,B_Knight1_col,"Black");
	Knight bk2 = new Knight(B_Knight2_row,B_Knight2_col,"Black");
	
	Bishop bb1 = new Bishop(B_Bishop1_row,B_Bishop1_col,"Black");
	Bishop bb2 = new Bishop(B_Bishop2_row,B_Bishop2_col,"Black");
	
	Rook br1 = new Rook(B_Rook1_row,B_Rook1_col,"Black");
	Rook br2 = new Rook(B_Rook2_row,B_Rook2_col,"Black");
	
	King bk = new King(B_King_row,B_King_col,"Black");
	
	Queen bq = new Queen(B_Queen_row,B_Queen_col,"Black");
	
	Pawn bp1 = new Pawn(B_Pawn1_row,B_Pawn1_col,"Black");
	Pawn bp2 = new Pawn(B_Pawn2_row,B_Pawn2_col,"Black");
	Pawn bp3 = new Pawn(B_Pawn3_row,B_Pawn3_col,"Black");
	Pawn bp4 = new Pawn(B_Pawn4_row,B_Pawn4_col,"Black");
	Pawn bp5 = new Pawn(B_Pawn5_row,B_Pawn5_col,"Black");
	Pawn bp6 = new Pawn(B_Pawn6_row,B_Pawn6_col,"Black");
	Pawn bp7 = new Pawn(B_Pawn7_row,B_Pawn7_col,"Black");
	Pawn bp8 = new Pawn(B_Pawn8_row,B_Pawn8_col,"Black");
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					GUI frame = new GUI();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	public GUI() 
	{
		super("SChess");
		getContentPane().setForeground(Color.BLACK);
		contents = getContentPane();
		ButtonHandler b = new ButtonHandler();
		contents.setLayout(new GridLayout(8,8)); 
		
		for(int i =0;i<8;i++)
		{
			for(int j =0;j<8;j++)
			{
				square[i][j]= new JButton();
				if((i+j)%2==0)
				{
					square[i][j].setBackground(Color.blue);
				}
				contents.add(square[i][j]);
				square[i][j].addMouseListener(b);
			}                                                                  
		}
		
		square[King_row][King_col].setToolTipText("King");
		square[Queen_row][Queen_col].setToolTipText("Queen");
		square[Knight1_row][Knight1_col].setToolTipText("Knight1");
		square[Knight2_row][Knight2_col].setToolTipText("Knight2");
		square[Bishop1_row][Bishop1_col].setToolTipText("Bishop1");
		square[Bishop2_row][Bishop2_col].setToolTipText("Bishop2");
		square[Rook1_row][Rook1_col].setToolTipText("Rook1");
		square[Rook2_row][Rook2_col].setToolTipText("Rook2");
		square[Pawn1_row][Pawn1_col].setToolTipText("Pawn1");
		square[Pawn2_row][Pawn2_col].setToolTipText("Pawn2");
		square[Pawn3_row][Pawn3_col].setToolTipText("Pawn3");
		square[Pawn4_row][Pawn4_col].setToolTipText("Pawn4");
		square[Pawn5_row][Pawn5_col].setToolTipText("Pawn5");
		square[Pawn6_row][Pawn6_col].setToolTipText("Pawn6");
		square[Pawn7_row][Pawn7_col].setToolTipText("Pawn7");
		square[Pawn8_row][Pawn8_col].setToolTipText("Pawn8");
		
		square[King_row][King_col].setIcon(King);
		square[Queen_row][Queen_col].setIcon(Queen);
		square[Knight1_row][Knight1_col].setIcon(Knight1);
		square[Knight2_row][Knight2_col].setIcon(Knight2);
		square[Bishop1_row][Bishop1_col].setIcon(Bishop1);
		square[Bishop2_row][Bishop2_col].setIcon(Bishop2);
		square[Rook1_row][Rook1_col].setIcon(Rook1);
		square[Rook2_row][Rook2_col].setIcon(Rook2);
		square[Pawn1_row][Pawn1_col].setIcon(Pawn1);
		square[Pawn2_row][Pawn2_col].setIcon(Pawn2);
		square[Pawn3_row][Pawn3_col].setIcon(Pawn3);
		square[Pawn4_row][Pawn4_col].setIcon(Pawn4);
		square[Pawn5_row][Pawn5_col].setIcon(Pawn5);
		square[Pawn6_row][Pawn6_col].setIcon(Pawn6);
		square[Pawn7_row][Pawn7_col].setIcon(Pawn7);
		square[Pawn8_row][Pawn8_col].setIcon(Pawn8);

		square[B_King_row][B_King_col].setToolTipText("B.King");
		square[B_Queen_row][B_Queen_col].setToolTipText("B.Queen");
		square[B_Knight1_row][B_Knight1_col].setToolTipText("B.Knight1");
		square[B_Knight2_row][B_Knight2_col].setToolTipText("B.Knight2");
		square[B_Bishop1_row][B_Bishop1_col].setToolTipText("B.Bishop1");
		square[B_Bishop2_row][B_Bishop2_col].setToolTipText("B.Bishop2");
		square[B_Rook1_row][B_Rook1_col].setToolTipText("B.Rook1");
		square[B_Rook2_row][B_Rook2_col].setToolTipText("B.Rook2");
		square[B_Pawn1_row][B_Pawn1_col].setToolTipText("B.Pawn1");
		square[B_Pawn2_row][B_Pawn2_col].setToolTipText("B.Pawn2");
		square[B_Pawn3_row][B_Pawn3_col].setToolTipText("B.Pawn3");
		square[B_Pawn4_row][B_Pawn4_col].setToolTipText("B.Pawn4");
		square[B_Pawn5_row][B_Pawn5_col].setToolTipText("B.Pawn5");
		square[B_Pawn6_row][B_Pawn6_col].setToolTipText("B.Pawn6");
		square[B_Pawn7_row][B_Pawn7_col].setToolTipText("B.Pawn7");
		square[B_Pawn8_row][B_Pawn8_col].setToolTipText("B.Pawn8");
		
		square[B_King_row][B_King_col].setIcon(B_King);
		square[B_Queen_row][B_Queen_col].setIcon(B_Queen);
		square[B_Knight1_row][B_Knight1_col].setIcon(B_Knight1);
		square[B_Knight2_row][B_Knight2_col].setIcon(B_Knight2);
		square[B_Bishop1_row][B_Bishop1_col].setIcon(B_Bishop1);
		square[B_Bishop2_row][B_Bishop2_col].setIcon(B_Bishop2);
		square[B_Rook1_row][B_Rook1_col].setIcon(B_Rook1);
		square[B_Rook2_row][B_Rook2_col].setIcon(B_Rook2);
		square[B_Pawn1_row][B_Pawn1_col].setIcon(B_Pawn1);
		square[B_Pawn2_row][B_Pawn2_col].setIcon(B_Pawn2);
		square[B_Pawn3_row][B_Pawn3_col].setIcon(B_Pawn3);
		square[B_Pawn4_row][B_Pawn4_col].setIcon(B_Pawn4);
		square[B_Pawn5_row][B_Pawn5_col].setIcon(B_Pawn5);
		square[B_Pawn6_row][B_Pawn6_col].setIcon(B_Pawn6);
		square[B_Pawn7_row][B_Pawn7_col].setIcon(B_Pawn7);
		square[B_Pawn8_row][B_Pawn8_col].setIcon(B_Pawn8);


		

		super.setSize(600,600);
		super.setResizable(false);
		super.setLocationRelativeTo(null);
		super.setVisible(true);
	}
	
	
	
	public int processClick(int init_i,int init_j,int fin_i,int fin_j, int flag)
	{
		//System.out.println(init_i+""+init_j+fin_i+fin_j);
		boolean bool=true;
		if(init_i-fin_i>=2&&init_j==fin_j)
		{
			for(int i=init_i-1;i>fin_i;i--)
			{
				if(square[i][init_j].getToolTipText()!=null)
				{
					bool=false;
				}
			}
		}
		if(fin_i-init_i>=2&&init_j==fin_j)
		{
			for(int i=fin_i-1;i>init_i;i--)
			{
				System.out.println(square[i][init_j].getToolTipText());
				if(square[i][init_j].getToolTipText()!=null)
				{
					bool=false;
				}
			}
		}
		if(init_j-fin_j>=2&&init_i==fin_i)
		{
			for(int i=init_j-1;i>fin_j;i--)
			{
				System.out.println(square[i][init_j].getToolTipText());
				if(square[init_i][i].getToolTipText()!=null)
				{
					bool=false;
				}
			}
		}
		if(fin_j-init_j>=2&&init_i==fin_i)
		{
			for(int i=fin_j-1;i>init_j;i--)
			{			
				System.out.println(square[i][init_j].getToolTipText());
				if(square[init_i][i].getToolTipText()!=null)
				{
					bool=false;
				}
			}
		}
		
		if(flag==0)
		{
			if(square[fin_i][fin_j].getToolTipText()==null||((square[fin_i][fin_j].getToolTipText().charAt(0)=='B')&&(square[fin_i][fin_j].getToolTipText().charAt(1)=='.')))
			{
				System.out.println(true);
				if(square[init_i][init_j].getToolTipText()=="Knight1")
				{	
					if(k1.isValidMove(fin_i,fin_j)) {
						//System.out.println("1");
						square[Knight1_row][Knight1_col].setIcon(null);
						square[Knight1_row][Knight1_col].setToolTipText(null);
						Knight1_row=fin_i;
						Knight1_col=fin_j;
						k1.setXY(fin_i, fin_j);
						square[Knight1_row][Knight1_col].setIcon(Knight1);
						square[Knight1_row][Knight1_col].setToolTipText("Knight1");
						return 1;
					}
					return 0;
				}
				if(square[init_i][init_j].getToolTipText()=="Knight2")
				{
					
					if(k2.isValidMove(fin_i,fin_j)) {
						//System.out.println("1");
						square[Knight2_row][Knight2_col].setIcon(null);
						square[Knight2_row][Knight2_col].setToolTipText(null);
						Knight2_row=fin_i;
						Knight2_col=fin_j;
						k2.setXY(fin_i, fin_j);
						square[Knight2_row][Knight2_col].setIcon(Knight2);
						square[Knight2_row][Knight2_col].setToolTipText("Knight2");
						return 1;
					}
					return 0;
				}
				if(square[init_i][init_j].getToolTipText()=="Bishop1"&&bool)
				{
					
					if(b1.isValidMove(fin_i,fin_j)) {
						System.out.println("1");
						square[Bishop1_row][Bishop1_col].setIcon(null);
						square[Bishop1_row][Bishop1_col].setToolTipText(null);
						Bishop1_row=fin_i;
						Bishop1_col=fin_j;
						b1.setXY(fin_i, fin_j);
						square[Bishop1_row][Bishop1_col].setIcon(Bishop1);
						square[Bishop1_row][Bishop1_col].setToolTipText("Bishop1");
						return 1;
					}
					return 0;
				}
				if(square[init_i][init_j].getToolTipText()=="Bishop2"&&bool)
				{
					if(b2.isValidMove(fin_i,fin_j)) {
						System.out.println("1");
						square[Bishop2_row][Bishop2_col].setIcon(null);
						square[Bishop2_row][Bishop2_col].setToolTipText(null);
						Bishop2_row=fin_i;
						Bishop2_col=fin_j;
						b2.setXY(fin_i, fin_j);
						square[Bishop2_row][Bishop2_col].setIcon(Bishop2);
						square[Bishop2_row][Bishop2_col].setToolTipText("Bishop2");
						return 1;
					}
					return 0;
				}
				if(square[init_i][init_j].getToolTipText()=="Rook1"&&bool)
				{
					
					if(r1.isValidMove(fin_i,fin_j)) {
						System.out.println("1");
						square[Rook1_row][Rook1_col].setIcon(null);
						square[Rook1_row][Rook1_col].setToolTipText(null);
						Rook1_row=fin_i;
						Rook1_col=fin_j;
						r1.setXY(fin_i, fin_j);
						square[Rook1_row][Rook1_col].setIcon(Rook1);
						square[Rook1_row][Rook1_col].setToolTipText("Rook1");
						return 1;
					}
					return 0;
				}
				if(square[init_i][init_j].getToolTipText()=="Rook2"&&bool)
				{
					
					if(r2.isValidMove(fin_i,fin_j)) {
						System.out.println("1");
						square[Rook2_row][Rook2_col].setIcon(null);
						square[Rook2_row][Rook2_col].setToolTipText(null);
						Rook2_row=fin_i;
						Rook2_col=fin_j;
						r2.setXY(fin_i, fin_j);
						square[Rook2_row][Rook2_col].setIcon(Rook2);
						square[Rook2_row][Rook2_col].setToolTipText("Rook2");
						return 1;
					}
					return 0;
				}
				if(square[init_i][init_j].getToolTipText()=="Queen"&&bool)
				{
					
					if(q.isValidMove(fin_i,fin_j)) {
						//System.out.println("1");
						square[Queen_row][Queen_col].setIcon(null);
						square[Queen_row][Queen_col].setToolTipText(null);
						Queen_row=fin_i;
						Queen_col=fin_j;
						q.setXY(fin_i, fin_j);
						square[Queen_row][Queen_col].setIcon(Queen);
						square[Queen_row][Queen_col].setToolTipText("Queen");
						return 1;
					}
					return 0;
				}
				if(square[init_i][init_j].getToolTipText()=="King")
				{
					
					if(k.isValidMove(fin_i,fin_j)) {
						//System.out.println("1");
						square[King_row][King_col].setIcon(null);
						square[King_row][King_col].setToolTipText(null);
						King_row=fin_i;
						King_col=fin_j;
						k.setXY(fin_i, fin_j);
						square[King_row][King_col].setIcon(King);
						square[King_row][King_col].setToolTipText("King");
						return 1;
					}
					if(fin_i==init_i&&fin_j==init_j+2&&r1.b==true&&square[King_row][King_col+1].getToolTipText()==null&&square[King_row][King_col+1].getToolTipText()==null)
					{
						square[King_row][King_col].setIcon(null);
						square[King_row][King_col].setToolTipText(null);
						King_row=fin_i;
						King_col=fin_j;
						k.setXY(fin_i, fin_j);
						square[King_row][King_col].setIcon(King);
						square[King_row][King_col].setToolTipText("King");
						square[Rook2_row][Rook2_col].setIcon(null);
						square[Rook2_row][Rook2_col].setToolTipText(null);
						Rook2_row=fin_i;
						Rook2_col=fin_j-1;
						r2.setXY(fin_i, fin_j-1);
						square[Rook2_row][Rook2_col].setIcon(Rook2);
						square[Rook2_row][Rook2_col].setToolTipText("Rook2");
						return 1;
					}
					if(fin_i==init_i&&fin_j==init_j-2&&r1.b==true&&square[King_row][King_col-1].getToolTipText()==null&&square[King_row][King_col-2].getToolTipText()==null&&square[King_row][King_col-3].getToolTipText()==null)
					{
						square[King_row][King_col].setIcon(null);
						square[King_row][King_col].setToolTipText(null);
						King_row=fin_i;
						King_col=fin_j;
						k.setXY(fin_i, fin_j);
						square[King_row][King_col].setIcon(King);
						square[King_row][King_col].setToolTipText("King");
						square[Rook1_row][Rook1_col].setIcon(null);
						square[Rook1_row][Rook1_col].setToolTipText(null);
						Rook1_row=fin_i;
						Rook1_col=fin_j+1;
						r1.setXY(fin_i, fin_j+1);
						square[Rook1_row][Rook1_col].setIcon(Rook1);
						square[Rook1_row][Rook1_col].setToolTipText("Rook1");
						return 1;
					}
					return 0;
				}
				if(square[init_i][init_j].getToolTipText()=="Pawn1")
				{
					if(init_j==fin_j)
					{
						if(p1.isValidMove1(fin_i,"White")&&square[fin_i][fin_j].getToolTipText()==null) {
							System.out.println("1");
							square[Pawn1_row][Pawn1_col].setIcon(null);
							square[Pawn1_row][Pawn1_col].setToolTipText(null);
							Pawn1_row=fin_i;
							Pawn1_col=fin_j;
							p1.setXY(fin_i, fin_j);
							square[Pawn1_row][Pawn1_col].setIcon(Pawn1);
							square[Pawn1_row][Pawn1_col].setToolTipText("Pawn1");
							return 1;
						}
					}
					else if(square[fin_i][fin_j].getToolTipText()!=null)
					{
						if(p1.isValidMove2(fin_i,fin_j,"White")) {
							System.out.println("1");
							square[Pawn1_row][Pawn1_col].setIcon(null);
							square[Pawn1_row][Pawn1_col].setToolTipText(null);
							Pawn1_row=fin_i;
							Pawn1_col=fin_j;
							p1.setXY(fin_i, fin_j);
							square[Pawn1_row][Pawn1_col].setIcon(Pawn1);
							square[Pawn1_row][Pawn1_col].setToolTipText("Pawn1");
							return 1;
						}
					}
					return 0;
				}
				if(square[init_i][init_j].getToolTipText()=="Pawn2")
				{
					if(init_j==fin_j)
					{
						if(p2.isValidMove1(fin_i,"White")&&square[fin_i][fin_j].getToolTipText()==null) {
							System.out.println("1");
							square[Pawn2_row][Pawn2_col].setIcon(null);
							square[Pawn2_row][Pawn2_col].setToolTipText(null);
							Pawn2_row=fin_i;
							Pawn2_col=fin_j;
							p2.setXY(fin_i, fin_j);
							square[Pawn2_row][Pawn2_col].setIcon(Pawn2);
							square[Pawn2_row][Pawn2_col].setToolTipText("Pawn2");
							return 1;
						}
					}
					else if(square[fin_i][fin_j].getToolTipText()!=null)
					{
						if(p2.isValidMove2(fin_i,fin_j,"White")) {
							System.out.println("1");
							square[Pawn2_row][Pawn2_col].setIcon(null);
							square[Pawn2_row][Pawn2_col].setToolTipText(null);
							Pawn2_row=fin_i;
							Pawn2_col=fin_j;
							p2.setXY(fin_i, fin_j);
							square[Pawn2_row][Pawn2_col].setIcon(Pawn2);
							square[Pawn2_row][Pawn2_col].setToolTipText("Pawn2");
							return 1;
						}
					}
					return 0;
				}
				if(square[init_i][init_j].getToolTipText()=="Pawn3")
				{
					if(init_j==fin_j)
					{
						if(p3.isValidMove1(fin_i,"White")&&square[fin_i][fin_j].getToolTipText()==null) {
							System.out.println("1");
							square[Pawn3_row][Pawn3_col].setIcon(null);
							square[Pawn3_row][Pawn3_col].setToolTipText(null);
							Pawn3_row=fin_i;
							Pawn3_col=fin_j;
							p3.setXY(fin_i, fin_j);
							square[Pawn3_row][Pawn3_col].setIcon(Pawn3);
							square[Pawn3_row][Pawn3_col].setToolTipText("Pawn3");
							return 1;
						}
					}
					else if(square[fin_i][fin_j].getToolTipText()!=null)
					{
						if(p3.isValidMove2(fin_i,fin_j,"White")) {
							System.out.println("1");
							square[Pawn3_row][Pawn3_col].setIcon(null);
							square[Pawn3_row][Pawn3_col].setToolTipText(null);
							Pawn3_row=fin_i;
							Pawn3_col=fin_j;
							p3.setXY(fin_i, fin_j);
							square[Pawn3_row][Pawn3_col].setIcon(Pawn3);
							square[Pawn3_row][Pawn3_col].setToolTipText("Pawn3");
							return 1;
						}
					}
					return 0;
				}
				if(square[init_i][init_j].getToolTipText()=="Pawn4")
				{
					if(init_j==fin_j)
					{
						if(p4.isValidMove1(fin_i,"White")&&square[fin_i][fin_j].getToolTipText()==null) {
							System.out.println("1");
							square[Pawn4_row][Pawn4_col].setIcon(null);
							square[Pawn4_row][Pawn4_col].setToolTipText(null);
							Pawn4_row=fin_i;
							Pawn4_col=fin_j;
							p4.setXY(fin_i, fin_j);
							square[Pawn4_row][Pawn4_col].setIcon(Pawn1);
							square[Pawn4_row][Pawn4_col].setToolTipText("Pawn4");
							return 1;
						}
					}
					else if(square[fin_i][fin_j].getToolTipText()!=null)
					{
						if(p4.isValidMove2(fin_i,fin_j,"White")) {
							System.out.println("1");
							square[Pawn4_row][Pawn4_col].setIcon(null);
							square[Pawn4_row][Pawn4_col].setToolTipText(null);
							Pawn4_row=fin_i;
							Pawn4_col=fin_j;
							p4.setXY(fin_i, fin_j);
							square[Pawn4_row][Pawn4_col].setIcon(Pawn4);
							square[Pawn4_row][Pawn4_col].setToolTipText("Pawn4");
							return 1;
						}
					}
					return 0;
				}
				if(square[init_i][init_j].getToolTipText()=="Pawn5")
				{
					if(init_j==fin_j)
					{
						if(p5.isValidMove1(fin_i,"White")&&square[fin_i][fin_j].getToolTipText()==null) {
							System.out.println("1");
							square[Pawn5_row][Pawn5_col].setIcon(null);
							square[Pawn5_row][Pawn5_col].setToolTipText(null);
							Pawn5_row=fin_i;
							Pawn5_col=fin_j;
							p5.setXY(fin_i, fin_j);
							square[Pawn5_row][Pawn5_col].setIcon(Pawn5);
							square[Pawn5_row][Pawn5_col].setToolTipText("Pawn5");
							return 1;
						}
					}
					else if(square[fin_i][fin_j].getToolTipText()!=null)
					{
						if(p5.isValidMove2(fin_i,fin_j,"White")) {
							System.out.println("1");
							square[Pawn5_row][Pawn5_col].setIcon(null);
							square[Pawn5_row][Pawn5_col].setToolTipText(null);
							Pawn5_row=fin_i;
							Pawn5_col=fin_j;
							p5.setXY(fin_i, fin_j);
							square[Pawn5_row][Pawn5_col].setIcon(Pawn5);
							square[Pawn5_row][Pawn5_col].setToolTipText("Pawn5");
							return 1;
						}
					}
					return 0;
				}
				if(square[init_i][init_j].getToolTipText()=="Pawn6")
				{
					if(init_j==fin_j)
					{
						if(p6.isValidMove1(fin_i,"White")&&square[fin_i][fin_j].getToolTipText()==null) {
							System.out.println("1");
							square[Pawn6_row][Pawn6_col].setIcon(null);
							square[Pawn6_row][Pawn6_col].setToolTipText(null);
							Pawn6_row=fin_i;
							Pawn6_col=fin_j;
							p6.setXY(fin_i, fin_j);
							square[Pawn6_row][Pawn6_col].setIcon(Pawn6);
							square[Pawn6_row][Pawn6_col].setToolTipText("Pawn6");
							return 1;
						}
					}
					else if(square[fin_i][fin_j].getToolTipText()!=null)
					{
						if(p6.isValidMove2(fin_i,fin_j,"White")) {
							System.out.println("1");
							square[Pawn6_row][Pawn6_col].setIcon(null);
							square[Pawn6_row][Pawn6_col].setToolTipText(null);
							Pawn6_row=fin_i;
							Pawn6_col=fin_j;
							p6.setXY(fin_i, fin_j);
							square[Pawn6_row][Pawn6_col].setIcon(Pawn6);
							square[Pawn6_row][Pawn6_col].setToolTipText("Pawn6");
							return 1;
						}
					}
					return 0;
				}
				if(square[init_i][init_j].getToolTipText()=="Pawn7")
				{
					if(init_j==fin_j)
					{
						if(p7.isValidMove1(fin_i,"White")&&square[fin_i][fin_j].getToolTipText()==null) {
							System.out.println("1");
							square[Pawn7_row][Pawn7_col].setIcon(null);
							square[Pawn7_row][Pawn7_col].setToolTipText(null);
							Pawn7_row=fin_i;
							Pawn7_col=fin_j;
							p7.setXY(fin_i, fin_j);
							square[Pawn7_row][Pawn7_col].setIcon(Pawn7);
							square[Pawn7_row][Pawn7_col].setToolTipText("Pawn7");
							return 1;
						}
					}
					else if(square[fin_i][fin_j].getToolTipText()!=null)
						{
							if(p7.isValidMove2(fin_i,fin_j,"White")) {
								System.out.println("1");
								square[Pawn7_row][Pawn7_col].setIcon(null);
								square[Pawn7_row][Pawn7_col].setToolTipText(null);
								Pawn7_row=fin_i;
								Pawn7_col=fin_j;
								p7.setXY(fin_i, fin_j);
								square[Pawn7_row][Pawn7_col].setIcon(Pawn7);
								square[Pawn7_row][Pawn7_col].setToolTipText("Pawn7");
								return 1;
							}
						}
						return 0;
				}
				if(square[init_i][init_j].getToolTipText()=="Pawn8")
				{
					if(init_j==fin_j)
					{
						if(p8.isValidMove1(fin_i,"White")&&square[fin_i][fin_j].getToolTipText()==null) {
							System.out.println("1");
							square[Pawn8_row][Pawn8_col].setIcon(null);
							square[Pawn8_row][Pawn8_col].setToolTipText(null);
							Pawn8_row=fin_i;
							Pawn8_col=fin_j;
							p8.setXY(fin_i, fin_j);
							square[Pawn8_row][Pawn8_col].setIcon(Pawn8);
							square[Pawn8_row][Pawn8_col].setToolTipText("Pawn8");
							return 1;
						}
					}
					else if(square[fin_i][fin_j].getToolTipText()!=null)
					{
						if(p8.isValidMove2(fin_i,fin_j,"White")) {
							System.out.println("1");
							square[Pawn8_row][Pawn8_col].setIcon(null);
							square[Pawn8_row][Pawn8_col].setToolTipText(null);
							Pawn8_row=fin_i;
							Pawn8_col=fin_j;
							p8.setXY(fin_i, fin_j);
							square[Pawn8_row][Pawn8_col].setIcon(Pawn8);
							square[Pawn8_row][Pawn8_col].setToolTipText("Pawn8");
							return 1;
						}
					}
					return 0;
				}
			}
			return 0;
		}
		else if(flag==1)
		{
			if(square[fin_i][fin_j].getToolTipText()==null||!((square[fin_i][fin_j].getToolTipText().charAt(0)=='B')&&(square[fin_i][fin_j].getToolTipText().charAt(1)=='.')))
			{	
				if(square[init_i][init_j].getToolTipText()=="B.Knight1")
				{
					
					if(bk1.isValidMove(fin_i,fin_j)) {
						System.out.println("1");
						square[B_Knight1_row][B_Knight1_col].setIcon(null);
						square[B_Knight1_row][B_Knight1_col].setToolTipText(null);
						B_Knight1_row=fin_i;
						B_Knight1_col=fin_j;
						bk1.setXY(fin_i, fin_j);
						square[B_Knight1_row][B_Knight1_col].setIcon(B_Knight1);
						square[B_Knight1_row][B_Knight1_col].setToolTipText("B.Knight1");
						return 0;
					}
					return 1;
				}
	
				if(square[init_i][init_j].getToolTipText()=="B.Knight2")
				{
					
					if(bk2.isValidMove(fin_i,fin_j)) {
						System.out.println("1");
						square[B_Knight2_row][B_Knight2_col].setIcon(null);
						square[B_Knight2_row][B_Knight2_col].setToolTipText(null);
						B_Knight2_row=fin_i;
						B_Knight2_col=fin_j;
						bk2.setXY(fin_i, fin_j);
						square[B_Knight2_row][B_Knight2_col].setIcon(B_Knight2);
						square[B_Knight2_row][B_Knight2_col].setToolTipText("B.Knight2");
						return 0;
					}
					return 1;
				}
				if(square[init_i][init_j].getToolTipText()=="B.Rook1")
				{
					
					if(br1.isValidMove(fin_i,fin_j)) {
						System.out.println("1");
						square[B_Rook1_row][B_Rook1_col].setIcon(null);
						square[B_Rook1_row][B_Rook1_col].setToolTipText(null);
						B_Rook1_row=fin_i;
						B_Rook1_col=fin_j;
						br1.setXY(fin_i, fin_j);
						square[B_Rook1_row][B_Rook1_col].setIcon(B_Rook1);
						square[B_Rook1_row][B_Rook1_col].setToolTipText("B.Rook1");
						return 0;
					}
					return 1;
				}
				if(square[init_i][init_j].getToolTipText()=="B.Rook2")
				{
					
					if(br2.isValidMove(fin_i,fin_j)) {
						System.out.println("1");
						square[B_Rook2_row][B_Rook2_col].setIcon(null);
						square[B_Rook2_row][B_Rook2_col].setToolTipText(null);
						B_Rook2_row=fin_i;
						B_Rook2_col=fin_j;
						br2.setXY(fin_i, fin_j);
						square[B_Rook2_row][B_Rook2_col].setIcon(B_Rook2);
						square[B_Rook2_row][B_Rook2_col].setToolTipText("B.Rook2");
						return 0;
					}
					return 1;
				}
				if(square[init_i][init_j].getToolTipText()=="B.Bishop1")
				{
					
					if(bb1.isValidMove(fin_i,fin_j)) {
						System.out.println("1");
						square[B_Bishop1_row][B_Bishop1_col].setIcon(null);
						square[B_Bishop1_row][B_Bishop1_col].setToolTipText(null);
						B_Bishop1_row=fin_i;
						B_Bishop1_col=fin_j;
						bb1.setXY(fin_i, fin_j);
						square[B_Bishop1_row][B_Bishop1_col].setIcon(B_Bishop1);
						square[B_Bishop1_row][B_Bishop1_col].setToolTipText("B.Bishop1");
						return 0;
					}
					return 1;
				}
				if(square[init_i][init_j].getToolTipText()=="B.Bishop2")
				{
					
					if(bb2.isValidMove(fin_i,fin_j)) {
						System.out.println("1");
						square[B_Bishop2_row][B_Bishop2_col].setIcon(null);
						square[B_Bishop2_row][B_Bishop2_col].setToolTipText(null);
						B_Bishop2_row=fin_i;
						B_Bishop2_col=fin_j;
						bb2.setXY(fin_i, fin_j);
						square[B_Bishop2_row][B_Bishop2_col].setIcon(B_Bishop2);
						square[B_Bishop2_row][B_Bishop2_col].setToolTipText("B.Bishop2");
						return 0;
					}
					return 1;
				}
				if(square[init_i][init_j].getToolTipText()=="B.King")
				{
					
					if(bk.isValidMove(fin_i,fin_j)) {
						System.out.println("1");
						square[B_King_row][B_King_col].setIcon(null);
						square[B_King_row][B_King_col].setToolTipText(null);
						B_King_row=fin_i;
						B_King_col=fin_j;
						bk.setXY(fin_i, fin_j);
						square[B_King_row][B_King_col].setIcon(B_King);
						square[B_King_row][B_King_col].setToolTipText("B.King");
						return 0;
					}
					if(bk.b==true)
					{
						if(fin_i==init_i&&fin_j==init_j+2&&br1.b==true&&square[B_King_row][B_King_col+1].getToolTipText()==null&&square[B_King_row][B_King_col+1].getToolTipText()==null)
						{
							square[B_King_row][B_King_col].setIcon(null);
							square[B_King_row][B_King_col].setToolTipText(null);
							B_King_row=fin_i;
							B_King_col=fin_j;
							bk.setXY(fin_i, fin_j);
							square[B_King_row][B_King_col].setIcon(B_King);
							square[B_King_row][B_King_col].setToolTipText("B.King");
							square[B_Rook2_row][B_Rook2_col].setIcon(null);
							square[B_Rook2_row][B_Rook2_col].setToolTipText(null);
							B_Rook2_row=fin_i;
							B_Rook2_col=fin_j-1;
							br2.setXY(fin_i, fin_j-1);
							square[B_Rook2_row][B_Rook2_col].setIcon(B_Rook2);
							square[B_Rook2_row][B_Rook2_col].setToolTipText("B.Rook2");
						}
						if(fin_i==init_i&&fin_j==init_j-2&&br1.b==true&&square[B_King_row][B_King_col-1].getToolTipText()==null&&square[B_King_row][B_King_col-2].getToolTipText()==null&&square[B_King_row][B_King_col-3].getToolTipText()==null)
						{
							square[B_King_row][B_King_col].setIcon(null);
							square[B_King_row][B_King_col].setToolTipText(null);
							B_King_row=fin_i;
							B_King_col=fin_j;
							bk.setXY(fin_i, fin_j);
							square[B_King_row][B_King_col].setIcon(B_King);
							square[B_King_row][B_King_col].setToolTipText("B.King");
							square[B_Rook1_row][B_Rook1_col].setIcon(null);
							square[B_Rook1_row][B_Rook1_col].setToolTipText(null);
							B_Rook1_row=fin_i;
							B_Rook1_col=fin_j+1;
							br1.setXY(fin_i, fin_j+1);
							square[B_Rook1_row][B_Rook1_col].setIcon(B_Rook1);
							square[B_Rook1_row][B_Rook1_col].setToolTipText("B.Rook1");
						}
						return 0;
					}
					return 1;
				}
				if(square[init_i][init_j].getToolTipText()=="B.Queen")
				{
					
					if(bq.isValidMove(fin_i,fin_j)) {
						System.out.println("1");
						square[B_Queen_row][B_Queen_col].setIcon(null);
						square[B_Queen_row][B_Queen_col].setToolTipText(null);
						B_Queen_row=fin_i;
						B_Queen_col=fin_j;
						bq.setXY(fin_i, fin_j);
						square[B_Queen_row][B_Queen_col].setIcon(B_Queen);
						square[B_Queen_row][B_Queen_col].setToolTipText("B.Queen");
						return 0;
					}
					return 1;
				}
				if(square[init_i][init_j].getToolTipText()=="B.Pawn1")
				{
					if(init_j==fin_j)
					{
						if(bp1.isValidMove1(fin_i,"Black")&&square[fin_i][fin_j].getToolTipText()==null) {
							System.out.println("1");
							square[B_Pawn1_row][B_Pawn1_col].setIcon(null);
							square[B_Pawn1_row][B_Pawn1_col].setToolTipText(null);
							B_Pawn1_row=fin_i;
							B_Pawn1_col=fin_j;
							bp1.setXY(fin_i, fin_j);
							square[B_Pawn1_row][B_Pawn1_col].setIcon(B_Pawn1);
							square[B_Pawn1_row][B_Pawn1_col].setToolTipText("B.Pawn1");
							return 0;
						}
					}
					else if(square[fin_i][fin_j].getToolTipText()!=null)
					{
						if(bp1.isValidMove2(fin_i,fin_j,"Black")) {
							System.out.println("1");
							square[B_Pawn1_row][B_Pawn1_col].setIcon(null);
							square[B_Pawn1_row][B_Pawn1_col].setToolTipText(null);
							B_Pawn1_row=fin_i;
							B_Pawn1_col=fin_j;
							bp1.setXY(fin_i, fin_j);
							square[B_Pawn1_row][B_Pawn1_col].setIcon(B_Pawn1);
							square[B_Pawn1_row][B_Pawn1_col].setToolTipText("B.Pawn1");
							return 0;
						}
					}
					return 1;
				}
				if(square[init_i][init_j].getToolTipText()=="B.Pawn2")
				{
					if(init_j==fin_j)
					{
						if(bp2.isValidMove1(fin_i,"Black")&&square[fin_i][fin_j].getToolTipText()==null) {
							System.out.println("1");
							square[B_Pawn2_row][B_Pawn2_col].setIcon(null);
							square[B_Pawn2_row][B_Pawn2_col].setToolTipText(null);
							B_Pawn2_row=fin_i;
							B_Pawn1_col=fin_j;
							bp2.setXY(fin_i, fin_j);
							square[B_Pawn2_row][B_Pawn2_col].setIcon(B_Pawn2);
							square[B_Pawn2_row][B_Pawn2_col].setToolTipText("B.Pawn2");
							return 0;
						}
					}
					else if(square[fin_i][fin_j].getToolTipText()!=null)
					{
						if(bp2.isValidMove2(fin_i,fin_j,"Black")) {
							System.out.println("1");
							square[B_Pawn2_row][B_Pawn2_col].setIcon(null);
							square[B_Pawn2_row][B_Pawn2_col].setToolTipText(null);
							B_Pawn2_row=fin_i;
							B_Pawn2_col=fin_j;
							bp2.setXY(fin_i, fin_j);
							square[B_Pawn2_row][B_Pawn2_col].setIcon(B_Pawn2);
							square[B_Pawn2_row][B_Pawn2_col].setToolTipText("B.Pawn2");
							return 0;
						}
					}
					return 1;
				}
				if(square[init_i][init_j].getToolTipText()=="B.Pawn3")
				{
					if(init_j==fin_j)
					{
						if(bp3.isValidMove1(fin_i,"Black")&&square[fin_i][fin_j].getToolTipText()==null) {
							System.out.println("1");
							square[B_Pawn3_row][B_Pawn3_col].setIcon(null);
							square[B_Pawn3_row][B_Pawn3_col].setToolTipText(null);
							B_Pawn3_row=fin_i;
							B_Pawn3_col=fin_j;
							bp3.setXY(fin_i, fin_j);
							square[B_Pawn3_row][B_Pawn3_col].setIcon(B_Pawn3);
							square[B_Pawn3_row][B_Pawn3_col].setToolTipText("B.Pawn3");
							return 0;
						}
					}
					else if(square[fin_i][fin_j].getToolTipText()!=null)
					{
						if(bp3.isValidMove2(fin_i,fin_j,"Black")) {
							System.out.println("1");
							square[B_Pawn3_row][B_Pawn3_col].setIcon(null);
							square[B_Pawn3_row][B_Pawn3_col].setToolTipText(null);
							B_Pawn3_row=fin_i;
							B_Pawn3_col=fin_j;
							bp1.setXY(fin_i, fin_j);
							square[B_Pawn3_row][B_Pawn3_col].setIcon(B_Pawn3);
							square[B_Pawn3_row][B_Pawn3_col].setToolTipText("B.Pawn3");
							return 0;
						}
					}
					return 1;
				}
				if(square[init_i][init_j].getToolTipText()=="B.Pawn4")
				{
					if(init_j==fin_j)
					{
						if(bp4.isValidMove1(fin_i,"Black")&&square[fin_i][fin_j].getToolTipText()==null) {
							System.out.println("1");
							square[B_Pawn4_row][B_Pawn4_col].setIcon(null);
							square[B_Pawn4_row][B_Pawn4_col].setToolTipText(null);
							B_Pawn4_row=fin_i;
							B_Pawn4_col=fin_j;
							bp4.setXY(fin_i, fin_j);
							square[B_Pawn4_row][B_Pawn4_col].setIcon(B_Pawn4);
							square[B_Pawn4_row][B_Pawn4_col].setToolTipText("B.Pawn4");
							return 0;
						}
					}
					else if(square[fin_i][fin_j].getToolTipText()!=null)
					{
						if(bp4.isValidMove2(fin_i,fin_j,"Black")) {
							System.out.println("1");
							square[B_Pawn4_row][B_Pawn4_col].setIcon(null);
							square[B_Pawn4_row][B_Pawn4_col].setToolTipText(null);
							B_Pawn4_row=fin_i;
							B_Pawn4_col=fin_j;
							bp4.setXY(fin_i, fin_j);
							square[B_Pawn4_row][B_Pawn4_col].setIcon(B_Pawn4);
							square[B_Pawn4_row][B_Pawn4_col].setToolTipText("B.Pawn4");
							return 0;
						}
					}
					return 1;
				}
				if(square[init_i][init_j].getToolTipText()=="B.Pawn5")
				{
					if(init_j==fin_j)
					{
						if(bp5.isValidMove1(fin_i,"Black")&&square[fin_i][fin_j].getToolTipText()==null) {
							System.out.println("1");
							square[B_Pawn5_row][B_Pawn5_col].setIcon(null);
							square[B_Pawn5_row][B_Pawn5_col].setToolTipText(null);
							B_Pawn5_row=fin_i;
							B_Pawn5_col=fin_j;
							bp5.setXY(fin_i, fin_j);
							square[B_Pawn5_row][B_Pawn5_col].setIcon(B_Pawn5);
							square[B_Pawn5_row][B_Pawn5_col].setToolTipText("B.Pawn5");
							return 0;
						}
					}
					else if(square[fin_i][fin_j].getToolTipText()!=null)
					{
						if(bp5.isValidMove2(fin_i,fin_j,"Black")) {
							System.out.println("1");
							square[B_Pawn5_row][B_Pawn5_col].setIcon(null);
							square[B_Pawn5_row][B_Pawn5_col].setToolTipText(null);
							B_Pawn5_row=fin_i;
							B_Pawn5_col=fin_j;
							bp5.setXY(fin_i, fin_j);
							square[B_Pawn5_row][B_Pawn5_col].setIcon(B_Pawn5);
							square[B_Pawn5_row][B_Pawn5_col].setToolTipText("B.Pawn5");
							return 0;
						}
					}
					return 1;
				}
				if(square[init_i][init_j].getToolTipText()=="B.Pawn6")
				{
					if(init_j==fin_j)
					{
						if(bp6.isValidMove1(fin_i,"Black")&&square[fin_i][fin_j].getToolTipText()==null) {
							System.out.println("1");
							square[B_Pawn6_row][B_Pawn6_col].setIcon(null);
							square[B_Pawn6_row][B_Pawn6_col].setToolTipText(null);
							B_Pawn6_row=fin_i;
							B_Pawn6_col=fin_j;
							bp6.setXY(fin_i, fin_j);
							square[B_Pawn6_row][B_Pawn6_col].setIcon(B_Pawn6);
							square[B_Pawn6_row][B_Pawn6_col].setToolTipText("B.Pawn6");
							return 0;
						}
					}
					else if(square[fin_i][fin_j].getToolTipText()!=null)
					{
						if(bp6.isValidMove2(fin_i,fin_j,"Black")) {
							System.out.println("1");
							square[B_Pawn6_row][B_Pawn6_col].setIcon(null);
							square[B_Pawn6_row][B_Pawn6_col].setToolTipText(null);
							B_Pawn6_row=fin_i;
							B_Pawn6_col=fin_j;
							bp6.setXY(fin_i, fin_j);
							square[B_Pawn6_row][B_Pawn6_col].setIcon(B_Pawn6);
							square[B_Pawn6_row][B_Pawn6_col].setToolTipText("B.Pawn6");
							return 0;
						}
					}
					return 1;
				}
				if(square[init_i][init_j].getToolTipText()=="B.Pawn7")
				{
					if(init_j==fin_j)
					{
						if(bp7.isValidMove1(fin_i,"Black")&&square[fin_i][fin_j].getToolTipText()==null) {
							System.out.println("1");
							square[B_Pawn7_row][B_Pawn7_col].setIcon(null);
							square[B_Pawn7_row][B_Pawn7_col].setToolTipText(null);
							B_Pawn7_row=fin_i;
							B_Pawn7_col=fin_j;
							bp7.setXY(fin_i, fin_j);
							square[B_Pawn7_row][B_Pawn7_col].setIcon(B_Pawn1);
							square[B_Pawn7_row][B_Pawn7_col].setToolTipText("B.Pawn1");
							return 0;
						}
					}
					else if(square[fin_i][fin_j].getToolTipText()!=null)
					{
						if(bp7.isValidMove2(fin_i,fin_j,"Black")) {
							System.out.println("1");
							square[B_Pawn1_row][B_Pawn1_col].setIcon(null);
							square[B_Pawn1_row][B_Pawn1_col].setToolTipText(null);
							B_Pawn7_row=fin_i;
							B_Pawn7_col=fin_j;
							bp7.setXY(fin_i, fin_j);
							square[B_Pawn7_row][B_Pawn7_col].setIcon(B_Pawn7);
							square[B_Pawn7_row][B_Pawn7_col].setToolTipText("B.Pawn7");
							return 0;
						}
					}
					return 1;
				}
				if(square[init_i][init_j].getToolTipText()=="B.Pawn8")
				{
					if(init_j==fin_j)
					{
						if(bp8.isValidMove1(fin_i,"Black")&&square[fin_i][fin_j].getToolTipText()==null) {
							System.out.println("1");
							square[B_Pawn8_row][B_Pawn8_col].setIcon(null);
							square[B_Pawn8_row][B_Pawn8_col].setToolTipText(null);
							B_Pawn8_row=fin_i;
							B_Pawn8_col=fin_j;
							bp8.setXY(fin_i, fin_j);
							square[B_Pawn8_row][B_Pawn8_col].setIcon(B_Pawn8);
							square[B_Pawn8_row][B_Pawn8_col].setToolTipText("B.Pawn8");
							return 0;
						}
					}
					else if(square[fin_i][fin_j].getToolTipText()!=null)
					{
						if(bp8.isValidMove2(fin_i,fin_j,"Black")) {
							System.out.println("1");
							square[B_Pawn8_row][B_Pawn8_col].setIcon(null);
							square[B_Pawn8_row][B_Pawn8_col].setToolTipText(null);
							B_Pawn8_row=fin_i;
							B_Pawn8_col=fin_j;
							bp1.setXY(fin_i, fin_j);
							square[B_Pawn8_row][B_Pawn8_col].setIcon(B_Pawn1);
							square[B_Pawn8_row][B_Pawn8_col].setToolTipText("B.Pawn1");
							return 0;
						}
					}
					return 1;
				}
			}
		}	
		return 1;
		}
	static int flag2=0;
	private class ButtonHandler implements MouseListener,MouseMotionListener
	{
		int initx,inity,desx,desy,flag=0;
		
		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			Object source = e.getSource();
			if(flag==0)
			{
				for(int i=0;i<8;i++)
				{
					for(int j=0;j<8;j++)
					{
						if(source==square[i][j])
						{
							System.out.println(square[i][j].getToolTipText());
							initx=i;
							inity=j;
						}
					}
				}
				flag=1;
			}
			else
			{
				for(int i=0;i<8;i++)
				{
					for(int j=0;j<8;j++)
					{
						if(source==square[i][j])
						{
							System.out.println(square[i][j].getToolTipText());
							desx=i;
							desy=j;
						}
					}
				}
				flag=0;
				System.out.println(initx+" "+inity+" "+desx+" "+desy+" ");
				flag2=processClick(initx,inity,desx,desy,flag2);
			}
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
}