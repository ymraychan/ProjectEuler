package ProjectEulerMath;

import java.math.*;

import java.util.ArrayList;
import java.util.List;

public class MathClass {
    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }
    public static List<Integer> Fibonacci(int largest_num){
        List<Integer> list = new ArrayList<>();
        list.add(1); list.add(1);
        int i = 1;
        while (list.get(i)<=largest_num){
            list.add((list.get(i-1) + list.get(i))); i++;
        }    
        return list;
    }
    public static List<Integer> Collatz(int Starting_num){
        List<Integer> list = new ArrayList<Integer>();
        list.add(Starting_num);
        while (Starting_num != 1){
            if (Starting_num % 2 == 0){
                Starting_num = Starting_num / 2;
                list.add(Starting_num);
            }
            else{
                Starting_num = (Starting_num * 3) + 1;
                list.add(Starting_num);
            }
        } 
        return list;
    }
    public static boolean isPrime(long value) {
        if (value == 0 || value == 1) return false;
        if (value == 2 || value == 3) return true;
        long sqrtOfValue = (long)Math.sqrt(value);
        for (long i = 2; i <= sqrtOfValue; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(int num) {
        String strNum = String.valueOf(num);
        StringBuilder temp_reversedStrNum = new StringBuilder();
        temp_reversedStrNum.append(strNum);
        temp_reversedStrNum.reverse();
        String reversedStrNum = temp_reversedStrNum.toString();
        return strNum.equals(reversedStrNum);
    }
    public static long triangleNumber(long n){
        return (n * (n + 1)) / 2;
    }
    public static long sumOfDigits(BigInteger n){
        int length = String.valueOf(n).length();
        long digits = 0;
        while (length != 0) {
            BigInteger tempDigits = BigInteger.valueOf(digits);
            tempDigits = tempDigits.add(n.mod(BigInteger.TEN));
            digits = tempDigits.longValue();
            n = n.divide(BigInteger.TEN);
            length = length - 1;
        }
        return digits;
    }
    public static boolean isPythagorean(long a, long b, long c) {
        a = a * a;
        b = b * b;
        c = c * c;
        if (a + b == c) {
            return true;
        }
        else {
            return false;
        }
    }
}

