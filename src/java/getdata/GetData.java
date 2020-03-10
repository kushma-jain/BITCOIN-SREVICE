/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getdata;

import java.io.*;
import java.util.*;
public class GetData {
    ArrayList<Integer> allSlots = new ArrayList<Integer>();
    public ArrayList<Integer> getAllSlots(int amt,int div){
        allSlots.clear();
        try{
        int avg = amt/div;
        int sum = 0;
        boolean alternator = false;
         for(int i=0;i<div-1;i++){
             if(alternator==false){
                 //int randomNum = rand.nextInt((max - min) + 1) + min;
                 Random r = new Random();                 
                 int rand = r.nextInt((avg - 0) + 1) + 0;
                 allSlots.add(rand);
                 alternator = true;
             }
             else{
                 Random r = new Random();                 
                 int rand = r.nextInt((avg*2 - avg) + 1) + avg;
                 allSlots.add(rand);
                 alternator = false;
             }
             sum += allSlots.get(i);
             
         }
        allSlots.add(amt-sum);
        }catch(Exception e){
            System.out.println(e);
        }
        return allSlots;
    }
    
}
