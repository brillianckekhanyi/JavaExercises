/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacci2;

/**
 *
 * @author Dell
 */
public class FIbonacci2 {

    public static void main(String[] args) {
        int n = 20; // Given number up to which Fibonacci series is to be printed
        System.out.println("Fibonacci series up to " + n + " is:");
        int a = 0, b = 1;
        while (a <= n) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}

