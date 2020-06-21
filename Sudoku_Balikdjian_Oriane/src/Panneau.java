import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panneau extends JPanel{	//cree l'affichage en utilisant un panel pour afficher le jeu

	int taille = 50;
	public fonctions fct = new fonctions();
	Font f = new Font("Arial", Font.BOLD, 45); //definis les fonts
	Font w = new Font("Arial", Font.BOLD, 20);
	Font v = new Font("Arial", Font.BOLD, 100);
	
	public Panneau(){
		fct.gengrillejeu();	//appele la grille de jeu

	}
	
	public void paintComponent(Graphics g) {
				
		for(int i = 0; i<9; i++) {	//cree la grille sur le panel et on l'affiche
			for(int j = 0; j<9; j++) {
				g.setColor(Color.white);
				g.fillRect(i*taille, j*taille, taille, taille);
				g.setColor(Color.black);
				g.drawRect(i * taille, j*taille,  taille, taille);
				g.setFont(f);
				if(i==menu.cursorCoord[0] && j==menu.cursorCoord[1]) {
					g.setColor(Color.gray);
					g.fillRect(i*taille, j*taille, taille, taille);
				}
				if(fonctions.grillejeu[j][i]!=0) {
					g.drawString(fonctions.grillejeu[j][i].toString(), i*taille, j*taille+taille);				
				}
				g.setFont(w);
				g.drawString("Appuyer sur v pour vérifier votre grille", 0, 500);	//affiche les touches nessessaire aux comandes
				g.drawString("Appuyer sur a pour afficher un nombre au hasard", 0, 530);
				g.drawString("Appuyer sur echap pour abandonner", 0, 560);
			}
		}
		int compt=0;
		for(int i = 0; i<9; i++) {	//verifie si la grille de jeu est entierement correcte
			for(int j = 0; j<9; j++) {
					if(fonctions.grillejeu[i][j] == generate_grill.grille[i][j]) {
						compt++;
					}
			}
		}
		if(compt==81 && Input.ab==0) {	//verifie les conditions de victoire et si elles sont verifie on affiche une victoire
			g.setColor(Color.red);
			g.setFont(v);
			g.drawString("Victoire", 0, 250);
		}
		
	}
	
}
