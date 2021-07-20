package com.tema2;

import java.text.DecimalFormat;
import java.util.*;


public class Main {


    //Method that sorts an Array of numbers.
    public void sortNumArray(int[] numArr) {
        Arrays.sort(numArr);
        System.out.println(Arrays.toString(numArr));
    }

    //Method that sorts an Array of Strings.
    public void sortStringArray(String[] strArr) {
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
    }

    //Method that finds the common elements between 2 arrays.
    public void findCommonElements(String[] strArr, String[] strArr2) {
        for (String value : strArr) {
            for (String s : strArr2)
                if (value.equals(s)) {
                    System.out.println(s);
                }
        }
    }
    public static void convertArraytoArrayList(String[] strArr) {
        List<String> lista = Arrays.asList(strArr);
        System.out.println(lista);

    }

    //A method that iterates all the elements from an Array list and prints them.
    public static void iterateArrayList(ArrayList<Object> list) {
        for (int i = 0; i < list.size(); ++i) {
            System.out.println(list.get(i));
        }
    }

    //A method that reverses a list.
    public static void reverseList(ArrayList<Object> list) {
        Collections.reverse(list);
        System.out.println(list);
    }

    //A method that empties a list.
    public static void emptyList(ArrayList<Object> list) {
        list.clear();
        System.out.println(list);
    }

    //A method that checks if a list is empty.
    public static void checkEmptyList(ArrayList<Object> list) {
        boolean empty = list.isEmpty();
        if (empty) {
            System.out.println("The list is empty!");
        } else {
            System.out.println("The list is not empty!");
        }
    }

    //A method that generates 10 numbers to 1-100 and prints a list of the numbers grater or equal to 10
    public static void getRandomNumber(int min, int max) {
        int[] randomNumbers = new int[10];
        Random random = new Random();
        List<String> collectionlist = new ArrayList<String>();
        for (int i = 0; i < 10; ++i) {
            randomNumbers[i] = random.nextInt(max - min) + min;
            if (randomNumbers[i] >= 10) {
                collectionlist.add(String.valueOf(randomNumbers[i]));
            }
        }
        for (int i = 0; i < 10; ++i)
            System.out.println(randomNumbers[i]);
        System.out.println(collectionlist);
    }


    //A method that produce the average of up to 20 grades
    public static Object average(int[] array, int number) {
            double sum=0; double average=0;
            for(int i=0;i<number;++i)
            {
                sum+=array[i];
                average=sum/number;
            }
            String pattern = "##.00";
             DecimalFormat decimalFormat = new DecimalFormat(pattern);
             String finalaverage = decimalFormat.format(average);
             return finalaverage;

    }

    public static void gradesAverage() {
        Scanner aScanner = new Scanner(System.in);
        int[] numarray = new int[20];
        int numbers = 20;
        System.out.println("Enter Ints (-1 to finish input): ");
        {
            for (int i = 0; i < numbers; ++i) {
                numarray[i] = aScanner.nextInt();
                if (numarray[i] == -1) {
                    numbers = i;
                    break;
                }
            }
        }
        System.out.println(average(numarray,numbers));
    }

    //A method that reverse a list
    public static void reverse(Object... args)
    {
        List<Object> list = new ArrayList<Object>();
        for(Object arg : args)
        {
            list.add(arg);
        }
        reverseList((ArrayList<Object>) list);
    }

    //A method that binds keys to values
    public static void keyToValues()
    {
        HashMap<String, String> hmap = new HashMap<String, String>();
        hmap.put("a1234","Adrian");
        hmap.put("b4321","Vlad");
        hmap.put("c3241","Mihai");
        hmap.put("d1432","Calin");
        hmap.put("e2431","Iulian");
        String var= hmap.get("b4321");
        System.out.println(var);
    }

    public static void main(String[] args) {
        String[] strArr = {"maria", "si", "vlad", "ana", "are", "mere", "pere", "si", "prune"};
        String[] strArr2 = {"vlad", "are", "mere", "si", "prune", "sau", "nu"};

        int numArr[] = {27, 53, 8, 6, 45, 21, 9, 254, 98};

        ArrayList<Object> list = new ArrayList<Object>();
        list.add("ddd");
        list.add(2);
        list.add(11122.33);
        //System.out.println("1.Write a Java program to sort a numeric array and a string array. Check and use available Arrays methods.");
        //sortNumArray();
        //sortStringArray();
        //System.out.pringln("2.Write a Java program to find the common elements between two arrays (string values). Use two for loops to cover every element in the arrays.");
        //findCommonElements();
        //System.out.println("3.Write a Java program to convert an array to ArrayList.")
        //convertArraytoArrayList(strArr);
        //System.out.println("4.Write a Java program to iterate through all elements in a array list and print them.")
        //iterateArrayList(list);
        //System.out.println("5.Write a Java program to reverse elements in a array list. Check available methods in Collections class.")
        //reverseList(list);
        //System.out.println("6.Write a Java program to empty an array list and write another program to test if the array list is empty.")
        //emptyList(list);
        //checkEmptyList(list);
        //System.out.println("7.First, generate 10 1-100 random numbers, then put them in an array. Put the numbers from the array greater than or equal to 10 into a list collection and print them to the console.")
        //getRandomNumber(1,100);
        //System.out.println("8.Write a application that allows the user to enter up to 20 integer grades into an array. Stop the loop by typing in ‐1. Your main method should call an Average method that returns the average of the grades. Use the DecimalFormat class to format the average to 2 decimal places.")
        //gradesAverage();
        //System.out.println("9.Write a function that takes an arbitrary number of integers as arguments and returns a collection of them stored in reverse order.")
        //reverse(1,2,3,4,5,6,7,8,9,0);
        //System.out.println("12.Make a Map that associates the following employee IDs with names. The point here is to associate keys with values, then retrieve values later based on keys. Test several valid and invalid ID’s and print the associated name.")
        //keyToValues();
    }
}