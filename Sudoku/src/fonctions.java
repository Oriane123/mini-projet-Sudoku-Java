import java.util.Random;

public class fonctions {

	public static Integer[][] grillejeu;	//defini la grille de jeu
	public static Random r = new Random();	//defini le random

	
	public void gengrillejeu() { //generation de la grille sur laquelle on va jouer
		grillejeu = new Integer[9][9];
		for(int i =0; i<9; i++) {
			for(int j =0; j<9; j++) {
				int nb = r.nextInt(10-1)+1;
				if(nb==5) {
					grillejeu[i][j] = generate_grill.grille[i][j];
				}
				else {
				grillejeu[i][j] = 0;
				}
			}
		}
	}
	
	public static void verif() {	//commande pour verifier les fautes commise par le joueur dans la grille
		for(int i =0; i<9; i++) {
			for(int j =0; j<9; j++) {
				if(grillejeu[i][j] != generate_grill.grille[i][j] && grillejeu[i][j] !=0) {	//on affiche les erreur commises dans la console
					System.out.println("le numéro "+grillejeu[i][j]+" de la ligne "+i+" et de la colone "+j+" est faux");
				}
			}
		}
	}
	
	public static void aide() {	//commande qui affiche un nombre au hazard dans la grille si besoin d'aide
		boolean ok=false;
		do {
		int i = r.nextInt(10-1);
		int j = r.nextInt(10-1);
		if(grillejeu[i][j]==0) {
			grillejeu[i][j] = generate_grill.grille[i][j];
			ok=true;
		}
		}while(ok==false);
	}
	
	public static void abandon() {	//commande en cas d'abandon affiche la grille complete
		for(int i =0; i<9; i++) {
			for(int j =0; j<9; j++) {
					grillejeu[i][j] = generate_grill.grille[i][j];
				}
		}
	}
	
}
