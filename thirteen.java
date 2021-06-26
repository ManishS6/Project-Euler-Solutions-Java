import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
public class thirteen {
    public static void main(String[] args) {        
        
        try {
            File fileName = new File("thirteen.txt");
            FileReader fileReader = new FileReader(fileName);     
            BufferedReader bufferedreader = new BufferedReader(fileReader);           
            String strLine;
            int line=0; 
            BigInteger sum = new BigInteger("5454564684456454684646454545");
            while ((strLine = bufferedreader.readLine()) != null) {
                line++;
                System.out.println("Line #"+line+" is → "+strLine);
                sum.add(new BigInteger(strLine));
            }       
            sum.subtract(new BigInteger("5454564684456454684646454545"));
            System.out.print("The Answer is → "+sum.toString());  
           fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();     
        }
 
    }
}
