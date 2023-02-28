package ArrayDemos;
import java.util.Scanner;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int index;
        int counter=0;
        int i=0;
        System.out.println("Eleman sayisini giriniz : ");
        index=input.nextInt();
        int[] list=new int[index];

        do{
            System.out.println((counter+1)+". Elemanini giriniz :");
            list[i]=input.nextInt();
            counter++;
            i++;
        }while(counter!=list.length);
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
