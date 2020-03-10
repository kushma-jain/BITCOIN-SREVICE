/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.security.SecureRandom;
import java.util.Random;


public class Otp 
{ 
    

    
    public static String randomString(char[] characterSet, int length) {
    
    Random random = new SecureRandom();
    char[] result = new char[length];
    for (int i = 0; i < result.length; i++) {
        // picks a random index out of character set > random character
        int randomCharIndex = random.nextInt(characterSet.length);
        result[i] = characterSet[randomCharIndex];
    }
    return new String(result);
}
    
    public static void main(String[] args) 
    {
        
      char[] CHARSET_AZ_09 = "ABCDEFGHIJKLMNOPQRSVZ0123456789".toCharArray();
      String Uid=Otp.randomString(CHARSET_AZ_09, 4);
      System.out.println("Otp is:"+Uid);
       
        
    }
    
}
