package br.com.digitalhouse;

public class Pato implements Voador {

    private int energia;

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public void voar() {
        setEnergia(energia -= 5);
        System.out.println("Estou voando como um pato.");
    }
}
