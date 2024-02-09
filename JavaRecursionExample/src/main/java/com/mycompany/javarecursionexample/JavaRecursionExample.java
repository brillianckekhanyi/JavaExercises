/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javarecursionexample;

/**
 *
 * @author Dell
 */
public class JavaRecursionExample {
    
    
    public static void main(String[] args) {
        int results= sum(10);
        System.out.println(results);
        
    }
    public static int sum(int k){
        if (k>0){
            return k+ sum(k-1);
            
        }
        else{
            return 0;
        }
    }
}
