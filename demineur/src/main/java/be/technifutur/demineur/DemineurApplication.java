package be.technifutur.demineur;

import be.technifutur.java2021.api.Application;

public class DemineurApplication implements Application {
    @Override
    public void start() {

    }

    @Override
    public boolean isFinsish() {
        return false;
    }

    @Override
    public String getScreen() {
        return null;
    }

    @Override
    public void request(String s) {

    }

    public Grille getGrille() {
        return new Grille();
    }
}
