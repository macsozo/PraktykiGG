package klasy_abstrakcyjne;

public class Main {
    public static void main(String[] args) {
        //
        // ZADANIE 1
        //
        System.out.println("");
        System.out.println("ZADANIE 1");
        System.out.println("");
        Pies pies = new Pies();
        pies.wiek();
        pies.wydajDzwiek();
        pies.Spanie();
        pies.Ciągnięcie();
        //
        // ZADANIE 2
        //
        System.out.println("");
        System.out.println("ZADANIE 2");
        System.out.println("");
        samochod samochod = new samochod();
        System.out.println("Jest awaria? = " + samochod.awaria());
        samochod.jedzDoPrzodu();
        samochod.skrecwLewo();
        samochod.skrecwPrawo();
        samochod.stop();
        //
        // ZADANIE 3
        //
        System.out.println("");
        System.out.println("ZADANIE 3");
        System.out.println("");
        podajRocznikWina podajRocznikWina = new podajRocznikWina();
        podajRocznikWina.bulgocze();
        podajRocznikWina.nalewanie();
        podajRocznikWina.rocznik();
        podajRocznikWina.jestkorkowanie();
        podajRocznikWina.jestpite();
        //
        // ZADANIE 4
        //
        System.out.println("");
        System.out.println("ZADANIE 4");
        System.out.println("");
        pies.Milutki();
        pies.bawsie();
        //
        // ZADANIE 5
        //
        System.out.println("");
        System.out.println("ZADANIE 5");
        System.out.println("");
        Kwadrat kwadrat = new Kwadrat(6);
        System.out.println("Obwód kwadratu = "+kwadrat.obliczObwod()+"\n"+"Pole kwadratu = "+kwadrat.obliczPole());
    }
}