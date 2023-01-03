package code.dgamboa.bootcamp;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Arithmetic {

    public static boolean isMultiple(int a, int b){
        return a % b == 0;
    }
    public static boolean isEven(int a){
        return isMultiple(a,2);
    }

    public static boolean isOdd(int a){
        return !isEven(a);
    }

    public static double differenceOfSquare(int a, int b){
        return Math.pow(a,2) - Math.pow(b,2);
    }

    public static int sumOfDigits(int n) {
        var sum = 0;
        while (n > 0) {
            var lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        return sum;
    }

    public static int sumOfDigits2(int n) {
        return IntStream.iterate(n, number -> number / 10)
                .takeWhile(element -> element != 10)
                .map(element -> element % 10)
                .sum();
//                .reduce((a, b) -> a + b);
    }

    public static int digitSum(int n) {
        var sum = sumOfDigits(n);
        while (sum > 9) {
            sum = sumOfDigits(sum);
        }
        return sum;
    }

    public static int digitSum2(int n) {
        return IntStream.iterate(n, number -> sumOfDigits(number))
                .dropWhile(number -> number >= 10)
                .findFirst()
                .orElse(0);
    }
    public static double numericSerie2(int totalTerms){
        var n = 1.0;
        var sum = 0.0;
        var term = 1.0;
        while (term <= totalTerms) {
            sum += 1.0 / n;
            n = n+2;
            ++term;
        }
        return sum;
    }

    public static double numericSerie3(int terms) {
        return DoubleStream.iterate(1.0, n -> n + 2)
                .map(n -> 1.0 / n)
                .limit(terms)
//                .forEach(System.out::println)
                .sum();
    }

    public static boolean isPrime(int num){
        boolean validate = false;
        for (int i = 2; i <= num / 2; i++) {
            validate = num % i == 0 ? false : true;
        }
        return validate;
    }
}
