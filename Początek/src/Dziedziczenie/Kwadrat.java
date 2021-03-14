package Dziedziczenie;

public class Kwadrat extends Figura
{
    public double bokA;
    public double policzPole;

    public Kwadrat(double bokA)
    {
        bokA = bokA;
    }

    public void kwadrat(double policzPole)
    {
        this.policzPole = policzPole;
        policzPole = bokA * bokA;
    }
}