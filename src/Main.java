import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String input1 = scan.nextLine();
        String input2 = scan.nextLine();

        String [] data = input2.split(" ");
        int [] temps = new int[data.length];

        int finalAnswer = 0;

        for (int i = 0; i < data.length; i++){
            temps[i] = Integer.parseInt(data[i]);
        }
        for (int i = 0; i < temps.length; i++){
            if (temps[i] < 0){
                finalAnswer++;
            }
        }
        System.out.println(finalAnswer);
    }
}