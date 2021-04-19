package rom.edu;

/* @author   Romanyuk Bohdan
   @project   CourseTask3
   @class  Main
   @version  1.0.0
   @since 19.04.2021 - 19.09
  */

import java.util.Arrays;
class RightShift {
    public static int[] rightShift(int[] array, int step){
        System.out.println("Original array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for(int i = 0; i < step; i++){
            int j, last;
            last = array[array.length-1];

            for(j = array.length-1; j > 0; j--){
                array[j] = array[j-1];
            }
            array[0] = last;
        }

        System.out.println();

        System.out.println("Array after right rotation: ");
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        System.out.println(Arrays.toString(rightShift(array, 1))); // [30, 10, 20]

        int[] array2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(rightShift(array2, 2))); // [40, 50, 10, 20, 30]

        int[] array3 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(rightShift(array3, 21))); // [50, 10, 20, 30, 40]
    }
}
