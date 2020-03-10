/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.auth;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author parveez
 */
@WebService(serviceName = "authentication")
public class authentication {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String uname,String password) {        
        String authStatus = "";
        try{
        FileInputStream fis = new FileInputStream("D:\\users_bitcoin.txt");
        byte bb[] = new byte[fis.available()];
        fis.read(bb);
        fis.close();
        ArrayList<String> uNames = new ArrayList<String>();
        ArrayList<String> pWords = new ArrayList<String>();
        uNames.clear();
        pWords.clear();
        StringTokenizer st1 = new StringTokenizer(new String(bb),"\r\n");
            while(st1.hasMoreTokens()){
                String token = st1.nextToken();
                StringTokenizer st2 = new StringTokenizer(token," ");
                while(st2.hasMoreTokens()){
                    uNames.add(st2.nextToken());
                    pWords.add(st2.nextToken());
                }
            }
        if(uNames.contains(uname)){
         int index = uNames.indexOf(uname);
         String tU = uNames.get(index);
         String tP = pWords.get(index);
         if(tU.equals(uname) && tP.equals(password)){
            authStatus = "yes"; 
         }
         else{
             authStatus = "no";
         }
        }
        else{
            authStatus = "no";
        }
        }catch(Exception e){
            System.out.println(e);
        }
        return authStatus;
    }
}
