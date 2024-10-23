import java.io.*;
import java.util.*;

class FileHandling {
    public static void main(String[] args)throws FileNotFoundException,IOException {
    
    String str;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the data : ");
    str = sc.nextLine();
    FileWriter writer = new FileWriter("sample.text");
    System.out.println("Succesfully Added");
    
    for(int i=0;i<str.length();i++){
        writer.write(str.charAt(i));
    }
    writer.flush();
    writer.close();
    FileReader reader = new FileReader("sample.txt");
    FileWriter fw = new FileWriter("newsample.txt");
    int j;
    while((j=reader.read())!=1) {
        fw.write((char)j);
    }
    reader.close();
    fw.flush();
    fw.close();
    }
}