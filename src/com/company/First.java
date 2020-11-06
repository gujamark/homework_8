package com.company;

import java.util.Scanner;

public class First {
    int[] m = new int[15];

    public void assignRandomInRange() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter min: ");
        int a = sc.nextInt();
        System.out.print("Enter max: ");
        int b = sc.nextInt();

        for(int i = 0;i < m.length;i++) {
            m[i] = a + (int)(Math.random() * (b - a + 1));
        }
    }

    public int method2() {
        int sum = 0;

        for(int i = 0; i < m.length;i++) {
            if (m[i] < i)
                sum += m[i];
        }

        return sum;
    }

    public int method3() {
        int result = 1;

        for(int i = 0; i < m.length;i++) {
            if (m[i] < i)
                result *= i;
        }

        return result;
    }

    public void printEvenNums() {
        for (int j : m) {
            if (j % 2 == 0)
                System.out.println(j);
        }
    }
}
