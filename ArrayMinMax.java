package ArrayDemos;

public class ArrayMinMax {
    public static void main(String[] args) {
        int [] list={34,65,8,-2,67,-33};
        int min=list[0];
        int max=list[0];
        for(int i:list){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
        }
        System.out.println("min : "+min+"\n"+"max : "+max);
    }
}
