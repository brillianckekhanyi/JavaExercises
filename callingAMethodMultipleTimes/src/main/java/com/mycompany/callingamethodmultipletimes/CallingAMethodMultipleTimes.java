/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.callingamethodmultipletimes;

/**
 *
 * @author Dell
 */
public class CallingAMethodMultipleTimes {
    static void MyMethod(){
        System.out.println("I just got executed");
    }

    public static void main(String[] args) {
        MyMethod();
        MyMethod();
        MyMethod();
        
    }
    
}
