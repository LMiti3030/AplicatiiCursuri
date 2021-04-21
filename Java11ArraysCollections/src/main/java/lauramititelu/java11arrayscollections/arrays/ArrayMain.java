package lauramititelu.java11arrayscollections.arrays;

import java.util.Arrays;

public class ArrayMain {
    public static void main(String[] args) {
        int[] ids = new int[10];
        //System.out.println(ids[0]);

        String[] instruments = new String[]{"guitar", "cello", "violin", "piano", "drum", "bass"};
        //System.out.println(instruments[1]);
       // System.out.println(instruments.length);

        for(int i=0; i< ids.length; i++){
            ids[i] = i * i;
            System.out.println(ids[i]);
        }

        Arrays.sort(instruments);
//        for(String s: instruments){
//            System.out.println(s);
//        }
        System.out.println(Arrays.toString(instruments));

        int[] fibArray = new int[]{0, 1, 5, 2, 3, 1, 8, 13};
        Arrays.sort(fibArray);
        System.out.println("Sorted fibArray " + Arrays.toString(fibArray));
        System.out.println(Arrays.binarySearch(fibArray, 3));

        System.out.println(Arrays.toString(args));

    }
}
