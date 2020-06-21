# mini-projet-Sudoku-Java
Le projet choisi pour le cours de java est un des projet proposé le sudoku. 
Le but de ce projet était de développer le Jeu Sudoku et en particulier 6 fonctionnalité:

La première était de créer une grille ma création de grille est dans le fichier generate_grill.java et se fait sue la base d'une prise de nombre aléatoire entre 1 et 9, 
on vérifie que ce nombre ne se trouve pas déjà dans la ligne,la colonne ou la région de la case que l’on remplie et si se n'est pas le cas on place ce nombre dans la case.
On répètes ensuite ces actions jusqu'à ce que la grille soit entièrement remplie.

La deuxième fonctionnalité était de pouvoir sélectionner et remplir les cases, ce qui est fait avec les flèches directionnelles et le pavé numérique en format interface graphique.

La troisième était de s'assurer que les valeurs saisie se trouvait bien entre 1 et 9, chose qui est fait directement dans la fonctionnalité précédente.
Puisque l'interface graphique ne prend en compte que les touches numérique entre 1 et 9 et ne prend pas les nombres. 

La quatrième était d’implémenter une vérification des erreurs qui est lancé dans notre cas en appuyant sur la touche V et qui affiche les erreurs dans la console.

La cinquième était d’implémenter une aide, celle ci est lancé avec la touche A et affiche le nombre contenue dans une case tiré au hasard dans les cases non remplies.

La dernière était d'afficher la grille en cas d'abandon, en appuyant donc sur ECHAP la grille correctement remplie s'affiche. 

Un executable se trouve dans le dossier Sudoku
