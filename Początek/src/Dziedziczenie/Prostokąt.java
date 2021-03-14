package Dziedziczenie;

public class Prostokąt extends Figura
{
    public double bokA;
    public double bokB;
    double poleProstokata;

    public Prostokąt(double bokA, double bokB) {
        this.bokB = bokA;
    }

    public Prostokąt(double poleProstokata) {
        this.poleProstokata = poleProstokata;
        poleProstokata = bokA * bokB;
    }
}