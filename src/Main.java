import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Stack<Character>> stacks = new ArrayList<>(9);

        Stack<Character> stack0 = new Stack<>();
        char[] chars = {'J','Z','G','V','T','D','B','N'};

        for(char ch : chars){
            stack0.push(ch);
        }
        stacks.add(stack0);

        System.out.println(stacks.get(0));
        System.out.println(stacks.get(0).pop());

    }
}