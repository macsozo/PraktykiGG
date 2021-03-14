package Dziedziczenie;

public class Pies extends Zwierze
{
    private String siersc;
    private int długoscOgonu;

    public Pies(int wiek, int iloscKonczyn, String nazwa, String siersc, int długoscOgonu)
    {
        super(wiek, iloscKonczyn, nazwa);
        this.siersc = siersc;
        this.długoscOgonu = długoscOgonu;
    }


    @Override
    public void dajGłos()
    {
        System.out.println("Hau Hau Hau");
    }

    public String getSiersc()
    {
        return siersc;
    }

    public void setSiersc(String siersc)
    {
        this.siersc = siersc;
    }

    public int getDługoscOgonu()
    {
        return długoscOgonu;
    }

    public void setDługoscOgonu(int długoscOgonu)
    {
        this.długoscOgonu = długoscOgonu;
    }


}