/**
 * Created by user on 2/1/17.
 */
import java.io.*;
public class CharFileRead {
  public static void main(String[]agrs){
    try{
         BufferedReader br=new BufferedReader(new FileReader("E:/FileRead\\edit.txt"));
          String value;
        while((value=br.readLine())!=null)
        {
           System.out.println(value);
        }
        br.close();
    }
        catch(Exception e){

            e.printStackTrace();

        }

        //br.close();

        }
    }

