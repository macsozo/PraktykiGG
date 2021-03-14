package Dziedziczenie;

public class Zwierze
{
    private int wiek;
    private int ilośćKonczyn;
    private String nazwa;

    public Zwierze(int wiek, int iloscKonczyn, String nazwa)
    {
        this.wiek = wiek;
        this.ilośćKonczyn = ilośćKonczyn;
        this.nazwa = nazwa;
    }

    public void dajGłos()
    {
        System.out.println("Daj głos");
    }

    public int getWiek()
    {
        return wiek;
    }

    public void setWiek(int wiek)
    {
        this.wiek = wiek;
    }

    public int getIlośćKonczyn()
    {
        return ilośćKonczyn;
    }

    public void setIlośćKonczyn(int ilośćKonczyn)
    {
        this.ilośćKonczyn = ilośćKonczyn;
    }

    public String getNazwa()
    {
        return nazwa;
    }

    public void setNazwa(String nazwa)
    {
        this.nazwa = nazwa;
    }
}