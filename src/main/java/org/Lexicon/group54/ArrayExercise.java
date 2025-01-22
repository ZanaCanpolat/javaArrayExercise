package org.Lexicon.group54;

import java.lang.reflect.Array;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class ArrayExercise
{

    public static void main(String[] args)
    {

         // Write a program which will store elements in an array of type ‘int’ and print it out.
        System.out.println("----------------- Array Exercise 1 ----------------- ");
        int [] arrayOfIntegers = {9, 1, 7, 90, 3, 99};
        System.out.println("Array Of Integers = " + Arrays.toString(arrayOfIntegers));
        System.out.println();


        //Create a program and create a method with name ‘indexOf’ which will  find and return the index of an
        // element in the array. If the element doesn’t exist your method should return -1 as value.
        // If the element is found, position is printed otherwise -1 is printed.
        System.out.println("----------------- Array Exercise 2 ----------------- ");
        int numberToFind = 900;
        if (indexOf(arrayOfIntegers, numberToFind) == -1)
        {
            System.out.println("Nr " +numberToFind +" is not in the array.");
        }
        else{
        System.out.println("Nr " +numberToFind +" is at the position: " +(indexOf(arrayOfIntegers, numberToFind)));
        }
        System.out.println();


        // Write a program which will sort string array.
        System.out.println("----------------- Array Exercise 3 ----------------- ");
        String [] arrayOfCities = {"Paris", "London", "NewYork", "Stockholm"};
        Arrays.sort(arrayOfCities); // This line sorts the array in alphabetical order. It is case sensitive.
        System.out.println("Sorted array of cities (Case sensitive) = " + Arrays.toString(arrayOfCities));
        Arrays.sort(arrayOfCities, String.CASE_INSENSITIVE_ORDER);  // This line sorts the array without considering the first letter in the word is capital or not.
        System.out.println("Sorted array of cities (Non case sensitive) = " + Arrays.toString(arrayOfCities));
        System.out.println();


        //Write a program which will copy the elements of one array into another
        //array.
        System.out.println(" ----------------- Array Exercise 4 ----------------- ");
        arrayOfIntegers = new int[]{1, 15, 20};
        int [] copyOfArray = arrayOfIntegers.clone();
        System.out.println("Copied array = " + Arrays.toString(copyOfArray));
        System.out.println("Original array = " + Arrays.toString(arrayOfIntegers));
        System.out.println();


        //Create a two-dimensional string array [2][2]. Assign values to the
        //2-dimentional array containing any Country and City.
        System.out.println(" ----------------- Array Exercise 5 ----------------- ");
        String [][] arrayCountryCity = {{"France", "Paris"} , {"Sweden", "Stockholm"}};
        printTwoDimensionalArray(arrayCountryCity);
        //The line of code below is used to print out multidimensional arrays.
        //System.out.println("Arrays.deepToString() = " + Arrays.deepToString(arrayCountryCity));
        System.out.println();


        //Write a program which will set up an array to hold the next values in this
        //order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
        System.out.println(" ----------------- Array Exercise 6 ----------------- ");
        arrayOfIntegers = new int[]{43, 5, 23, 17, 2, 14};
        System.out.println("Average of the elements in the array = " + calculateAverage(arrayOfIntegers));
        System.out.println();


        //Write a program which will set up an array to hold 10 numbers and print
        //out only the uneven numbers
        System.out.println(" ----------------- Array Exercise 7 ----------------- ");
        arrayOfIntegers = new int[]{1, 2, 4, 7, 9, 12};
        printUnevenNumbers(arrayOfIntegers);  // Prints out uneven numbers.
        printEvenNumbers(arrayOfIntegers);// Prints out even numbers
        System.out.println();

        //Write a program which will remove the duplicate elements of a given
        //array [20, 20, 40, 20, 30, 40, 50, 60, 50]
        System.out.println(" ----------------- Array Exercise 8 ----------------- ");
        arrayOfIntegers = new int[]{20, 20, 40, 20, 30, 40, 50, 60, 50};
        int[] tempArrayOfIntegers = removeDuplicateElements(arrayOfIntegers);
        System.out.println("Array without duplicate elements = " + Arrays.toString(removeDuplicateElements(arrayOfIntegers)));



    }

    //This method will remove duplicate elements in an array and returns the array without duplicate elements.
    //The method first sorts the given array to set the duplicate elements next to each other.
    public static int[] removeDuplicateElements(int[] array)
    {

        Arrays.sort(array); // This line sorts the array in ascending order, if the array is not sorted the method will not work.
        int [] tempArray = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length-1; i++)
        {
            if (array[i] != array[i + 1])
            {
                tempArray[j] = array[i];
                j = i;
            }
        }
        tempArray[j] = array[array.length - 1];  //This line is used to add the last element in the array to the new array, without it it does not add the last element.

        return ArrayUtils.removeAllOccurrences(tempArray, 0); // This line removes all zeros from the array.

    }

      /*Ask Elnaz about the method below.
        // Here is a problem this creates an array with the same length as the original array, which will give us an array with zeros at the end.
        // Possible solution is to search throw the array and check if it contains any zeros,
        // if it holds zero, then we can ad this to the array that we
        // iterate throw the new array and count all the zeros so that we can remove those and if the original array
        // contained a zero we create a new array (array - how many zeros + zero for the original array if it contained a zero)
        // return the array.
        Arrays.sort(array); // This line sorts the array in ascending order, if the array is not sorted the method will not work.
        int countingZero = 0;
        int [] tempArray = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length -1; i++)
        {
            if (array[i] == 0)
            {
              countingZero++;
            }
            if (array[i] != array[i + 1])
            {
                tempArray[j] = array[i];
                j = i;
            }
        }

        //If no Zeros was in the array then clean the array and return it, If zero found in array, clean the unnecessary
        //zeros and return the array
        if(countingZero == 0)
        {
            for (int i = 0; i < tempArray.length -1; i++)
            {
                if (tempArray[i] == 0)
                {
                    countingZero++;
                }
            }
        }
        return tempArray;
    }

       */


    //This method will go through the array and print out only the uneven numbers.
    public static void printUnevenNumbers(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 2 != 0)
            {
                System.out.println("Uneven number = " + array[i]);
            }
        }
    }

    //This method will go through the array and print out only the uneven numbers.
    public static void printEvenNumbers(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 2 == 0)
            {
                System.out.println("Even number = " + array[i]);
            }
        }
    }


    //This method is used to calculate the average of the elements in the array.
    public static float calculateAverage(int[] array)
    {
        float sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        return sum / array.length;
    }


    //The method below prints out two dimensional array. It takes a two dimensional array as a parameter, iterates
    // throw the array and prints out the elements.
    public static void printTwoDimensionalArray(String[][] array)
    {
        // This line of code prints out two dimensional array {1, 2}{1, 2}
        // System.out.println("Arrays.deepToString() = " + Arrays.deepToString(array));

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
    }

    //This method will find and return the index of an element in the array.
    // If the element doesn’t exist your method should return -1 as value.
    public static int indexOf(int[] array, int element)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == element)
            {
                return i;
            }
        }
        return -1;
    }





}
