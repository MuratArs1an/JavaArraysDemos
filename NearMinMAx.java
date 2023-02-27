package ArrayDemos;
import java.util.Arrays;

public class NearMinMAx {
    public static void main(String[] args) {
        int [] list={-2,-40,7,89,1098,-12,70};
        int num=70;
        int min=list[0];
        int max=list[0];
        int nearMin;
        int nearMax;
        //listemizi siraladik
        Arrays.sort(list);
        //binarSearch ile verilen sayinin index numarsini bulduk
        int index=Arrays.binarySearch(list,num);
        //en buyuk ve en kucuk elemanlari tespit ettik
        // verilen sayi en buyuk veya en kucuk olma durumunda hata alabiliriz cunku
        for(int i:list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        //verilen sayi en buyuk veya kucukse bunu en yakin sayi olarak verdik
        // degilse sirali oldugu icin bir ust ve bir altindaki sayilari aldik
        if(list[index]==min){
            nearMin=min;
        }else{
            nearMin=list[index-1];
        }
        if(list[index]==max){
            nearMax=max;
        }else{
            nearMax=list[index+1];
        }
        System.out.println("Girilen sayi: "+num);
        System.out.println("Girilen sayidan kucuk en yakin sayi: "+ nearMin);
        System.out.println("Girilen sayidan buyuk en yakin sayi: "+ nearMax);
    }
}
