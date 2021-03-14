package Dziedziczenie;

public class Praca implements Spawarka {
    private boolean fajna;
    private double pensja;
    private String etat;

    @Override
    public void wykonujePrace()
    {
        System.out.println("Wykonuje czynność");
    }
}