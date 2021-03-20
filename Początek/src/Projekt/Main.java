package Projekt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj w grze, podaj rozmiar planszy");
        int wymiar = new Scanner(System.in).nextInt();
        char[][] plansza = new char[wymiar][wymiar];
        int movesCounter = 0;
        char activePlayer = 'X';
        String wygranaGracza1 = "wygrywa gracz 1";
        String wygranaGracza2 = "wygrywa gracz 2";
        boolean wygrana1 = false;
        boolean wygrana2 = false;

        while (movesCounter < wymiar * wymiar) {
            try {
                printplansza(plansza);
                boolean moveWasCorrect = performMove(plansza, activePlayer);
                if (moveWasCorrect) {

                    movesCounter++;

                    activePlayer = activePlayer == 'X' ? 'O' : 'X';
                } else {
                    System.out.println("Ruch niepoprawny, spróbuj ponownie");
                }

            }catch(Exception exception)
            {
                System.out.println("błąd, źle napsisales");
                continue;
            }
            if(plansza[0][0]=='X' && plansza[0][1]=='X' && plansza[0][2]=='X' )// zrobic to 9 razy
            {
                wygrana1 = true;//wpisywanie danych
            }
             else if(plansza[0][0]=='O' && plansza[0][1]=='O' && plansza[0][2]=='O' )
             {
                 wygrana2 = true;
             }
//miejsce na dorabianie
            if(wygrana1==true){// porownywanie danych
                System.out.println(wygranaGracza1);
                System.out.println("Gratulacje Gracz1");
                break;
            }
           else if(wygrana2==true) {
                System.out.println(wygranaGracza2);
                break;
            }
            else if(movesCounter==wymiar*wymiar)
                System.out.println("REMIS");
            printplansza(plansza);

        }
    }


    private static boolean performMove(char[][] plansza, char activePlayer) {
        System.out.println(activePlayer + ", podaj nr wiersza");
        int row = new Scanner(System.in).nextInt();
        System.out.println(activePlayer + ", podaj nr kolumny");
        int col = new Scanner(System.in).nextInt();

        if (plansza[row][col] == 0) {
            plansza[row][col] = activePlayer;

            return true;

        } else {
            return false;
        }

    }

    private static void printplansza(char[][] plansza) {
        int wymiar = plansza.length;

        System.out.print("\t");
        for (int i = 0; i < wymiar; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int row = 0; row < wymiar; row++) {
            System.out.print(row + ":\t");
            for (int kolumna = 0; kolumna < wymiar; kolumna++) {
                System.out.print(plansza[row][kolumna] + "\t");
            }
            System.out.println();
        }
    }
}

