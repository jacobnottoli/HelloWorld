import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Who do you want to say hello to?");
        String who = in.nextLine();
        System.out.println("Hello" + who);
    }
}
