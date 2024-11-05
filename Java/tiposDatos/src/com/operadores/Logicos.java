package com.operadores;

public class Logicos {
    public static void main(String[] args) {
        int a = 20;
        int b = 2836;
        int c = -16;
        System.out.println(a > b);
        System.out.println(c > 0);
        System.out.println(c < 0);
        System.out.println(a + b > 3000);
        System.out.println((a + b == 2856) || (a+b == 2500));
        System.out.println((a + b == 2500) || (a+b == 2856));
        System.out.println((a + b == 2500) || (a+b == 2896));
        System.out.println((a + b == 2500) && (a+b == 2856));
        System.out.println((a + b == 2856) && (a+b == 2500));
        System.out.println((a + b == 2856) && (a+b == 2856));
        System.out.println(a - b >= 5);
        System.out.println(a-c >= 10);
        System.out.println(c + 20 <= 4);
        System.out.println(!(a+b == 2856) && (a + b == 2856));
        System.out.println(!(a+b == 2456) && !(a + b == 256));
        System.out.println(!(a + b == 2456) || (a+b == 256));
        System.out.println(!!(a + b == 2856) && (a+b == 2856));
        System.out.println(a !=b);
        System.out.println(!(a != b));
        System.out.println(a > c && b > a && c < b || c > b);
    }
}
