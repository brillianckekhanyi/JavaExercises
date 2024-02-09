/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.haltingconditionexample;

/**
 *
 * @author Dell
 */
public class HaltingConditionExample {

    public static void main(String[] args) {
        int results= sum(5,10);
        System.out.println(results);
    }
    public static int sum(int start, int end){
        if (end>start){ 
            return end + sum(start,end-1);
        }
        else{
            return end;
        }
    }
}
