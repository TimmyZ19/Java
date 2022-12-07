import java.io.*;

public class ZD3 {

    public static void main(String[] args) {
        try (FileReader reader = new FileReader("ZD3.json")) {
            int c;
            StringBuilder sb = new StringBuilder();
            while ((c = reader.read()) != -1) {
                sb.append((char) c);
            }
            String text = sb.toString();
            StringBuilder sb1 = new StringBuilder();
            for (char ch : text.toCharArray())
                if (Character.isLetter(ch) || Character.isDigit(ch))
                    sb1.append(ch);
            text = sb1.toString();
            text = text.replace("оценка", " получил ");
            text = text.replace("предмет", " по предмету ");
            text = text.replace("фамилия", "\nСтудент ");
            System.out.println(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }
}
