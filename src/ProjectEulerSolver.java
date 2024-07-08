

import java.math.*;

import java.util.*;

import ProjectEulerMath.MathClass;

public class ProjectEulerSolver {
    public static int ProjectEuler1() {
        int sumM3 = 0;
        int sumM5 = 0;
        int sumM15 = 0;

        for (int i = 1; i < 1000; i++){
            if (i % 3 == 0){
                sumM3 = sumM3 + i;
                //int runningTotal = sumM3 + i; 
            }
            else if (i % 5 == 0){
                sumM5 = sumM5 + i;
                //int runningTotal = sumM5 + i;
            }
            else if (i % 15 == 0){
                sumM15 = sumM15 + i;
                //int runningTotal = sumM15 + i;

            }

        }
        return sumM3 + sumM5 - sumM15;
    }
    public static int ProjectEuler2() {
        int sum = 0;
        List<Integer> list = MathClass.Fibonacci(4000000);
        for (int element : list) {
            if (element % 2 == 0)
                sum = sum + element;
            
        }
        return sum;
    }
    public static long ProjectEuler3() {
        long i;
        long value = 600851475143L;
        for (i = 2L; i <= value; i++) {
            if (MathClass.isPrime(i) == true){
                while (value % i == 0){
                    value = value / i;
                }
            }
        }
        return i - 1;
    }
    public static int ProjectEuler4(){
        int largestPalindrome = 0;
        int temp_product = 0;
        int product = 0;
        for (int i = 100; i <= 999; i++){
            for (int j = 100; j <= 999; j++){
                product = i * j;
                if (MathClass.isPalindrome(product) == true && product > temp_product) {
                    temp_product = product;
                    largestPalindrome = product;
                }
            }
        }
        return largestPalindrome;
    }
    public static int ProjectEuler5() {
        int x = 1;
        int i = 1;
        while (true) {
            if (x % i == 0) {
                i++;
                if (x % i == 0) {
                    i++;
                    if (x % i == 0) {
                        i++;
                        if (x % i == 0) {
                            i++;
                            if (x % i == 0) {
                                i++;
                                if (x % i == 0) {
                                    i++;
                                    if (x % i == 0) {
                                        i++;
                                        if (x % i == 0) {
                                            i++;
                                            if (x % i == 0) {
                                                i++;
                                                if (x % i == 0) {
                                                    i++;
                                                    if (x % i == 0) {
                                                        i++;
                                                        if (x % i == 0) {
                                                            i++;
                                                            if (x % i == 0) {
                                                                i++;
                                                                if (x % i == 0) {
                                                                    i++;
                                                                    if (x % i == 0) {
                                                                        i++;
                                                                        if (x % i == 0) {
                                                                            i++;
                                                                            if (x % i == 0) {
                                                                                i++;
                                                                                if (x % i == 0) {
                                                                                    i++;
                                                                                    if (x % i == 0) {
                                                                                        i++;
                                                                                        if (x % i == 0) {
                                                                                            return x;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            x++;
            i = 1;
        }
    }
    public static int ProjectEuler6() {
        int sum_of_squares = 0;
        int square_of_sums = 0;
        for (int i = 1; i <= 100; i++) {
            int temp_product = i * i;
            sum_of_squares = sum_of_squares + temp_product;
        }
        square_of_sums = (100 * 101) / 2;
        square_of_sums = square_of_sums * square_of_sums;
        return square_of_sums - sum_of_squares;
    }
    public static int ProjectEuler7() {
        int i = 1;
        List<Integer> list = new ArrayList<Integer>();
        while (list.size() < 10001) {
            if (MathClass.isPrime(i)) list.add(i);
            i++;
        }
        return i - 1;
    }
    public static long ProjectEuler8() {
        return 0; //placeholder return
    }
    public static long ProjectEuler9() {
        long product = 1;
        long a = 1;
        long b = 1;
        long c = 1;
        for (a = 1; a <= 1000; a++) {
            for (b = 1; b <= 1000; b++) {
                c = 1000 - (a + b);
                if (MathClass.isPythagorean(a, b, c) && c > 0) product = a * b * c;
            }
        }
        return product;
    }
    public static long ProjectEuler10() {
        long sum = 0;
        for (long i = 2; i < 2000000; i++) {
            if (MathClass.isPrime(i)) sum += i;
        }
        return sum;
    }
    public static long ProjectEuler16() {
        BigInteger twotothepowerof1000 = BigInteger.TWO.pow(1000);
        return MathClass.sumOfDigits(twotothepowerof1000);
    }
    public static int ProjectEuler20() {
        BigInteger fac_100 = MathClass.factorial(BigInteger.valueOf(100));
        int sum = 0;
        String fac_100_str = fac_100.toString();
        for (int i = 0; i < fac_100_str.length(); i++) {
            sum += fac_100_str.charAt(i) - '0'; // Convert char to int and sum up
        }
        return sum;
    }
    public static BigInteger ProjectEuler48() {
            BigInteger divisor = new BigInteger("10000000000");
            BigInteger sum = BigInteger.ZERO;
            for (int i = 1; i <= 1000; i++) {
                BigInteger base = BigInteger.valueOf(i);
                BigInteger power = base.pow(i);
                sum = sum.add(power);
            }
            BigInteger last_ten_digits = BigInteger.ZERO;
            for (int i = 1; i <= 10; i++) {
                last_ten_digits = sum.remainder(divisor);
            }
            return last_ten_digits;
        }
}

