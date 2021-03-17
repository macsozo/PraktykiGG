package klasy_abstrakcyjne;
public class podajRocznikWina extends Wino {
    void rocznik(){
        System.out.println("Jest to 03 albo 96");
    }

    @Override
    void bulgocze() {
        System.out.println("Bul bul bul");
    }

    @Override
    void nalewanie() {
        System.out.println("tak o nalewane");

    }
}