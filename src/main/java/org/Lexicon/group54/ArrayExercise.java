package org.Lexicon.group54;

import java.util.Arrays;

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
