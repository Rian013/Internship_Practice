// Write a program that takes a list of integers as input and returns the largest integer in the list.
import java.util.ArrayList;
import java.util.Collections;

public class LargestArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // add integers to the list
        numbers.add(10);
        numbers.add(25);
        numbers.add(7);
        numbers.add(32);
        numbers.add(15);
        numbers.add(27);
        
        // call the function to find the largest integer in the list
        int largest = findLargestInteger(numbers);
        
        // print the largest integer
        System.out.println("The largest number in the list is: " + largest);
    }

    public static int findLargestInteger(ArrayList<Integer> numbers) {
        // sort the list in ascending order
        Collections.sort(numbers);

        // the largest integer is at the end of the list
        int largest = numbers.get(numbers.size() - 1);

        return largest;
    }
}