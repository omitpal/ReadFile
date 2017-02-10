import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by user on 2/2/17.
 */
public class FileWrite {
public static void main(String[]agrs){
try{
//String s="ehfgrjehgerkjghjtrklh";
    PrintWriter  br=new PrintWriter("E:/FileRead\\edit.txt");
    br.println("hvfgghug");
    br.close();

}
 catch(Exception e){
     e.printStackTrace();
 }


}
}
