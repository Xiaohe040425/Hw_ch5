import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

class page35 {
    public static void main(String[] args) {
        try {
        	FileWriter fw = new FileWriter("test1.txt");
        	PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
            
        	pw.println("Hello");
        	pw.println("Bye");
        	pw.close();

            System.out.println("資料寫入");
        } catch (IOException e) {
            System.out.println("輸出入有錯誤");
        }
    }
}
