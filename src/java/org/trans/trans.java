/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.trans;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.io.*;
import java.util.*;
import getdata.GetData;

/**
 *
 * @author parveez
 */
@WebService(serviceName = "trans")
public class trans {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        String response = "";
        try{
        int transCount = Integer.parseInt(txt);        
        FileInputStream fis = new FileInputStream("coins.txt");
        ObjectInputStream is = new ObjectInputStream(fis);
        ArrayList<Integer> values = new ArrayList<Integer>();
        values = (ArrayList<Integer>)is.readObject();
        is.close();
        fis.close();
        //System.out.println(values);
        int coinCount = values.size();
        if(coinCount == 4 && transCount ==4){
          int firstCoin = values.get(0);
          int secondCoin = values.get(1);
          int thirdCoin = values.get(2);
          int fourthCoin = values.get(3);
          ArrayList<Integer> firstSlot = new ArrayList<Integer>();
          ArrayList<Integer> secondSlot = new ArrayList<Integer>();
          ArrayList<Integer> thirdSlot = new ArrayList<Integer>();
          ArrayList<Integer> fourthSlot = new ArrayList<Integer>();
          firstSlot.clear();
          secondSlot.clear();
          thirdSlot.clear();
          fourthSlot.clear();
          GetData first = new GetData();
          firstSlot = first.getAllSlots(firstCoin, 4);
          GetData second = new GetData();
          secondSlot = second.getAllSlots(secondCoin, 4);
          GetData third = new GetData();
          thirdSlot = third.getAllSlots(thirdCoin, 4);
          GetData fourth = new GetData();
          fourthSlot = fourth.getAllSlots(fourthCoin, 4);
          
          response = firstSlot.get(0)+":"+secondSlot.get(0)+":"+thirdSlot.get(0)+":"+fourthSlot.get(0)+"\r\n";
          response += firstSlot.get(1)+":"+secondSlot.get(1)+":"+thirdSlot.get(1)+":"+fourthSlot.get(1)+"\r\n";
          response += firstSlot.get(2)+":"+secondSlot.get(2)+":"+thirdSlot.get(2)+":"+fourthSlot.get(2)+"\r\n";
          response += firstSlot.get(3)+":"+secondSlot.get(3)+":"+thirdSlot.get(3)+":"+fourthSlot.get(3);
          
        }
        // 4 coins and 5 trans starts..
        if(coinCount == 4 && transCount ==5){
          int firstCoin = values.get(0);
          int secondCoin = values.get(1);
          int thirdCoin = values.get(2);
          int fourthCoin = values.get(3);
          ArrayList<Integer> firstSlot = new ArrayList<Integer>();
          ArrayList<Integer> secondSlot = new ArrayList<Integer>();
          ArrayList<Integer> thirdSlot = new ArrayList<Integer>();
          ArrayList<Integer> fourthSlot = new ArrayList<Integer>();
          firstSlot.clear();
          secondSlot.clear();
          thirdSlot.clear();
          fourthSlot.clear();
          GetData first = new GetData();
          firstSlot = first.getAllSlots(firstCoin, 5);
          GetData second = new GetData();
          secondSlot = second.getAllSlots(secondCoin, 5);
          GetData third = new GetData();
          thirdSlot = third.getAllSlots(thirdCoin, 5);
          GetData fourth = new GetData();
          fourthSlot = fourth.getAllSlots(fourthCoin, 5);
          
          response = firstSlot.get(0)+":"+secondSlot.get(0)+":"+thirdSlot.get(0)+":"+fourthSlot.get(0)+"\r\n";
          response += firstSlot.get(1)+":"+secondSlot.get(1)+":"+thirdSlot.get(1)+":"+fourthSlot.get(1)+"\r\n";
          response += firstSlot.get(2)+":"+secondSlot.get(2)+":"+thirdSlot.get(2)+":"+fourthSlot.get(2)+"\r\n";
          response += firstSlot.get(3)+":"+secondSlot.get(3)+":"+thirdSlot.get(3)+":"+fourthSlot.get(3)+"\r\n";
          response += firstSlot.get(4)+":"+secondSlot.get(4)+":"+thirdSlot.get(4)+":"+fourthSlot.get(4);
          
        }
        // 4 coins and 5 trans ends...
        // 4 coins and 6 trans starts..
        else if(coinCount==4 && transCount==6){
           int firstCoin = values.get(0);
          int secondCoin = values.get(1);
          int thirdCoin = values.get(2);
          int fourthCoin = values.get(3);
          ArrayList<Integer> firstSlot = new ArrayList<Integer>();
          ArrayList<Integer> secondSlot = new ArrayList<Integer>();
          ArrayList<Integer> thirdSlot = new ArrayList<Integer>();
          ArrayList<Integer> fourthSlot = new ArrayList<Integer>();
          firstSlot.clear();
          secondSlot.clear();
          thirdSlot.clear();
          fourthSlot.clear();
          GetData first = new GetData();
          firstSlot = first.getAllSlots(firstCoin, 6);
          GetData second = new GetData();
          secondSlot = second.getAllSlots(secondCoin, 6);
          GetData third = new GetData();
          thirdSlot = third.getAllSlots(thirdCoin, 6);
          GetData fourth = new GetData();
          fourthSlot = fourth.getAllSlots(fourthCoin, 6);
          
          response = firstSlot.get(0)+":"+secondSlot.get(0)+":"+thirdSlot.get(0)+":"+fourthSlot.get(0)+"\r\n";
          response += firstSlot.get(1)+":"+secondSlot.get(1)+":"+thirdSlot.get(1)+":"+fourthSlot.get(1)+"\r\n";
          response += firstSlot.get(2)+":"+secondSlot.get(2)+":"+thirdSlot.get(2)+":"+fourthSlot.get(2)+"\r\n";
          response += firstSlot.get(3)+":"+secondSlot.get(3)+":"+thirdSlot.get(3)+":"+fourthSlot.get(3)+"\r\n";
          response += firstSlot.get(4)+":"+secondSlot.get(4)+":"+thirdSlot.get(4)+":"+fourthSlot.get(4)+"\r\n";
          response += firstSlot.get(5)+":"+secondSlot.get(5)+":"+thirdSlot.get(5)+":"+fourthSlot.get(5);
           
        }
        // 4 coins and 6 trans ends..
        // 4 coins and  trans ends..
        else if(coinCount ==4 && transCount==7){
           int firstCoin = values.get(0);
          int secondCoin = values.get(1);
          int thirdCoin = values.get(2);
          int fourthCoin = values.get(3);
          ArrayList<Integer> firstSlot = new ArrayList<Integer>();
          ArrayList<Integer> secondSlot = new ArrayList<Integer>();
          ArrayList<Integer> thirdSlot = new ArrayList<Integer>();
          ArrayList<Integer> fourthSlot = new ArrayList<Integer>();
          firstSlot.clear();
          secondSlot.clear();
          thirdSlot.clear();
          fourthSlot.clear();
          GetData first = new GetData();
          firstSlot = first.getAllSlots(firstCoin, 7);
          GetData second = new GetData();
          secondSlot = second.getAllSlots(secondCoin, 7);
          GetData third = new GetData();
          thirdSlot = third.getAllSlots(thirdCoin, 7);
          GetData fourth = new GetData();
          fourthSlot = fourth.getAllSlots(fourthCoin, 7);
            
          response = firstSlot.get(0)+":"+secondSlot.get(0)+":"+thirdSlot.get(0)+":"+fourthSlot.get(0)+"\r\n";
          response += firstSlot.get(1)+":"+secondSlot.get(1)+":"+thirdSlot.get(1)+":"+fourthSlot.get(1)+"\r\n";
          response += firstSlot.get(2)+":"+secondSlot.get(2)+":"+thirdSlot.get(2)+":"+fourthSlot.get(2)+"\r\n";
          response += firstSlot.get(3)+":"+secondSlot.get(3)+":"+thirdSlot.get(3)+":"+fourthSlot.get(3)+"\r\n";
          response += firstSlot.get(4)+":"+secondSlot.get(4)+":"+thirdSlot.get(4)+":"+fourthSlot.get(4)+"\r\n";
          response += firstSlot.get(5)+":"+secondSlot.get(5)+":"+thirdSlot.get(5)+":"+fourthSlot.get(5)+"\r\n";
          response += firstSlot.get(6)+":"+secondSlot.get(6)+":"+thirdSlot.get(6)+":"+fourthSlot.get(6);
        }
        //4 coins and 7 trans ends..
        
        //5 coins and 4 trans starts..
        else if(coinCount ==5 && transCount==4){
           int firstCoin = values.get(0);
          int secondCoin = values.get(1);
          int thirdCoin = values.get(2);
          int fourthCoin = values.get(3);
          int fifthCoin = values.get(4);
          fourthCoin += fifthCoin;
          ArrayList<Integer> firstSlot = new ArrayList<Integer>();
          ArrayList<Integer> secondSlot = new ArrayList<Integer>();
          ArrayList<Integer> thirdSlot = new ArrayList<Integer>();
          ArrayList<Integer> fourthSlot = new ArrayList<Integer>();
          firstSlot.clear();
          secondSlot.clear();
          thirdSlot.clear();
          fourthSlot.clear();
          GetData first = new GetData();
          firstSlot = first.getAllSlots(firstCoin, 4);
          GetData second = new GetData();
          secondSlot = second.getAllSlots(secondCoin, 4);
          GetData third = new GetData();
          thirdSlot = third.getAllSlots(thirdCoin, 4);
          GetData fourth = new GetData();
          fourthSlot = fourth.getAllSlots(fourthCoin, 4);
            
          response = firstSlot.get(0)+":"+secondSlot.get(0)+":"+thirdSlot.get(0)+":"+fourthSlot.get(0)+"\r\n";
          response += firstSlot.get(1)+":"+secondSlot.get(1)+":"+thirdSlot.get(1)+":"+fourthSlot.get(1)+"\r\n";
          response += firstSlot.get(2)+":"+secondSlot.get(2)+":"+thirdSlot.get(2)+":"+fourthSlot.get(2)+"\r\n";
          response += firstSlot.get(3)+":"+secondSlot.get(3)+":"+thirdSlot.get(3)+":"+fourthSlot.get(3);
          
        }
        //5 coins and 4 trans ends..
        
        //5 coins and 5 trans starts..
        else if(coinCount ==5 && transCount==5){
           int firstCoin = values.get(0);
          int secondCoin = values.get(1);
          int thirdCoin = values.get(2);
          int fourthCoin = values.get(3);
          int fifthCoin = values.get(4);
         
          ArrayList<Integer> firstSlot = new ArrayList<Integer>();
          ArrayList<Integer> secondSlot = new ArrayList<Integer>();
          ArrayList<Integer> thirdSlot = new ArrayList<Integer>();
          ArrayList<Integer> fourthSlot = new ArrayList<Integer>();
          ArrayList<Integer> fifthSlot = new ArrayList<Integer>();
          firstSlot.clear();
          secondSlot.clear();
          thirdSlot.clear();
          fourthSlot.clear();
          fifthSlot.clear();
          GetData first = new GetData();
          firstSlot = first.getAllSlots(firstCoin, 5);
          GetData second = new GetData();
          secondSlot = second.getAllSlots(secondCoin, 5);
          GetData third = new GetData();
          thirdSlot = third.getAllSlots(thirdCoin, 5);
          GetData fourth = new GetData();
          fourthSlot = fourth.getAllSlots(fourthCoin, 5);
          GetData fifth = new GetData();
          fifthSlot = fifth.getAllSlots(fifthCoin,5);
          response = firstSlot.get(0)+":"+secondSlot.get(0)+":"+thirdSlot.get(0)+":"+fourthSlot.get(0)+":"+fifthSlot.get(0)+"\r\n";
          response += firstSlot.get(1)+":"+secondSlot.get(1)+":"+thirdSlot.get(1)+":"+fourthSlot.get(1)+":"+fifthSlot.get(1)+"\r\n";
          response += firstSlot.get(2)+":"+secondSlot.get(2)+":"+thirdSlot.get(2)+":"+fourthSlot.get(2)+":"+fifthSlot.get(2)+"\r\n";
          response += firstSlot.get(3)+":"+secondSlot.get(3)+":"+thirdSlot.get(3)+":"+fourthSlot.get(3)+":"+fifthSlot.get(3)+"\r\n";
          response += firstSlot.get(3)+":"+secondSlot.get(3)+":"+thirdSlot.get(3)+":"+fourthSlot.get(3)+":"+fifthSlot.get(4);
          
        }
        //5 coins and 5 trans ends..
        //5 coins and 6 trans starts..
        else if(coinCount ==5 && transCount==6){
           int firstCoin = values.get(0);
          int secondCoin = values.get(1);
          int thirdCoin = values.get(2);
          int fourthCoin = values.get(3);
          int coinsCount = values.get(4);
          int fifthCoin = coinsCount/2;
          int sixthCoin = coinsCount/2;
          
          ArrayList<Integer> firstSlot = new ArrayList<Integer>();
          ArrayList<Integer> secondSlot = new ArrayList<Integer>();
          ArrayList<Integer> thirdSlot = new ArrayList<Integer>();
          ArrayList<Integer> fourthSlot = new ArrayList<Integer>();
          ArrayList<Integer> fifthSlot = new ArrayList<Integer>();
          ArrayList<Integer> sixthSlot = new ArrayList<Integer>();
          firstSlot.clear();
          secondSlot.clear();
          thirdSlot.clear();
          fourthSlot.clear();
          fifthSlot.clear();
          sixthSlot.clear();
          GetData first = new GetData();
          firstSlot = first.getAllSlots(firstCoin, 6);
          GetData second = new GetData();
          secondSlot = second.getAllSlots(secondCoin, 6);
          GetData third = new GetData();
          thirdSlot = third.getAllSlots(thirdCoin, 6);
          GetData fourth = new GetData();
          fourthSlot = fourth.getAllSlots(fourthCoin, 6);
          GetData fifth = new GetData();
          fifthSlot = fifth.getAllSlots(fifthCoin,6);
          GetData sixth = new GetData();
          sixthSlot = sixth.getAllSlots(sixthCoin,6);
          response = firstSlot.get(0)+":"+secondSlot.get(0)+":"+thirdSlot.get(0)+":"+fourthSlot.get(0)+":"+fifthSlot.get(0)+":"+sixthSlot.get(0)+"\r\n";
          response += firstSlot.get(1)+":"+secondSlot.get(1)+":"+thirdSlot.get(1)+":"+fourthSlot.get(1)+":"+fifthSlot.get(1)+":"+sixthSlot.get(1)+"\r\n";
          response += firstSlot.get(2)+":"+secondSlot.get(2)+":"+thirdSlot.get(2)+":"+fourthSlot.get(2)+":"+fifthSlot.get(2)+":"+sixthSlot.get(2)+"\r\n";
          response += firstSlot.get(3)+":"+secondSlot.get(3)+":"+thirdSlot.get(3)+":"+fourthSlot.get(3)+":"+fifthSlot.get(3)+":"+sixthSlot.get(3)+"\r\n";
          response += firstSlot.get(4)+":"+secondSlot.get(4)+":"+thirdSlot.get(4)+":"+fourthSlot.get(4)+":"+fifthSlot.get(4)+":"+sixthSlot.get(4)+"\r\n";
          response += firstSlot.get(5)+":"+secondSlot.get(5)+":"+thirdSlot.get(5)+":"+fourthSlot.get(5)+":"+fifthSlot.get(5)+":"+sixthSlot.get(5);
          
        }
        //5 coins and 6 trans ends..
        
        //5 coins and 7 trans starts..
        else if(coinCount ==5 && transCount==7){
           int firstCoin = values.get(0);
          int secondCoin = values.get(1);
          int thirdCoin = values.get(2);
          int fourthCoin = values.get(3);
          int coinsCount = values.get(4);
          int fifthCoin = coinsCount/3;
          int sixthCoin = coinsCount/3;
          int seventCoin = coinsCount/3;
          
          ArrayList<Integer> firstSlot = new ArrayList<Integer>();
          ArrayList<Integer> secondSlot = new ArrayList<Integer>();
          ArrayList<Integer> thirdSlot = new ArrayList<Integer>();
          ArrayList<Integer> fourthSlot = new ArrayList<Integer>();
          ArrayList<Integer> fifthSlot = new ArrayList<Integer>();
          ArrayList<Integer> sixthSlot = new ArrayList<Integer>();
          ArrayList<Integer> seventhSlot = new ArrayList<Integer>();
          firstSlot.clear();
          secondSlot.clear();
          thirdSlot.clear();
          fourthSlot.clear();
          fifthSlot.clear();
          sixthSlot.clear();
          seventhSlot.clear();
          GetData first = new GetData();
          firstSlot = first.getAllSlots(firstCoin, 7);
          GetData second = new GetData();
          secondSlot = second.getAllSlots(secondCoin, 7);
          GetData third = new GetData();
          thirdSlot = third.getAllSlots(thirdCoin, 7);
          GetData fourth = new GetData();
          fourthSlot = fourth.getAllSlots(fourthCoin, 7);
          GetData fifth = new GetData();
          fifthSlot = fifth.getAllSlots(fifthCoin,7);
          GetData sixth = new GetData();
          sixthSlot = sixth.getAllSlots(sixthCoin,7);
          GetData seventh = new GetData();
          seventhSlot = seventh.getAllSlots(seventCoin,7);
          response = firstSlot.get(0)+":"+secondSlot.get(0)+":"+thirdSlot.get(0)+":"+fourthSlot.get(0)+":"+fifthSlot.get(0)+":"+sixthSlot.get(0)+":"+seventhSlot.get(0)+"\r\n";
          response += firstSlot.get(1)+":"+secondSlot.get(1)+":"+thirdSlot.get(1)+":"+fourthSlot.get(1)+":"+fifthSlot.get(1)+":"+sixthSlot.get(1)+":"+seventhSlot.get(1)+"\r\n";
          response += firstSlot.get(2)+":"+secondSlot.get(2)+":"+thirdSlot.get(2)+":"+fourthSlot.get(2)+":"+fifthSlot.get(2)+":"+sixthSlot.get(2)+":"+seventhSlot.get(2)+"\r\n";
          response += firstSlot.get(3)+":"+secondSlot.get(3)+":"+thirdSlot.get(3)+":"+fourthSlot.get(3)+":"+fifthSlot.get(3)+":"+sixthSlot.get(3)+":"+seventhSlot.get(3)+"\r\n";
          response += firstSlot.get(4)+":"+secondSlot.get(4)+":"+thirdSlot.get(4)+":"+fourthSlot.get(4)+":"+fifthSlot.get(4)+":"+sixthSlot.get(4)+":"+seventhSlot.get(4)+"\r\n";
          response += firstSlot.get(5)+":"+secondSlot.get(5)+":"+thirdSlot.get(5)+":"+fourthSlot.get(5)+":"+fifthSlot.get(5)+":"+sixthSlot.get(5)+":"+seventhSlot.get(5)+"\r\n";
          response += firstSlot.get(6)+":"+secondSlot.get(6)+":"+thirdSlot.get(6)+":"+fourthSlot.get(6)+":"+fifthSlot.get(6)+":"+sixthSlot.get(6)+":"+seventhSlot.get(6);
        }
        //5 coins and 7 trans ends
        
        //6 coins and 4 trans starts..
         else if(coinCount ==6 && transCount==4){
           
           int firstCoin = values.get(0);
          int secondCoin = values.get(1);
          int thirdCoin = values.get(2)+ values.get(4);
          int fourthCoin = values.get(3)+values.get(5);
          int fifthCoin = values.get(4);
          int sixthCoint = values.get(5);
          
          
          ArrayList<Integer> firstSlot = new ArrayList<Integer>();
          ArrayList<Integer> secondSlot = new ArrayList<Integer>();
          ArrayList<Integer> thirdSlot = new ArrayList<Integer>();
          ArrayList<Integer> fourthSlot = new ArrayList<Integer>();
          
          firstSlot.clear();
          secondSlot.clear();
          thirdSlot.clear();
          fourthSlot.clear();
          
          GetData first = new GetData();
          firstSlot = first.getAllSlots(firstCoin, 4);
          GetData second = new GetData();
          secondSlot = second.getAllSlots(secondCoin, 4);
          GetData third = new GetData();
          thirdSlot = third.getAllSlots(thirdCoin, 4);
          GetData fourth = new GetData();
          fourthSlot = fourth.getAllSlots(fourthCoin, 4);
          
          response = firstSlot.get(0)+":"+secondSlot.get(0)+":"+thirdSlot.get(0)+":"+fourthSlot.get(0)+"\r\n";
          response += firstSlot.get(1)+":"+secondSlot.get(1)+":"+thirdSlot.get(1)+":"+fourthSlot.get(1)+"\r\n";
          response += firstSlot.get(2)+":"+secondSlot.get(2)+":"+thirdSlot.get(2)+":"+fourthSlot.get(2)+"\r\n";
          response += firstSlot.get(3)+":"+secondSlot.get(3)+":"+thirdSlot.get(3)+":"+fourthSlot.get(3)+"\r\n";          
          
        }
   
        //6 coins and 4 trans ends
        
        //6 coins and 5 trans starts...
        else if(coinCount ==6 && transCount==5){
           
           int firstCoin = values.get(0);
          int secondCoin = values.get(1);
          int thirdCoin = values.get(2)+ values.get(4);
          int fourthCoin = values.get(3);
          int fifthCoin = values.get(4)+values.get(5);
          int sixthCoint = values.get(5);
          
          
          ArrayList<Integer> firstSlot = new ArrayList<Integer>();
          ArrayList<Integer> secondSlot = new ArrayList<Integer>();
          ArrayList<Integer> thirdSlot = new ArrayList<Integer>();
          ArrayList<Integer> fourthSlot = new ArrayList<Integer>();
          ArrayList<Integer> fifthSlot = new ArrayList<Integer>();
          
          firstSlot.clear();
          secondSlot.clear();
          thirdSlot.clear();
          fourthSlot.clear();
          fifthSlot.clear();
          
          GetData first = new GetData();
          firstSlot = first.getAllSlots(firstCoin, 5);
          GetData second = new GetData();
          secondSlot = second.getAllSlots(secondCoin, 5);
          GetData third = new GetData();
          thirdSlot = third.getAllSlots(thirdCoin, 5);
          GetData fourth = new GetData();
          fourthSlot = fourth.getAllSlots(fourthCoin, 5);
          GetData fifth = new GetData();
          fifthSlot = fifth.getAllSlots(fifthCoin, 5);
          
          response = firstSlot.get(0)+":"+secondSlot.get(0)+":"+thirdSlot.get(0)+":"+fourthSlot.get(0)+":"+fifthSlot.get(0)+"\r\n";
          response += firstSlot.get(1)+":"+secondSlot.get(1)+":"+thirdSlot.get(1)+":"+fourthSlot.get(1)+":"+fifthSlot.get(1)+"\r\n";
          response += firstSlot.get(2)+":"+secondSlot.get(2)+":"+thirdSlot.get(2)+":"+fourthSlot.get(2)+":"+fifthSlot.get(2)+"\r\n";
          response += firstSlot.get(3)+":"+secondSlot.get(3)+":"+thirdSlot.get(3)+":"+fourthSlot.get(3)+":"+fifthSlot.get(3)+"\r\n";
          response += firstSlot.get(4)+":"+secondSlot.get(4)+":"+thirdSlot.get(4)+":"+fourthSlot.get(4)+":"+fifthSlot.get(4);          
          
        }
        //6 coins and 5 trans ends...
        
        //6 coins and 6 trans starts...
        else if(coinCount ==6 && transCount==6){
           
           int firstCoin = values.get(0);
          int secondCoin = values.get(1);
          int thirdCoin = values.get(2);
          int fourthCoin = values.get(3);
          int fifthCoin = values.get(4);
          int sixthCoin = values.get(5);
          
          
          ArrayList<Integer> firstSlot = new ArrayList<Integer>();
          ArrayList<Integer> secondSlot = new ArrayList<Integer>();
          ArrayList<Integer> thirdSlot = new ArrayList<Integer>();
          ArrayList<Integer> fourthSlot = new ArrayList<Integer>();
          ArrayList<Integer> fifthSlot = new ArrayList<Integer>();
          ArrayList<Integer> sixthSlot = new ArrayList<Integer>();
          
          firstSlot.clear();
          secondSlot.clear();
          thirdSlot.clear();
          fourthSlot.clear();
          fifthSlot.clear();
          sixthSlot.clear();
          
          GetData first = new GetData();
          firstSlot = first.getAllSlots(firstCoin, 6);
          GetData second = new GetData();
          secondSlot = second.getAllSlots(secondCoin, 6);
          GetData third = new GetData();
          thirdSlot = third.getAllSlots(thirdCoin, 6);
          GetData fourth = new GetData();
          fourthSlot = fourth.getAllSlots(fourthCoin, 6);
          GetData fifth = new GetData();
          fifthSlot = fifth.getAllSlots(fifthCoin, 6);
          GetData sixth = new GetData();
          sixthSlot = sixth.getAllSlots(sixthCoin, 6);
          
          response = firstSlot.get(0)+":"+secondSlot.get(0)+":"+thirdSlot.get(0)+":"+fourthSlot.get(0)+":"+fifthSlot.get(0)+":"+sixthSlot.get(0)+"\r\n";
          response += firstSlot.get(1)+":"+secondSlot.get(1)+":"+thirdSlot.get(1)+":"+fourthSlot.get(1)+":"+fifthSlot.get(1)+":"+sixthSlot.get(1)+"\r\n";
          response += firstSlot.get(2)+":"+secondSlot.get(2)+":"+thirdSlot.get(2)+":"+fourthSlot.get(2)+":"+fifthSlot.get(2)+":"+sixthSlot.get(2)+"\r\n";
          response += firstSlot.get(3)+":"+secondSlot.get(3)+":"+thirdSlot.get(3)+":"+fourthSlot.get(3)+":"+fifthSlot.get(3)+":"+sixthSlot.get(3)+"\r\n";
          response += firstSlot.get(4)+":"+secondSlot.get(4)+":"+thirdSlot.get(4)+":"+fourthSlot.get(4)+":"+fifthSlot.get(4)+":"+sixthSlot.get(4)+"\r\n";  
         response += firstSlot.get(5)+":"+secondSlot.get(5)+":"+thirdSlot.get(5)+":"+fourthSlot.get(5)+":"+fifthSlot.get(5)+":"+sixthSlot.get(5);
          System.out.println(response);
        }
        //6 coins and 6 trans ends
        //6 coins and 7 trans starts..
        else if(coinCount ==6 && transCount==7){
           
           int firstCoin = values.get(0);
          int secondCoin = values.get(1);
          int thirdCoin = values.get(2);
          int fourthCoin = values.get(3);
          int fifthCoin = values.get(4);
          int sixthCoin = values.get(5)/2;
          int seventhCoin = values.get(5)/2;
          System.out.println(sixthCoin+":::::"+seventhCoin);
          
          ArrayList<Integer> firstSlot = new ArrayList<Integer>();
          ArrayList<Integer> secondSlot = new ArrayList<Integer>();
          ArrayList<Integer> thirdSlot = new ArrayList<Integer>();
          ArrayList<Integer> fourthSlot = new ArrayList<Integer>();
          ArrayList<Integer> fifthSlot = new ArrayList<Integer>();
          ArrayList<Integer> sixthSlot = new ArrayList<Integer>();
          ArrayList<Integer> seventhSlot = new ArrayList<Integer>();
          
          firstSlot.clear();
          secondSlot.clear();
          thirdSlot.clear();
          fourthSlot.clear();
          fifthSlot.clear();
          sixthSlot.clear();
          seventhSlot.clear();
          GetData first = new GetData();
          firstSlot = first.getAllSlots(firstCoin, 7);
          GetData second = new GetData();
          secondSlot = second.getAllSlots(secondCoin, 7);
          GetData third = new GetData();
          thirdSlot = third.getAllSlots(thirdCoin, 7);
          GetData fourth = new GetData();
          fourthSlot = fourth.getAllSlots(fourthCoin, 7);
          GetData fifth = new GetData();
          fifthSlot = fifth.getAllSlots(fifthCoin, 7);
          GetData sixth = new GetData();
          sixthSlot = sixth.getAllSlots(sixthCoin, 7);
          GetData seventh = new GetData();
          seventhSlot = seventh.getAllSlots(seventhCoin, 7);
          
          response = firstSlot.get(0)+":"+secondSlot.get(0)+":"+thirdSlot.get(0)+":"+fourthSlot.get(0)+":"+fifthSlot.get(0)+":"+sixthSlot.get(0)+":"+seventhSlot.get(0)+"\r\n";
          response += firstSlot.get(1)+":"+secondSlot.get(1)+":"+thirdSlot.get(1)+":"+fourthSlot.get(1)+":"+fifthSlot.get(1)+":"+sixthSlot.get(1)+":"+seventhSlot.get(1)+"\r\n";
          response += firstSlot.get(2)+":"+secondSlot.get(2)+":"+thirdSlot.get(2)+":"+fourthSlot.get(2)+":"+fifthSlot.get(2)+":"+sixthSlot.get(2)+":"+seventhSlot.get(2)+"\r\n";
          response += firstSlot.get(3)+":"+secondSlot.get(3)+":"+thirdSlot.get(3)+":"+fourthSlot.get(3)+":"+fifthSlot.get(3)+":"+sixthSlot.get(3)+":"+seventhSlot.get(3)+"\r\n";
          response += firstSlot.get(4)+":"+secondSlot.get(4)+":"+thirdSlot.get(4)+":"+fourthSlot.get(4)+":"+fifthSlot.get(4)+":"+sixthSlot.get(4)+":"+seventhSlot.get(4)+"\r\n";
         response += firstSlot.get(5)+":"+secondSlot.get(5)+":"+thirdSlot.get(5)+":"+fourthSlot.get(5)+":"+fifthSlot.get(5)+":"+sixthSlot.get(5)+":"+seventhSlot.get(5)+"\r\n";
         response += firstSlot.get(5)+":"+secondSlot.get(5)+":"+thirdSlot.get(5)+":"+fourthSlot.get(5)+":"+fifthSlot.get(5)+":"+sixthSlot.get(5)+":"+seventhSlot.get(5);
          System.out.println(response);
        }
        //6 coins and 7 trans ends..
        
        //7 coins and 4 trans starts..
        else if(coinCount ==7 && transCount==4){
           
           int firstCoin = values.get(0);
          int secondCoin = values.get(1)+values.get(4);
          int thirdCoin = values.get(2)+values.get(5);
          int fourthCoin = values.get(3)+values.get(6);
          
          
          
          ArrayList<Integer> firstSlot = new ArrayList<Integer>();
          ArrayList<Integer> secondSlot = new ArrayList<Integer>();
          ArrayList<Integer> thirdSlot = new ArrayList<Integer>();
          ArrayList<Integer> fourthSlot = new ArrayList<Integer>();
          
          
          firstSlot.clear();
          secondSlot.clear();
          thirdSlot.clear();
          fourthSlot.clear();
          
          GetData first = new GetData();
          firstSlot = first.getAllSlots(firstCoin, 4);
          GetData second = new GetData();
          secondSlot = second.getAllSlots(secondCoin, 4);
          GetData third = new GetData();
          thirdSlot = third.getAllSlots(thirdCoin, 4);
          GetData fourth = new GetData();
          fourthSlot = fourth.getAllSlots(fourthCoin, 4);
          
          
          response = firstSlot.get(0)+":"+secondSlot.get(0)+":"+thirdSlot.get(0)+":"+fourthSlot.get(0)+"\r\n";
          response += firstSlot.get(1)+":"+secondSlot.get(1)+":"+thirdSlot.get(1)+":"+fourthSlot.get(1)+"\r\n";
          response += firstSlot.get(2)+":"+secondSlot.get(2)+":"+thirdSlot.get(2)+":"+fourthSlot.get(2)+"\r\n";
          response += firstSlot.get(3)+":"+secondSlot.get(3)+":"+thirdSlot.get(3)+":"+fourthSlot.get(3);
                   System.out.println(response);
        }
        //7 coins and 4 trans ends..
        
        //7 coins and 5 trans starts...
        
        else if(coinCount ==7 && transCount==5){
           
           int firstCoin = values.get(0);
          int secondCoin = values.get(1)+values.get(4);
          int thirdCoin = values.get(2)+values.get(5);
          int fourthCoin = values.get(3);
          int fifthCoin = values.get(6);
          
          
          
          ArrayList<Integer> firstSlot = new ArrayList<Integer>();
          ArrayList<Integer> secondSlot = new ArrayList<Integer>();
          ArrayList<Integer> thirdSlot = new ArrayList<Integer>();
          ArrayList<Integer> fourthSlot = new ArrayList<Integer>();
          ArrayList<Integer> fifthSlot = new ArrayList<Integer>();
          
          firstSlot.clear();
          secondSlot.clear();
          thirdSlot.clear();
          fourthSlot.clear();
          fifthSlot.clear();
          
          GetData first = new GetData();
          firstSlot = first.getAllSlots(firstCoin, 5);
          GetData second = new GetData();
          secondSlot = second.getAllSlots(secondCoin, 5);
          GetData third = new GetData();
          thirdSlot = third.getAllSlots(thirdCoin, 5);
          GetData fourth = new GetData();
          fourthSlot = fourth.getAllSlots(fourthCoin, 5);
          GetData fifth = new GetData();
          fifthSlot = fifth.getAllSlots(fifthCoin, 5);
          
          
          response = firstSlot.get(0)+":"+secondSlot.get(0)+":"+thirdSlot.get(0)+":"+fourthSlot.get(0)+":"+fifthSlot.get(0)+"\r\n";
          response += firstSlot.get(1)+":"+secondSlot.get(1)+":"+thirdSlot.get(1)+":"+fourthSlot.get(1)+":"+fifthSlot.get(1)+"\r\n";
          response += firstSlot.get(2)+":"+secondSlot.get(2)+":"+thirdSlot.get(2)+":"+fourthSlot.get(2)+":"+fifthSlot.get(2)+"\r\n";
          response += firstSlot.get(3)+":"+secondSlot.get(3)+":"+thirdSlot.get(3)+":"+fourthSlot.get(3)+":"+fifthSlot.get(3)+"\r\n";
          response += firstSlot.get(4)+":"+secondSlot.get(4)+":"+thirdSlot.get(4)+":"+fourthSlot.get(4)+":"+fifthSlot.get(4);
                   System.out.println(response);
        }
        //7 coins and 5 trans ends..
        
        //7 coins and 6 trans starts..
        else if(coinCount ==7 && transCount==6){
           
           int firstCoin = values.get(0);
          int secondCoin = values.get(1);
          int thirdCoin = values.get(2);
          int fourthCoin = values.get(3);
          int fifthCoin = values.get(4);
          int sixthCoin = values.get(5)+values.get(6);
          
          
          
          ArrayList<Integer> firstSlot = new ArrayList<Integer>();
          ArrayList<Integer> secondSlot = new ArrayList<Integer>();
          ArrayList<Integer> thirdSlot = new ArrayList<Integer>();
          ArrayList<Integer> fourthSlot = new ArrayList<Integer>();
          ArrayList<Integer> fifthSlot = new ArrayList<Integer>();
          ArrayList<Integer> sixthSlot = new ArrayList<Integer>();
          
          firstSlot.clear();
          secondSlot.clear();
          thirdSlot.clear();
          fourthSlot.clear();
          fifthSlot.clear();
          
          GetData first = new GetData();
          firstSlot = first.getAllSlots(firstCoin, 6);
          GetData second = new GetData();
          secondSlot = second.getAllSlots(secondCoin, 6);
          GetData third = new GetData();
          thirdSlot = third.getAllSlots(thirdCoin, 6);
          GetData fourth = new GetData();
          fourthSlot = fourth.getAllSlots(fourthCoin, 6);
          GetData fifth = new GetData();
          fifthSlot = fifth.getAllSlots(fifthCoin, 6);
          GetData sixth = new GetData();
          sixthSlot = sixth.getAllSlots(sixthCoin, 6);
          
          
          response = firstSlot.get(0)+":"+secondSlot.get(0)+":"+thirdSlot.get(0)+":"+fourthSlot.get(0)+":"+fifthSlot.get(0)+":"+sixthSlot.get(0)+"\r\n";
          response += firstSlot.get(1)+":"+secondSlot.get(1)+":"+thirdSlot.get(1)+":"+fourthSlot.get(1)+":"+fifthSlot.get(1)+":"+sixthSlot.get(1)+"\r\n";
          response += firstSlot.get(2)+":"+secondSlot.get(2)+":"+thirdSlot.get(2)+":"+fourthSlot.get(2)+":"+fifthSlot.get(2)+":"+sixthSlot.get(2)+"\r\n";
          response += firstSlot.get(3)+":"+secondSlot.get(3)+":"+thirdSlot.get(3)+":"+fourthSlot.get(3)+":"+fifthSlot.get(3)+":"+sixthSlot.get(3)+"\r\n";
          response += firstSlot.get(4)+":"+secondSlot.get(4)+":"+thirdSlot.get(4)+":"+fourthSlot.get(4)+":"+fifthSlot.get(4)+":"+sixthSlot.get(4)+"\r\n";
          response += firstSlot.get(5)+":"+secondSlot.get(5)+":"+thirdSlot.get(5)+":"+fourthSlot.get(5)+":"+fifthSlot.get(5)+":"+sixthSlot.get(5);
                   System.out.println(response);
        }
        //7 coins and 6 trans ends..
        
        
        //7 coins and 7 trans starts...
        else if(coinCount ==7 && transCount==7){
           
           int firstCoin = values.get(0);
          int secondCoin = values.get(1);
          int thirdCoin = values.get(2);
          int fourthCoin = values.get(3);
          int fifthCoin = values.get(4);
          int sixthCoin = values.get(5);
          int seventhCoin = values.get(6);
          
          
          
          ArrayList<Integer> firstSlot = new ArrayList<Integer>();
          ArrayList<Integer> secondSlot = new ArrayList<Integer>();
          ArrayList<Integer> thirdSlot = new ArrayList<Integer>();
          ArrayList<Integer> fourthSlot = new ArrayList<Integer>();
          ArrayList<Integer> fifthSlot = new ArrayList<Integer>();
          ArrayList<Integer> sixthSlot = new ArrayList<Integer>();
          ArrayList<Integer> seventhSlot = new ArrayList<Integer>();
          
          
          firstSlot.clear();
          secondSlot.clear();
          thirdSlot.clear();
          fourthSlot.clear();
          fifthSlot.clear();
          sixthSlot.clear();
          
          GetData first = new GetData();
          firstSlot = first.getAllSlots(firstCoin, 7);
          GetData second = new GetData();
          secondSlot = second.getAllSlots(secondCoin, 7);
          GetData third = new GetData();
          thirdSlot = third.getAllSlots(thirdCoin, 7);
          GetData fourth = new GetData();
          fourthSlot = fourth.getAllSlots(fourthCoin, 7);
          GetData fifth = new GetData();
          fifthSlot = fifth.getAllSlots(fifthCoin, 7);
          GetData sixth = new GetData();
          sixthSlot = sixth.getAllSlots(sixthCoin, 7);
          GetData seventh = new GetData();
          seventhSlot = seventh.getAllSlots(seventhCoin, 7);
          
          
          response = firstSlot.get(0)+":"+secondSlot.get(0)+":"+thirdSlot.get(0)+":"+fourthSlot.get(0)+":"+fifthSlot.get(0)+":"+sixthSlot.get(0)+":"+seventhSlot.get(0)+"\r\n";
          response += firstSlot.get(1)+":"+secondSlot.get(1)+":"+thirdSlot.get(1)+":"+fourthSlot.get(1)+":"+fifthSlot.get(1)+":"+sixthSlot.get(1)+":"+seventhSlot.get(1)+"\r\n";
          response += firstSlot.get(2)+":"+secondSlot.get(2)+":"+thirdSlot.get(2)+":"+fourthSlot.get(2)+":"+fifthSlot.get(2)+":"+sixthSlot.get(2)+":"+seventhSlot.get(2)+"\r\n";
          response += firstSlot.get(3)+":"+secondSlot.get(3)+":"+thirdSlot.get(3)+":"+fourthSlot.get(3)+":"+fifthSlot.get(3)+":"+sixthSlot.get(3)+":"+seventhSlot.get(3)+"\r\n";
          response += firstSlot.get(4)+":"+secondSlot.get(4)+":"+thirdSlot.get(4)+":"+fourthSlot.get(4)+":"+fifthSlot.get(4)+":"+sixthSlot.get(4)+":"+seventhSlot.get(4)+"\r\n";
          response += firstSlot.get(5)+":"+secondSlot.get(5)+":"+thirdSlot.get(5)+":"+fourthSlot.get(5)+":"+fifthSlot.get(5)+":"+sixthSlot.get(5)+":"+seventhSlot.get(5)+"\r\n";
          response += firstSlot.get(5)+":"+secondSlot.get(5)+":"+thirdSlot.get(5)+":"+fourthSlot.get(5)+":"+fifthSlot.get(5)+":"+sixthSlot.get(5)+":"+seventhSlot.get(6);
                   System.out.println(response);
        }
        
        //7 coins and 7 trans ends..
        }catch(Exception e){
            System.out.println(e);
        }
        return response;
    }
}
