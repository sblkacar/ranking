import java.util.Scanner;

public class Ranking {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sayı1,sayı2,sayı3;
        System.out.println("Sayı 1 giriniz");
        sayı1= input.nextByte();
        System.out.println("Sayı 2 giriniz");
        sayı2=input.nextByte();
        System.out.println("sayı 3 giriniz");
        sayı3=input.nextByte();
        if (sayı1>sayı2 && sayı1>sayı3)
        {
            if (sayı2>sayı3){
                System.out.println("Sayı1>Sayı2>Sayı3");
            }
            else {
                System.out.println("Sayı1>Sayı3>Sayı2");
                
            }
        } else if (sayı2>sayı1 && sayı3>sayı1) {

            if (sayı2>sayı3){
                System.out.println("Sayı2>Sayı3>Sayı1");
            }
            else {
                System.out.println("Sayı3>Say2>Sayı1");
            }
            if (sayı3>sayı1 && sayı3>sayı2) {
                if (sayı3>sayı1)
                {
                    System.out.println("Sayı3>Say2>Sayı1");
                }

            }
            
        }


    }
}
