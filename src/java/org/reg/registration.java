/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.reg;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

import java.io.*;
import java.util.*;
@WebService(serviceName = "registration")
public class registration {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        try{
            
            String uName = "";
            String pWord = "";
        StringTokenizer st = new StringTokenizer(txt,":");
        while(st.hasMoreTokens()){
            uName = st.nextToken();
            pWord = st.nextToken();
        }
        FileInputStream fis = new FileInputStream("D:\\users_bitcoin.txt");
        byte bb[] = new byte[fis.available()];
        fis.read(bb);
        fis.close();
        ArrayList<String> uNames = new ArrayList<String>();
        ArrayList<String> pWords = new ArrayList<String>();
        uNames.clear();
        pWords.clear();
        if(bb.length ==0){
            String toAppend = uName+" "+pWord;
            FileOutputStream fos = new FileOutputStream("D:\\users_bitcoin.txt");
            fos.write(toAppend.getBytes());
            fos.close();
        }
        else{
            StringTokenizer st1 = new StringTokenizer(new String(bb),"\r\n");
            while(st1.hasMoreTokens()){
                String token = st1.nextToken();
                StringTokenizer st2 = new StringTokenizer(token," ");
                while(st2.hasMoreTokens()){
                    uNames.add(st2.nextToken());
                    pWords.add(st2.nextToken());
                }
            }
        }
        String toUPpend = "";
        for(int i=0;i<uNames.size();i++){
            toUPpend += uNames.get(i)+" "+pWords.get(i)+"\r\n";
        }
        toUPpend +=uName+" "+pWord;
        FileOutputStream fos = new FileOutputStream("D:\\users_bitcoin.txt");
        fos.write(toUPpend.getBytes());
        fos.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return "Registration successful!";
    }
}
