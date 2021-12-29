import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;
import java.util.Scanner;

import static java.lang.System.in;

public class SolutionPrime {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(in);
            System.out.println("Enter 5 integers to check if prime");
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            int n3 = input.nextInt();
            int n4 = input.nextInt();
            int n5 = input.nextInt();
            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
