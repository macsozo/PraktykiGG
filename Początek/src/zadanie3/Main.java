package zadanie3;
import java.util.Scanner;
public class Main
{
//oblicz pole trojkąta rownobocznego 7^2 , nie wiem jak zrobic pierwiastek
    public static void main(String[] args)
    {
        double first = 7.0;
        int second = 2;
        double sqrt = Math.sqrt(first);
        double power = Math.pow(first, second);

        System.out.println("Pierwiastek z " + first + " wynosi: " + sqrt);
        System.out.println("Liczba " + first + " podniesiona do potegi " + second + "podzielona przez 4 to " + power/4);
    }
}