import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bruteforce obj = new Bruteforce();
        Scanner sc = new Scanner(System.in);
        //text
        String text = "Why would I even do this code?";
        //word that want to be matched in the text
        String tobematched = "code";

        // this calls the function

        int position = Bruteforce.bruteforce(text, tobematched);
        int endindex = position + 1;

        // Check whether patterns match
        if (position == -1) {
            System.out.println("The word is not found in the text");
        } else {
            System.out.println("Found at position:" + "\n" + (position + 1));
            System.out.println("End at the position:" + "\n" + (endindex + tobematched.length()));
        }
    }
}
