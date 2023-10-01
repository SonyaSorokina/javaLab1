import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        int n = 0;
        while ( true )
        {
            System.out.println("Введите число строк");
            Scanner sc1 = new Scanner(System. in );
            try
            {
                n = sc1.nextInt();
                break;
            }
            catch(InputMismatchException fg)
            {
                System.out.print("Вы ввели не число. " );
            }
        }
        String[] str = new String[n];
        Scanner sc2 = new Scanner(System.in);
        for (int i = 0; i < n; i++)
        {
            System. out.println( " Введите строку №" + (i+1));
            str[i] = sc2.nextLine();
        }
        int min = str[0].length();
        String answ = new String(str[0]);
        for (int i = 0; i < n; i++){
            if (str[i].length()<min){
                min = str[i].length();
                answ = str[i];
            }
        }
        System.out.print("Самая короткая строка: " + answ + " ее длинна " + min + " символов!");
    }
}