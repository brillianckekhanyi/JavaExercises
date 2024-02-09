/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorial;



public class Factorials {

    public static void main(String[] args) {
        int num=11;
        factorial=1;
        System.out.println(factorial(5));
    }
    public static void int Factorial(int n){
      if(n==1){
          System.out.println("factorial:("+ n +")=1");
          return 1;
      }
      else{
          System.out.println("factorial: ("+ n +")="+ n +"");
          return n*factorial(n-1);
      }
    }
}
