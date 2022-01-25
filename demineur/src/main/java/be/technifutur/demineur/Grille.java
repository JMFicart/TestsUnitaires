package be.technifutur.demineur;

import java.util.Random;
import java.util.Set;

public class Grille {
    private int mineNumber;
    private int width;
    private int height;
    private Cell[][] grille = new Cell[10][8];

    private int isamine = 1;

    public Grille() {
        for (int lig = 0; lig < grille[lig].length; lig++) {
            for (int col = 0; col < grille[col].length; col++) {
                grille[lig][col] = new Cell();
            }
        }
        generateMineField();
    }

    public int getMineNumber(){
        return 15;
    };

    public int getWidth() {
        return 10;
    }

    public int getHeight() {
        return 8;
    }

    public Cell getCell(int lig, int col) {
        return grille[lig][col];
    }

    private boolean isaMine(int lig, int col) {
        return grille[lig][col].getContenu() == isamine;
    }

    private boolean contientLeNombreDeMines(){
        int nbreMines = 0;

        for(int lig = 0; lig < grille[lig].length; lig++){
            for(int col = 0; col < grille[col].length; col++){
                if (isaMine(lig, col) == true) {
                    nbreMines++;
                }
            }
        }
        return nbreMines == getMineNumber();
    }

    private boolean proba(int max, int seuil, Random rand){
        return rand.nextInt(max) < seuil;
    }

    public void generateMineField(){
        int nbreMinesRestantes = getMineNumber();
        int nbreMinesPosees = 0;
        int nbreCases = getWidth() * getHeight();

        for (int lig = 0; lig < grille[lig].length; lig++){
            for(int col = 0; col < grille[col].length; col++){
                if (proba(nbreCases,nbreMinesRestantes,new Random()) == true) {
                    grille[lig][col].setContenu(1);
                    nbreCases--;
                    nbreMinesRestantes--;
                } else {
                    grille[lig][col].setContenu(0);
                }
            }
        }

        for (int lig = 0; lig < grille[lig].length; lig++){
            for(int col = 0; col < grille[col].length; col++){
                System.out.println("L" + lig + 1 + " C"+ col + 1 + " : " + grille[lig][col].getContenu());
            }
        }

    }

//    public Set<Cell> getvoisin(int lig, int col) {
//        return grille[lig][col];
//    }
}
