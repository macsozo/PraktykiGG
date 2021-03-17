package Wyjatki;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
    public static void main (String [] args){

        //Zadanie nr. od 1 do 5

        System.out.println( );
        System.out.println("////////////");
        System.out.println( );
        ArrayList<Integer> arrayLista = new ArrayList<>(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz dziesięć liczb do ArrayListy:");

        for (int i = 0; i < 10; i++){
            System.out.print("- ");
            int l = scanner.nextInt();
            if(!arrayLista.contains(l))
            {
                arrayLista.add(l);
            }
            else {
                i--; // dekrementacja
                System.out.println("ALERT: Niestety, ale ta liczba znajduje się już w tej ArrayLiście.");
            }
        }

        System.out.println( );
        System.out.print("Oto twoja lista: ");
        System.out.println( );

        for (int i = 0; i < arrayLista.size(); i++)
        {
            System.out.print(arrayLista.get(i) + " ");
        }
        System.out.println( );
        System.out.println( );
        try
        {
            for (int i = 0; i < 5; i++ ) {
                System.out.println("Podaj który element z listy mam usunąć:");
                int u= scanner.nextInt();
                System.out.print("- ");
                System.out.println("Usuwam liczbę " + arrayLista.get(u - 1) + ".");
                System.out.println( );
                arrayLista.remove(u - 1);

                System.out.print("Oto twoja lista: ");

                for (int j = 0; j < arrayLista.size(); j++)
                {
                    System.out.print(arrayLista.get(j) + " ");
                }
                System.out.println( );
            }
        } catch (InputMismatchException inputMismatchException)
        {
            System.out.println("Podano niepoprawne dane!");

        } catch (IndexOutOfBoundsException indexOutOfBoundsException)
        {
            System.out.println("Podano niepoprawne dane!");
        }

        System.out.println( );
        for (int i = 0; i < 2; i++) {
            // Uwaga! Jeżeli na etapie usuwanie liczb, wpiszesz znak który nie jest liczbą, program wysypie się mimo posiadania zabezpieczenia MisMatchException.
            // Jest problem z linijką nr 73 i 75 w której znajdują się scannery. W momencie zastąpienia tych intów liczbami całkowitymi, problem znika.
            // Próbowałem naprawić to, lecz niestety nie działa.
            System.out.println("Podaj który element z listy mam zamienić:");
            int a = scanner.nextInt();
            System.out.println("Podaj na jaką liczbę chcesz zamienić liczbę " + arrayLista.get(a - 1) + ":");
            int p = scanner.nextInt();
            System.out.println("Zamieniam liczbę " + arrayLista.get(a - 1) + " na " + p);
            arrayLista.set(a-1,p);
        }

        System.out.println();
        System.out.print("Oto twoja lista: ");
        for(int i = 0; i < arrayLista.size(); i++)
        {
            System.out.print(arrayLista.get(i) + " ");
        }
        System.out.println( );
        System.out.println( );
        System.out.println("////////////");
    }
}