/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        int operator,n1,n2;
        System.out.println("1- Add\n 2- Subtract\n 3- Multiply\n 4-Divide\n");
        System.out.println("Choose the operator: ");
        Scanner Sc= new Scanner (System.in);
        operator = Sc.nextInt();
        System.out.println("Enter the first number: ");
        n1=Sc.nextInt();
        System.out.println("Enter the second number: ");
        n2=Sc.nextInt();
        int result=0;
        
        switch(operator){
            case 1:
               result=n1+n2;
               break;
            case 2:
                result= n1-n2;
                break;
            case 3:
                result= n1*n2;
                break;
            case 4:
                result=n1/n2;
                break;
            default:
                System.out.println("Entered operator not available");
        }
        System.out.println("result is: "+ result);
        }
        
    }

