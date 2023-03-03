package Projects;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuessNumGame {
    public static void main(String[] args) {
        Random random=new Random();
        int number= random.nextInt(100);

        Scanner input=new Scanner(System.in);
        int right=0;
        int selected;
        int[]wrong=new int[5];
        boolean isWin=false;

        while(right<5){
            System.out.println("Bir sayi giriniz :");
            selected=input.nextInt();
            if(selected>100 || selected<0){
                System.out.println("Lutfen 0-100 arasinda bir deger giriniz");
                continue;
            }

            if(selected==number){
                isWin=true;
                break;
            }else{
                wrong[right]=selected;
                right++;
                System.out.println("Bilemediniz!!!!....");
                if(selected>number){
                    System.out.println(selected+" sayisi gizli sayidan buyuktur ");
                }else{
                    System.out.println(selected+" sayisi gizli sayidan kucuktur ");
                }
                System.out.println("Kalan Hakkiniz :"+(5-right));
            }

        }
        if(!isWin){
            System.out.println("GAME OVER");
            System.out.println("Tahminleriniz :"+ Arrays.toString(wrong));
        }
    }
}
