package br.com.digitalhouse;

public class Aviao implements Voador{

    private int horasVoo;

    public int getHorasVoo() {
        return horasVoo;
    }

    public void setHorasVoo(int horasVoo) {
        this.horasVoo = horasVoo;
    }

    @Override
    public void voar() {
        setHorasVoo(horasVoo = horasVoo + 13);
        System.out.println("Estou voando como um avião");
    }
}
