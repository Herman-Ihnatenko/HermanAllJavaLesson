package HomeWork09;

import java.util.Random;

public class Task_03 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[50];
        int i = 0;
        int k = 2;// число на которое делим
        int p = 0;

        while (i < array.length) {
            array[i] = random.nextInt(100) + 1;
            //System.out.println("i = "+i+" "+array[i] + ", ");
            System.out.print(array[i] + ", ");
            while (k < array[p] && p < array.length){
                if(array[p] % k == 0) {
                    p++;
                }else{
                    k++;
                    if(k == array[p]){
                        System.out.println("прост "+array[p]);
                        k = 2;
                        p++;
                    }
                }
            }
            i++;
        }

    }
}
