package sk.kosickaakademia.deco.arraylist;

import java.lang.IndexOutOfBoundsException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrList=new ArrayList<>();
        arrList.add("Adam");
        arrList.add("Petra");
        arrList.add("Karol");

        System.out.println("Number of elements in Arraylist: "+arrList.size());

        try{
            System.out.println(arrList.get(1));
            arrList.remove(0);
            System.out.println(arrList.get(1));
            System.out.println(arrList.get(1));

        }catch (IndexOutOfBoundsException e){
            System.out.println("test");
            e.printStackTrace();
        }

        ///

        ArrayList<Integer> integers=new ArrayList<>();

        //fills ArrayList with Input value
        fillWithRandom(integers);

        //check if Input value exists as element
        containInteger(integers);

        //most common element/s
        mostFrequentElement(integers);

    }

    public static void containInteger(ArrayList<Integer> arrList) {
        Scanner scanner=new Scanner(System.in);
        System.out.println();
        System.out.print("Does ArrayList contain number: ");

        try{
            int guess = scanner.nextInt();
            if (arrList.contains(guess)) System.out.println("ano");
            else System.out.println("no");
        }catch (InputMismatchException e){
            e.printStackTrace();
        }
    }

    public static void fillWithRandom(ArrayList<Integer> arrList) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number of integers to add into ArrayList: ");
        try{
            int x = scanner.nextInt();

            int count = 0;

            for (int i = 0; i < x; i++) {
                Random r = new Random();
                int ri = r.nextInt(100);
                arrList.add(ri);
                if (count == 50) {
                    System.out.println();
                    count = 0;
                }
                System.out.print(ri + " ");
                count++;
            }
            System.out.println();
        }catch (InputMismatchException e){
            e.printStackTrace();
        }
    }

    public static void mostFrequentElement(ArrayList<Integer> arrList) {
        int numbFreq=0;
        HashSet<Integer> finalNumbers=new HashSet<>();

        for (Integer help : arrList) {
            int helpFreq=Collections.frequency(arrList,help);
                if (helpFreq > numbFreq) {
                    finalNumbers.clear();
                    numbFreq = helpFreq;
                    finalNumbers.add(help);
                }
                //if there are more than one elements of the same frequency
                if (helpFreq == numbFreq) {
                    finalNumbers.add(help);
                }
        }
        if (numbFreq>1){
            System.out.println("Number/s " + finalNumbers
                    + " is/are the most frequent(" + numbFreq + "times) in this collection.");
        }
        else System.out.println("Collection doesn't contain duplicate numbers.");
    }
}
