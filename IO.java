import java.io.*;
import java.util.Properties;

public class IO {
    public static void main(String[] args) {
        try {
            // 1. Read from .txt file using InputStream
            FileInputStream fis = new FileInputStream("input.txt");
            int i;
            System.out.println("1. Reading using InputStream:");
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            fis.close();
            System.out.println("\n---");

            // 2. Write to .txt file using OutputStream
            FileOutputStream fos = new FileOutputStream("output.txt");
            String data = "This is OutputStream writing.";
            fos.write(data.getBytes());
            fos.close();
            System.out.println("2. Data written using OutputStream.\n---");

            // 3. Read using FileReader
            FileReader fr = new FileReader("input.txt");
            int j;
            System.out.println("3. Reading using FileReader:");
            while ((j = fr.read()) != -1) {
                System.out.print((char) j);
            }
            fr.close();
            System.out.println("\n---");

            // 4. Write using FileWriter
            FileWriter fw = new FileWriter("output2.txt");
            fw.write("This is FileWriter writing.");
            fw.close();
            System.out.println("4. Data written using FileWriter.\n---");

            // 5. Read using BufferedReader
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;
            System.out.println("5. Reading using BufferedReader:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            System.out.println("---");

            // 6. Write using BufferedWriter
            BufferedWriter bw = new BufferedWriter(new FileWriter("output3.txt"));
            bw.write("This is BufferedWriter writing.");
            bw.newLine();
            bw.write("Second line of text.");
            bw.close();
            System.out.println("6. Data written using BufferedWriter.\n---");

            // 7. Read from .properties file
            Properties prop = new Properties();
            FileInputStream pFile = new FileInputStream("config.properties");
            prop.load(pFile);
            System.out.println("7. Reading from Properties file:");
            System.out.println("username: " + prop.getProperty("username"));
            System.out.println("password: " + prop.getProperty("password"));
            pFile.close();
            System.out.println("---");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
