package Projekt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj w grze, podaj rozmiar planszy");
        int wymiar = new Scanner(System.in).nextInt();
        char[][] plansza = new char[wymiar][wymiar];
        int movesCounter = 0;
        char activePlayer = 'X';

        while (true) {
            printplansza(plansza);
            boolean ruchpoprawny = wykonajruch(plansza, activePlayer);
            if (ruchpoprawny) {
                boolean wygranawiersze = sprawdzwiersze(plansza,activePlayer);
                boolean wygranakolumny = sprawdzkolumny(plansza,activePlayer);
                boolean wygranaskos1 = sprawdzskos1(plansza,activePlayer);
                boolean wygranaskos2 = sprawdzskos2(plansza,activePlayer);
        if(wygranawiersze|| wygranaskos1 || wygranaskos2 || wygranakolumny){
            System.out.println("Gratulacje");

                activePlayer = activePlayer == 'X' ? 'O' : 'X';
            } else {
                System.out.println("Ruch niepoprawny, spróbuj ponownie");
            }
        }
        printplansza(plansza);
        System.out.println("Koniec gry :)");
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

