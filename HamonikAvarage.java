package ArrayDemos;

public class HamonikAvarage {
    public static void main(String[] args) {
        int[] list={2,4,6,100};
        double avarage;
        double sum=0.0;
        for(double i:list){
            sum=sum+(1/i);
        }
        avarage=list.length/sum;
        System.out.println(avarage);
    }
}
