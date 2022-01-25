package be.technifutur.demineur;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DemineurApplicationTest {
    @Test
    public void testStartGrilleNotNull(){
        DemineurApplication application = new DemineurApplication();
        application.start();
        Grille grille = application.getGrille();
        assertNotNull(grille);
    }
}
