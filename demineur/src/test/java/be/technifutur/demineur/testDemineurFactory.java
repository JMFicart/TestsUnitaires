package be.technifutur.demineur;

import static org.junit.jupiter.api.Assertions.*;
import be.technifutur.java2021.api.ApplicationFactory;
import org.junit.jupiter.api.Test;

public class testDemineurFactory {
    @Test
    public void testgetApplicationNotNull(){
        ApplicationFactory fact = new DemineurFactory();
        assertNotNull(fact.getApplication());

    }
}

