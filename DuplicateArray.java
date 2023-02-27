package ArrayDemos;


public class DuplicateArray {

    static boolean isFind(int[]arr, int value){
        for(int i:arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] list={3,3,5,6,6,6,7,9,10,10,5,2,4,4};
        int [] duplicate=new int[list.length];
        int index=0;
        for(int i=0; i<list.length; i++){
            for(int j=0; j<list.length; j++){
                if((i!=j) && (list[i]==list[j])){
                    if(!isFind(duplicate,list[i])){
                        duplicate[index++]=list[i];
                    }
                    break;
                }
            }
        }
        for(int value: duplicate){
            if(value!=0 && value%2==0){
                System.out.println(value);
            }
        }
    }
}
