package klasy_abstrakcyjne;

abstract public class Wino {
    abstract void bulgocze();
    abstract void nalewanie();
    void jestpite(){
        System.out.println("wiadomo że jest pite");
    }
    void jestkorkowanie(){
        System.out.println("Korkowanko");
    }
}