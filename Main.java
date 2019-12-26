import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        num2();
    }
    public static void num1() throws Exception {
        int counter = 0;
        Scanner path = new Scanner(System.in);
        String pathStr = path.nextLine();
        FileReader fr = new FileReader(pathStr);
        Scanner in = new Scanner(fr);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            char[] strChar = str.toCharArray();
            for (char letter : strChar) {
                if (letter == 'r') {
                    counter++;
                }
            }
        }
        System.out.println(counter);
        fr.close();
    }
    public static void num2() throws Exception{
        int counterForSymbols = 0, counter = 0;
        Scanner path = new Scanner(System.in);
        String pathStr = path.nextLine();
        FileReader fr = new FileReader(pathStr);
        Scanner in = new Scanner(fr);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            for (String word : str.split("\\s")) {
                char[] wordChar = word.toCharArray();
                for (char letter : wordChar) {
                    if (letter == 'r') {
                        counterForSymbols++;
                    }
                }
                if (counterForSymbols >= 3){
                    counter++;
                }
                counterForSymbols = 0;
            }
        }
        System.out.println(counter);
        fr.close();
    }
}