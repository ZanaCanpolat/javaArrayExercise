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




    }

    //This method will find and return the index of an element in the array.
    // If the element doesn’t exist your method should return -1 as value.
    public static float indexOf(int[] array, int element)
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
