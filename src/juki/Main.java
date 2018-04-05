package juki;

import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
        }

        public static int[] getIntegers(int capacity){
            int[] array = new int[capacity];
            System.out.println("Enter "+capacity +" integer values: \r");
            for (int i = 0; i < array.length; i++) {
                array[i]=sc.nextInt();
            }

            return array;
        }

        public static void printArray(int[] array){
            for (int i = 0; i <array.length ; i++) {
                System.out.println("Element "+ i + " contents " + array[i]);
            }
        }

        public static int[] sortIntegers(int[] array){
//        int [] sortedArray = new int[array.length];
//            for (int i = 0; i <array.length ; i++) {
//                sortedArray[i] = array[i];//creating&saving a copy of the first array
//            }
            int [] sortedArray = Arrays.copyOf(array, array.length);
                    boolean flag = true;
            int temp;

            while (flag){               //set to true, go in while
                flag = false;           //if forLoop= sort array, flag = true, if not - false
                //element 0  50, vtor loop element 0  150, 3 loop site check ke se false
                //element 1  150, vtor loop element 1  50
                //element 2  40, vtor loop element 2  40
                for (int i = 0; i <sortedArray.length-1 ; i++) {
                    if(sortedArray[i]<sortedArray[i+1]){
                        temp = sortedArray[i];                  //stored the actual value to temp
                        sortedArray[i]= sortedArray[i+1];           //move to next element
                        sortedArray[i+1]=temp;                  //set temp to next element
                        flag = true;
                    }
                }
            }
            return sortedArray;
        }
    }

