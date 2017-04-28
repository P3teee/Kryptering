import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.lang.*;
/**
 * Created by bepe14 on 2016-12-09.
 */
public class Kryptering {
    public static void main (String[] args) throws IOException {

        String fil = "infil.txt";
        String nyckel = "nyckelfil.txt";

        Path file = Paths.get("utfil.txt");
        try {
            Files.createFile(file);
        } catch (FileAlreadyExistsException x) {
            System.err.format("file named %s" +
                    " already exists%n", file);
        } catch (IOException x) {
            System.err.format("createFile error: %s%n", x);
        }

        FileReader fr = new FileReader(fil);
        BufferedReader infil = new BufferedReader(fr);

        FileReader fr1 = new FileReader(nyckel);
        BufferedReader nyckelfil = new BufferedReader(fr1);

        String slutfil = "utfil.txt";
        FileWriter fw = new FileWriter(slutfil);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter utfil = new PrintWriter(bw);

        String line1 = infil.readLine();
        String line2 = nyckelfil.readLine();
        String result = "";



        infil.close();
        nyckelfil.close();




            StringBuilder sb = new StringBuilder();

            for (int i = 0 ; i < line1.length() ; i++) {
               sb.append((char) (line1.charAt(i) ^ line2.charAt(i % line2.length())));

                 //char xorchar = (char)(line1.charAt(i) ^ line2.charAt(i % line2.length()));

                //result += xorchar;
                result = sb.toString();


            }
            System.out.println(result);
            utfil.println(result);
            utfil.close();
        }






    }

