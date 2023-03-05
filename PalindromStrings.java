package Projects;

import java.util.Scanner;

public class PalindromStrings {

    static boolean isPalindrom(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str;
        System.out.println("Kontrol etmek istedginiz kelimeyi giriniz:");
        str=input.nextLine();
        if(isPalindrom(str)){
            System.out.println("Girilen kelime Palindromdur");
        }else{
            System.out.println("Girilen kelime Palindrom DEGILDIR");
        }
    }
}
