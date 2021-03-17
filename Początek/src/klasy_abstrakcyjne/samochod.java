package klasy_abstrakcyjne;

public class samochod implements Pojazd{
    @Override
    public void jedzDoPrzodu()
    {
        System.out.println("Jazda naprzód");
    }
    @Override
    public void stop()
    {
        System.out.println("Zatrzymywanie");
    }
    @Override
    public boolean awaria()
    {
        return false;
    }

    @Override
    public void skrecwLewo() {
        System.out.println("skrętka w lewo");

    }

    @Override
    public void skrecwPrawo() {
        System.out.println("skrętka w prawo");

    }
}