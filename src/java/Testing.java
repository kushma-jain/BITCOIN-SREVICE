import java.io.*;
import java.util.*;
public class Testing {
    
    public static void main(String []args){
        try{
        FileOutputStream fos = new FileOutputStream("D:\\ttt.txt");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject("dddd");
        os.close();
        fos.close();
        }catch(Exception e ){
            System.out.println(e);
        }
    }
    
}
