import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String input;
        Scanner in = new Scanner(System.in);
        System.out.print("input : ");
        input = in.next();

        Stack<String> pair = new Stack<>();
        for(int i=0; i<input.length(); i++){
            if(String.valueOf(input.charAt(i)).equals("(")){
                pair.push("(");
            }
            else{
                if(pair == null || pair.isEmpty()){
                    System.out.println("false");
                    return;
                }
                else {
                    pair.pop();
                }
            }
        }
        if(!pair.isEmpty()){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    }
}