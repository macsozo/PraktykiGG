package zadanie11;
import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        //(Losowanie 2-óch liczb z tablicy PRZYKŁAD 5 i porównanie ich na koniec(>,==,<))
        Random random = new Random();
        double[] power = {23.45,-2.22,45.90,67.45,-56,234.11,-34.8,90.4,-77};
        for(int i=0; i<10; i++){
            int randomValueOne = random.nextInt(9);
            int randomValueTwo = random.nextInt(9);
            if ( power[randomValueOne] > power[randomValueTwo] ){
                System.out.println("Liczba: " + power[randomValueOne] + " > " + power[randomValueTwo]);
            }
            else
            {
                System.out.println("Liczba: " + power[randomValueOne] + " < " + power[randomValueTwo]);
            }
        }
    }
}