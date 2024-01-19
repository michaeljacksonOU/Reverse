import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        for (int i = s.length() - 1; i >= 0 ; i--) {
            System.out.print(s.charAt(i));
        }
           input.close(); 
        }
    }

