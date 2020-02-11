//import java.util.Arrays;
public class Arrays {
    //consturctor
    //need a function to find max and min values of the array and tracks the indexes
    // Then swap the values at these indexes

    public static int[] swapLargestAndSmallest(int[] array) {
        int minimumIndex = 0;       //assign
        int maximumIndex = 0;
        for (int index = 1; index < array.length; ++index) {
            if (array[index] < array[minimumIndex])
                minimumIndex = index;
            if (array[index] > array[maximumIndex])
                maximumIndex = index;
        }
        int temporary;
        if (maximumIndex != minimumIndex) {
            temporary = array[maximumIndex];
            array[maximumIndex] =  array[minimumIndex];
            array[minimumIndex] = temporary;

        }
        return array;
    }


}

 /*
 Scratch work
        java.util.Arrays.sort(array);
        System.out.print("array sorted: ");
        for(int i=0; i<array.length;i++) {
            System.out.print(" " + array[i]);
        }
        // int[] array1 = new int[]{5, 4, 1, 9, 2, 6};
        int min = 0;
        int max = 0;
        min = array[0];// min
        max = array[array.length - 1];//max
        array[array.length - 1] = min;
        array[0] = max;
        System.out.print("\narray swapped: ");
        for(int i=0; i<array.length;i++) {
            System.out.print(" " + array[i]);
        }
       // System.out.print("\n returning array ");
       // return array;
    }

    public int toString(int[] array1) {
    for(int i=0; i<array1.length;i++) {
        //System.out.println("array1: " + array1);
        System.out.print("\n returning array ");
        return array1[i];
    }
        return Integer.parseInt(null);
    }

  */




//  int minimumNumber;
// int maximumNumber;
// System.out.println("Enter 10 double array between 1 to 100");
// for (int i = 0; i < 10; i++) {
//   array[i] = input.nextDouble();
// int i;
//   array[i] = new double[] {5, 4, 1, 9, 2, 6};
//  }

        /*
        int minimum = array[0];
        int maximum = array[0];
        minimum = array[0];
        maximum = array[0];


        int j;
        int k;
        for (int i = 0; i < array.length; i++) {
            //for (j = 0; j < array.length; j++) {
            //  for (k = 1; k < array.length; k++) {
            if (array[i] < minimum) {
                minimum = array[i];
                System.out.println("minimum = " + minimum + " array[i]= " + array[i]);
            }

            if  (array[i] > maximum) {
                maximum = array[i];
                System.out.println("maximum = " + maximum + " array[i]= " + array[i]);
                //array[i] = minimum;
                System.out.println("swapping. min = " + minimum + " array[i]= " + array[i]);
            }
                if (array[i] < minimum) {
                        minimum = array[i];
                        array[i] = maximum;
                        System.out.println("swapping. max = " + maximum + " array[i]= " + array[i]);

                    }
                }


        for (i = 0; i < array.length; i++) {
            System.out.println(" array[i]= " + array[i]);


        }
    }
}

         */
        /*
        //minimumNumber = min(array);
        double minimum = array[0];
        minimum = array[0];
        int i;
        for (i = 1; i < 10; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
                System.out.println("minimum = " + minimum + " array[i]= " + array[i]);
            }
        }

            // maximumNumber = max(array);
            double maximum = array[0];
            // int i;
        int index;
            for (i = 1; i < 10; i++) {
                if (array[i] > maximum) {
                    maximum = array[i];
                    index=i;

                    System.out.println("maximum = " + maximum + " array[i]= " + array[i]);
                }
            }

        System.out.println("maximum = " + maximum + " array[i]= " + array[index]);
        array[i] = minimum;

      //

        minimum = array[0];
        for (i = 1; i < 10; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
                System.out.println("minimum = " + minimum + " array[i]= " + array[i]);

            }
        }
       // array[i] = maximum;
*/
        /*
        System.out.println("minimum " + minimumNumber);
        System.out.println("maximum " + maximumNumber);
        System.out.println("Exchange max and min values" );
        maximumNumber = min(array);
        minimumNumber = max(array);
        System.out.println("display \nminimum " + minimumNumber);
        System.out.println("maximum " + maximumNumber);

         */


/*
    private static double min(double[] array) {
        double minimum =array[0];
        minimum = array[0];
        int i;
       for( i = 1; i<10; i++){
           if(array[i] < minimum){
              // minimum = array[i];
           }
       }
       return minimum;
    }

    private static double max(double[] array) {
        double maximum =array[0];
        int i;
        for( i = 1; i<10; i++){
            if(array[i] > maximum){
                maximum = array[i];
            }
        }
        return maximum;
    }
}
*/


/*

public class Arrays {

    //consturctor

        //create two double arrays of size d.length
        //sort array sdata

    public int[] swapLargestAndSmallest(int[] array) {
        java.util.Arrays.sort(array);
        // int[] array1 = new int[]{5, 4, 1, 9, 2, 6};
        int min = 0;
        int max = 0;
        min = array[0];// min
        max = array[array.length - 1];//max
        array[array.length - 1] = min;
         array[0] = max;

        return array;


    }

}
/*


public class SmallesElement {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        // int size=0;
        double[] numbers = new double[10]; //create array, size 10
        double minimumNumber;
        double maximumNumber;
        System.out.println("Enter 10 double numbers between 1 to 100");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
            // int i;
            //   numbers[i] = new double[] {5, 4, 1, 9, 2, 6};
        }




        //minimumNumber = min(numbers);
        double minimum = numbers[0];
        minimum = numbers[0];
        int i;
        for (i = 1; i < 10; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }

        // maximumNumber = max(numbers);
        double maximum = numbers[0];
        // int i;
        for (i = 1; i < 10; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }
        //  numbers[i] = minimum;

        minimum = numbers[0];
        for (i = 1; i < 10; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }
        // numbers[i] = maximum;

        /*
        System.out.println("minimum " + minimumNumber);
        System.out.println("maximum " + maximumNumber);
        System.out.println("Exchange max and min values" );
        maximumNumber = min(numbers);
        minimumNumber = max(numbers);
        System.out.println("display \nminimum " + minimumNumber);
        System.out.println("maximum " + maximumNumber);

         */
/*
        System.out.println("Expected: ");
        for (i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
        }
    }
}
*/
/*
    private static double min(double[] numbers) {
        double minimum =numbers[0];
        minimum = numbers[0];
        int i;
       for( i = 1; i<10; i++){
           if(numbers[i] < minimum){
              // minimum = numbers[i];
           }
       }
       return minimum;
    }

    private static double max(double[] numbers) {
        double maximum =numbers[0];
        int i;
        for( i = 1; i<10; i++){
            if(numbers[i] > maximum){
                maximum = numbers[i];
            }
        }
        return maximum;
    }
}
*/
