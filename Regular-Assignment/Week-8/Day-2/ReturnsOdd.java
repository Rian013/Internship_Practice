// Write a program that takes a list of integers as input and returns a new list that contains only the odd integers.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> getOddNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> oddNumbers = getOddNumbers(numbers);
        System.out.println(oddNumbers);
    }
}