package ArrayDemos;

public class ArrayFrekans {
    public static void main(String[] args) {
        int [] myArray= {10,10,20,20,5,5,5,5,1,3,3,100,100,100};
        int count = 0;
        for(int i = 0; i < myArray.length; i++){
            for(int j = 0; j < myArray.length; j++){
                if(myArray[i] == myArray[j]){
                    if(j < i){
                        break;
                    }
                    count++;
                }
            }
            if(count > 0){
                System.out.printf(myArray[i]+" sayisi " + count+" kere yazilmistir.\n" );
                count = 0;
            }
        }
    }
}
