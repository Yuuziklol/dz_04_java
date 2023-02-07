import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.cert.TrustAnchor;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * dz_04
 */
public class dz_04 {

    public static void main(String[] args) {
        // Задание 1

        // try {
        //     FileWriter fw = new FileWriter("bd.sql");
        //     fw.append("Привет,мир!");
        //     fw.flush();
        // }
        // catch(IOException e) {
        //     System.out.println(e.getMessage());
        // }
        // String text = " ";
        // try {
        //     FileReader fr = new FileReader("bd.sql");
        //     while (fr.ready()) {
        //         text += (char) fr.read();
        //     }
        // }
        // catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }
        // System.out.println(text);

        //Задание 2
        String text = "";
        try {
            FileReader fr = new FileReader("bd.sql");
            while (fr.ready()) {
                text += (char) fr.read();
            }
            // System.out.println(text);
            String[] list = text.split("\n");
            System.out.println(Arrays.toString(list));
            ArrayList<String> name = new ArrayList<>();
            ArrayList<String> lastname = new ArrayList<>();
            ArrayList<String> fatname = new ArrayList<>();
            ArrayList<Integer> age = new ArrayList<>();
            ArrayList<Boolean> gender = new ArrayList<>();
            for (int i = 0; i < list.length; i++) {
                String[] tmp = list[i].split(" ");
                lastname.add(tmp[0]);
                name.add(tmp[1]);
                fatname.add(tmp[2]);
                age.add(Integer.parseInt(tmp[3]));
                gender.add(tmp[4].contains("М") ? false : true);
            }
            System.out.println(age);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}