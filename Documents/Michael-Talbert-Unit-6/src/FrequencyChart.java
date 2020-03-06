import java.sql.SQLOutput;
import java.util.Scanner;

public class FrequencyChart {
    //Class stuff
    private int[] list;

    //Constructor
    public FrequencyChart(int[] list){
        this.list = list;
    }

    //Methods
    public String makeChart(){
        int countMin = 0;
        int countMax = 10;
        int count = 0;
        int[] lengths = new int[10];

        for (int n = 0; n<10; n++) {

            for (int i = 0; i < list.length; i++) {

                if (list[i] < countMax && list[i] > countMin) {
                    count++;
                }
            }

            lengths[n] = count;

            countMin+= 10;
            countMax+=10;
        }
    }

    //End class stuff

    //Start main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("how many values in your data set");
        int size = scan.nextInt();

        int[] data = new int[size];

        System.out.println("enter data values one at a time followed by enter");
        int val = 0;

        for (int i = 0; i < data.length; i++){
            val = scan.nextInt();
            data[i] = val;
        }

        FrequencyChart chart = new FrequencyChart(data);
    }
}
