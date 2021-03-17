package klasy_abstrakcyjne;

public class Pies extends Zwierze implements ZwierzeDomowe{

    @Override
    public int wiek() {
        return 5;
    }

    @Override
    public void wydajDzwiek() { System.out.println("Szczek szczek!"); }

    @Override
    public void Milutki() {
        System.out.println("Milutkens");
    }

    @Override
    public void bawsie() { System.out.println("UuuUuu Bawionko UuuuuUuu"); }
}