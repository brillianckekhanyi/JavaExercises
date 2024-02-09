/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loopthrouamultidimensionalarray;

/**
 *
 * @author Dell
 */
public class LoopThrouAMultiDimensionalArray {

    public static void main(String[] args) {
        int [][] Mynumber={{1,2,3,4,5},{6,7,8,9}};
        for(int i=0; i<Mynumber.length; ++i){
        for (int j=0; j<Mynumber[i].length;++j){
            System.out.println(Mynumber[i][j]);
        }
        }
    }
}
