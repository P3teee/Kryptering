import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;
/**
 * Created by bepe14 on 2016-12-09.
 */
public class Kryptering {
    public static void main (String[] args) throws IOException {

        String fil = "infil.txt";

        FileReader fr = new FileReader(fil);
        BufferedReader infil = new BufferedReader(fr);

        String rad = infil.readLine();
        System.out.println("Okrypterat = " + rad);
        infil.close();

        String nyckel = "nyckelfil.txt";

        String line;

        while ((line = ))
    }
}
