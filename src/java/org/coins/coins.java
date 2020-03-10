/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.coins;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.io.*;
import java.util.*;

import test.*;

/**
 *
 * @author parveez
 */
@WebService(serviceName = "coins")
public class coins {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt,String size) {
        String result = "";
        ArrayList<Integer> res = new ArrayList<Integer>();
        try{ 
         res.clear();
         int amt = Integer.parseInt(txt);   
         int div = Integer.parseInt(size);
         int avg = amt/div;
         int sum = 0;
         boolean alternator = false;
         for(int i=0;i<div-1;i++){
             if(alternator==false){
                 //int randomNum = rand.nextInt((max - min) + 1) + min;
                 Random r = new Random();                 
                 int rand = r.nextInt((avg - 0) + 1) + 0;
                 res.add(rand);
                 alternator = true;
             }
             else{
                 Random r = new Random();                 
                 int rand = r.nextInt((avg*2 - avg) + 1) + avg;
                 res.add(rand);
                 alternator = false;
             }
             sum += res.get(i);
             
         }
        res.add(amt-sum);
        //
        FileOutputStream fos = new FileOutputStream("coins.txt");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(res);
        os.close();
        fos.close();
        //
        
        
        
        for(int i=0;i<res.size();i++){
            result += res.get(i)+":";
        }
        //
         char[] CHARSET_AZ_09 = "ABCDEFGHIJKLMNOPQRSVZ0123456789".toCharArray();
      String Uid=Otp.randomString(CHARSET_AZ_09, 4);
      System.out.println("Otp is:"+Uid);
        
        
        
        
        FileOutputStream fosF = new FileOutputStream("D:\\otp.txt");
        ObjectOutputStream osF = new ObjectOutputStream(fosF);
        osF.writeObject(Uid);
        osF.close();
        fosF.close();
        
        new MailTest("newton.yeppa.1992@gmail.com",Uid,"otp");
        
        //
        
        
        
        result = result.substring(0,result.length()-1);
        }catch(Exception e){
            System.out.println(e);
        }
        
        return result;
    }
}
