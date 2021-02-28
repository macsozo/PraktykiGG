package zadanie12;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // Wybor
        System.out.println("Podaj imie postaci");
        String firstName = scan.nextLine();
        System.out.println("Podaj rasę postaci");
        String secondName = scan.nextLine();
        System.out.println("Wybierz Klasę");
        String thirdName = scan.nextLine();
        System.out.println("Wybierz Broń");
        String fourthName = scan.nextLine();
        //Postać
        System.out.println("Twoja Postać to : ");
        System.out.println(firstName);
        System.out.println(secondName);
        System.out.println(thirdName);
        System.out.println(fourthName);
    }
}
