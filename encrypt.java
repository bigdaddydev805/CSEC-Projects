
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class encrypt{
    public static void encryption() throws IOException {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter File Name");
        String path = scan.nextLine();
        System.out.println("Enter Key");
        int key = scan.nextInt();
        scan.close();

        FileInputStream f = new FileInputStream(path);
        byte bytearr[] = new byte[f.available()];
        f.read(bytearr);
        int count = 0;
        

        for (byte b : bytearr) {
            bytearr[count] = (byte)(key ^ b);
            count++;
        }

        FileOutputStream fout = new FileOutputStream(path);

        fout.write(bytearr);
        fout.close();
        f.close();
        


        
    }

    public static void main(String[] args) throws IOException {
        encryption();
    }
}