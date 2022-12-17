package day05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("src/day05/day05.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        String[] nums;
        String result="";
        Stack<Character> midStack = new Stack<>();

        ArrayList<Stack<Character>> stacks = init();

        while ((line=br.readLine()) != null) {
            nums = line.replace("move ", "")
                    .replace(" from ", ",")
                    .replace(" to ", ",")
                    .split(",");

            if(nums.length != 3){
                throw new Exception("Incorrect split");
            }

            int times = Integer.parseInt(nums[0]);
            int from = Integer.parseInt(nums[1]) -1 ;
            int to = Integer.parseInt(nums[2]) -1 ;

            if(times > stacks.get(from).size()){
                throw new Exception("More items than owning");
            }

            // part 1
            for(int i=0; i<times; i++){
                midStack.push(stacks.get(from).pop());
            }
            // part 2
            for(int i=0; i<times; i++){
                stacks.get(to).push(midStack.pop());
            }


        }

        for(int i=0; i < stacks.size(); i++){
            result += stacks.get(i).pop();
        }

        System.out.println(result);

        br.close();
    }

    private static Stack<Character> generateStack(char[] chars){
        Stack<Character> chStack = new Stack<>();
        for(char ch : chars){
            chStack.push(ch);
        }
        return chStack;
    }

    private static ArrayList<Stack<Character>> init(){
        ArrayList<Stack<Character>> stacks = new ArrayList<>(9);

        char[] chars0 = {'N','B','D','T','V','G','Z','J'};
        stacks.add(generateStack(chars0));

        char[] chars1 = {'S','R','M','D','W','P','F'};
        stacks.add(generateStack(chars1));

        char[] chars2 = {'V','C','R','S','Z'};
        stacks.add(generateStack(chars2));

        char[] chars3 = {'R','T','J','Z','P','H','G'};
        stacks.add(generateStack(chars3));

        char[] chars4 = {'T','C','J','N','D','Z','Q','F'};
        stacks.add(generateStack(chars4));

        char[] chars5 = {'N','V','P','W','G','S','F','M'};
        stacks.add(generateStack(chars5));

        char[] chars6 = {'G','C','V','B','P','Q'};
        stacks.add(generateStack(chars6));

        char[] chars7 = {'Z','B','P','N'};
        stacks.add(generateStack(chars7));

        char[] chars8 = {'W','P','J'};
        stacks.add(generateStack(chars8));

        return stacks;
    }



}
