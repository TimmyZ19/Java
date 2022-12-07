import java.util.logging.*;
import java.util.Scanner;
import java.io.IOException;

public class ZD2 {
        public static int calc(int a, String choice, int b) {
            int res = 0;
            switch (choice) {
                case ("+"):
                    res = a + b;
                    break;
                case ("-"):
                    res = a - b;
                    break;
                case  ("*"):
                    res = a * b;
                    break;
                case ("/"):
                    res = a / b;
                    break;

                default:
                    break;

            }
            return res;
        }
        public static void main(String[] args) throws IOException {
            Logger logger = Logger.getLogger(ZD2.class.getName());
            FileHandler fh = new FileHandler("logcalc.xml");
            logger.addHandler(fh);
            XMLFormatter xml = new XMLFormatter();
            fh.setFormatter(xml);
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("Введите первое число: \n");
            int a = iScanner.nextInt();
            logger.log(Level.INFO, "Введено первое число " + a);
            System.out.printf("Введите '+' для сложения; '-' для вычетания; '*' для умножения, '/' для деления: \n");
            String choice = iScanner.next();
            logger.log(Level.INFO, "Введен знак " + choice);
            System.out.printf("Введите второе число: \n");
            int b = iScanner.nextInt();
            logger.log(Level.INFO, "Введено второе число " + b);
            iScanner.close();
            int res = calc(a, choice, b);
            System.out.printf("Результат: %d %s %d = %d", a, choice, b, res, "\n");
            logger.log(Level.INFO, "Результат: "+ a + choice + b + "="+ res);

        }


}
