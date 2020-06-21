import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class menu extends JFrame {	//cree la fenetre qui pemettra un visuel du jeu
	
	public static int[] cursorCoord = new int[2];
	public Input inp = new Input();
	public Panneau affgrille = new Panneau();

	public menu() {
		cursorCoord[0]=0;
		cursorCoord[1]=0;		
		this.setTitle("Sudoku");
		this.setSize(500,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(affgrille);
		this.setVisible(true);
		this.addKeyListener(inp);
		for(;;) {
			if(menu.cursorCoord[0]>=9) {	//empeche le cureur d'aller autre part que sur la grille
				menu.cursorCoord[0]=8;
			}
			if(menu.cursorCoord[1]>=9) {
				menu.cursorCoord[1]=8;
			}
			affgrille.repaint();
		}
	}
  
}