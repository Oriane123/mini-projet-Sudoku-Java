import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Input implements KeyListener{
	//dirige le jeu avec le clavier
	public static int ab=0;
	
    public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
			case KeyEvent.VK_RIGHT:	//deplace le curseur a droite
				if(menu.cursorCoord[0]<9) {
					menu.cursorCoord[0]++;
				}
				break;
			case KeyEvent.VK_LEFT:	//deplacez le curseur a gauche
				if(menu.cursorCoord[0]>0) {
					menu.cursorCoord[0]--;
				}
				break;
			case KeyEvent.VK_UP:	//deplacez le curseur en haut
				if(menu.cursorCoord[1]>0) {
					menu.cursorCoord[1]--;
				}
				break;
			case KeyEvent.VK_DOWN:	//deplacez le curseur en bas
				if(menu.cursorCoord[1]<9) {
					menu.cursorCoord[1]++;
				}
				break;
			case KeyEvent.VK_NUMPAD1:	//remplie la case du tableau avec 1
				fonctions.grillejeu[menu.cursorCoord[1]][menu.cursorCoord[0]]=1;
				break;
			case KeyEvent.VK_NUMPAD2:	//remplie la case du tableau avec 2
				fonctions.grillejeu[menu.cursorCoord[1]][menu.cursorCoord[0]]=2;
				break;
			case KeyEvent.VK_NUMPAD3:	//remplie la case du tableau avec 3
				fonctions.grillejeu[menu.cursorCoord[1]][menu.cursorCoord[0]]=3;
				break;
			case KeyEvent.VK_NUMPAD4:	//remplie la case du tableau avec 4
				fonctions.grillejeu[menu.cursorCoord[1]][menu.cursorCoord[0]]=4;
				break;
			case KeyEvent.VK_NUMPAD5:	//remplie la case du tableau avec 5
				fonctions.grillejeu[menu.cursorCoord[1]][menu.cursorCoord[0]]=5;
				break;
			case KeyEvent.VK_NUMPAD6:	//remplie la case du tableau avec 6
				fonctions.grillejeu[menu.cursorCoord[1]][menu.cursorCoord[0]]=6;
				break;
			case KeyEvent.VK_NUMPAD7:	//remplie la case du tableau avec 7
				fonctions.grillejeu[menu.cursorCoord[1]][menu.cursorCoord[0]]=7;
				break;
			case KeyEvent.VK_NUMPAD8:	//remplie la case du tableau avec 8
				fonctions.grillejeu[menu.cursorCoord[1]][menu.cursorCoord[0]]=8;
				break;
			case KeyEvent.VK_NUMPAD9:	//remplie la case du tableau avec 9
				fonctions.grillejeu[menu.cursorCoord[1]][menu.cursorCoord[0]]=9;
				break;
			case KeyEvent.VK_A:	//appele la fonction aide en appuyant sur la touche A
				fonctions.aide();
				break;
			case KeyEvent.VK_V:	//appele la fonction verif en appuyant sur la touche V
				fonctions.verif();
				break;
			case KeyEvent.VK_ESCAPE:	//appele la fonction abandon en appuyant sur la touche ECHAP
				fonctions.abandon();
				ab=1;
				break;
		}
    }
	
	@Override
    public void keyReleased(KeyEvent e) {
		
    }
    @Override
    public void keyTyped(KeyEvent e) {
         
    }
	
}
