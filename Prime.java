import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;
import java.util.Scanner;

class Prime {
    void checkPrime(int... numbers) {
        System.out.println("Prime numbers: ");
        for (int num : numbers) {
            if (isPrime(num)) {

                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    boolean isPrime(int n) {

        boolean mightBePrime = false;
        mightBePrime = java.math.BigInteger.valueOf(n).isProbablePrime(1);

        return mightBePrime;
    }
}


