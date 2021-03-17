package klasy_abstrakcyjne;
public class Kwadrat implements ObliczeniaDlaFigur {
    private int bokA;

    public Kwadrat(int bokA) {
        this.bokA = bokA;
    }
    public int getBokA() {
        return bokA;
    }
    public void setBokA(int bokA) {
        this.bokA = bokA;
    }

    @Override
    public int obliczPole() {
        return bokA*bokA;
    }

    @Override
    public int obliczObwod() {
        return 4*bokA;
    }
}