/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.funds;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.io.*;
import java.util.*;
/**
 *
 * @author vinayak
 */
@WebService(serviceName = "funds")
public class funds {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        String funds = "";
        String fundsString = "";
        ArrayList<String> allBanks = new ArrayList<String>();
        ArrayList<String> allFunds = new ArrayList<String>();
        try{
            allBanks.clear();
            allFunds.clear();
        FileInputStream fis = new FileInputStream("D:\\myfinalproject\\accounts.txt");
        byte bb[] = new byte[fis.available()];
        fis.read(bb);
        fis.close();
        String fData = new String(bb);
        fData = fData.trim();
        StringTokenizer st = new StringTokenizer(fData,"\r\n");
        while(st.hasMoreTokens()){
         String token = st.nextToken();
         StringTokenizer st1 = new StringTokenizer(token,":");
         while(st1.hasMoreTokens()){
             allBanks.add(st1.nextToken());
             allFunds.add(st1.nextToken());
         }
        }
        
        
        for(int i=0;i<allBanks.size();i++){
            fundsString += allBanks.get(i)+"--"+allFunds.get(i)+"\r\n";
        }
        fundsString = fundsString.trim();
        }catch(Exception e){
            System.out.println(e);
        }
        return fundsString;
    }
}
