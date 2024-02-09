/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.amethodwithifelse;

/**
 *
 * @author Dell
 */
public class AMethodWithIfElse {

     static void checkAge (int age) {
         if (age<18){
              System.out.println("Access denied-you are not old enough");
         }
         else {
             System.out.println("Access granted-you are old enough");
         }
    }
     public static void main(String[]args){
         checkAge(20);
     }
     }

