import java.util.Random;

public class generate_grill {
	

	public static Integer[][] grille;	//defini la grille
	public Integer[] numberList={1,2,3,4,5,6,7,8,9};	//defini une liste de numeros
	
	public generate_grill() {	//met la grille a 0
		grille = new Integer[9][9];
		for(int i =0; i<9; i++) {
			for(int j =0; j<9; j++) {
				 grille[i][j] = 0;
				 
			}
		}

	}
	
	public void shuffle() {	//melange la liste
	    int j, x;
	    for (int i = 0; i<9; i++) {
	    	Random r = new Random();
			j = r.nextInt(9-1)+1;
	        x = numberList[i];
	        numberList[i] = numberList[j];
	        numberList[j] = x;
	    }
	}
	
	public boolean checkligne(int val, int lig) {	//verifie si une valeur donnee se trouve deja dans une ligne donnee
		for(int i = 0; i<9; i++) {
			if(grille[lig][i]== val) {
				return true;
			}
		}
		return false;
	}
	
	public boolean checkcol(int val, int col) {	//verifie si une valeur donnee se trouve deja dans une colone donnee
		for(int i = 0; i<9; i++) {
			if(grille[i][col]== val) {
				return true;
			}
		}
		return false;
	}
	
	private boolean checkbox(int val, int col, int lig) {	//verifie si une valeur donnee se trouve deja dans une region donnee
		int r = lig - lig % 3;
		int c = col - col % 3;

		for(int i = r; i < r+3; i++) {
			for(int j = c; j < c+3; j++) {
				if(grille[i][j] == val)
					return true;
			}
		}
		return false;
	}
	
	public boolean checkGrille(int val, int col, int lig) {	//verifie si une valeur donnee se trouve deja dans une ligne, colone et region donnee
		return !checkligne(val, lig) && !checkcol(val, col) &&  !checkbox(val, col, lig);
	}
	
	public boolean fillgrille() {	//rempli la grille en verifiant si la valeur peut être mise dans une case 
		for (int lig =0; lig<9; lig++) {	//en s'asurant que cette valeur n'est pas deja dans la ligne , la colone ou la region de cette case
			for (int col =0; col<9; col++) {
				if(grille[lig][col]==0) {
					this.shuffle();
					for(int num:numberList){
						if(checkGrille(num, col, lig)) {
							grille[lig][col]=num;
							if (fillgrille()) {
								return true;
							} 
							else {
								grille[lig][col] = 0;
							}
						}

					}
					return false;
				}
			}
		}
		
		return true;
	}
	
}
