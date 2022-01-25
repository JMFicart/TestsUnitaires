package be.technifutur.demineur;

import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class GrilleTest {
    private Grille grille = new Grille();

    @Test
    public void testGrilleDefaultSize(){
        assertAll(() -> assertEquals(10, grille.getWidth(), "La largeur minimale doit être 10"),
                () -> assertEquals(8, grille.getHeight(), "La hauteur minimale doit être 8")
        );
    }

    @Test
    public void testGrilleMineNumber(){
        assertEquals(15, grille.getMineNumber());
    }

    @Test
    public void testCaseNotNull(){
        for(int i=0; i < grille.getWidth(); i++) {
            for (int j = 0; j < grille.getHeight(); j++) {
                final int pi = i;
                final int pj = j;
                Cell c1 = grille.getCell(i,1);
                assertNotNull(grille.getCell(i,j),()->String.format("La cellule %s,%s ne peut pas être nulle",pi,pj));
            }
        }
    }

    @Test
    public void testGenerationMineFields(){
        Grille test;

        test = new Grille();
    }

//    @Test
//    public void testVoisin_2_5(){
//        Set<Cell> voisin = grille.getvoisin(2,5);
//        assertAll(() -> assertEquals(8, voisin.size()),
//                () -> assertTrue(voisin.contains(grille.getCell(1, 4))),
//                () -> assertTrue(voisin.contains(grille.getCell(1, 5))),
//                () -> assertTrue(voisin.contains(grille.getCell(1, 6))),
//                () -> assertTrue(voisin.contains(grille.getCell(2, 4))),
//                () -> assertTrue(voisin.contains(grille.getCell(2, 6))),
//                () -> assertTrue(voisin.contains(grille.getCell(3, 4))),
//                () -> assertTrue(voisin.contains(grille.getCell(3, 5))),
//                () -> assertTrue(voisin.contains(grille.getCell(3, 6))));
//    }
//
//    @Test
//    public void testVoisin_0_0(){
//        Set <Cell> voisin = grille.getvoisin(0,0);
//        assertAll(() -> assertEquals(8, voisin.size()),
//                () -> assertTrue(voisin.contains(grille.getCell(0, 1))),
//                () -> assertTrue(voisin.contains(grille.getCell(1, 0))),
//                () -> assertTrue(voisin.contains(grille.getCell(1, 1))));
//    }
}
