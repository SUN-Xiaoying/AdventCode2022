package day05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("src/day04/day04.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        String[] nums;

        ArrayList<String> stacks = init();
        while ((line=br.readLine()) != null) {
            nums = line.replace("move ", "")
                    .replace(" from ", ",")
                    .replace(" to ", ",")
                    .split(",");

            if(nums.length != 3){
                throw new Exception("Incorrect split");
            }
            int from = Integer.parseInt(nums[1]);
            int to = Integer.parseInt(nums[2]);

            stacks.set(to, stacks.get());



        }
        br.close();
    }

    private static ArrayList<Stack<Character>> init(){
        ArrayList<Stack<Character>> stacks = new ArrayList<>(9);

        Stack<Character> stack0 = new Stack<>();
        char[] chars = {'J','Z','G','V','T','D','B','N'};

        for(char ch : chars){
            stack0.push(ch);
        }
        stacks.add(stack0);

        stacks.add("JZGVTDBN");
        stacks.add("FPWDNRS");
        stacks.add("ZSRCV");
        stacks.add("GHPZJTR");
        stacks.add("FQZDNJCT");
        stacks.add("MFSGWPVN");
        stacks.add("QPBVCG");
        stacks.add("NPBZ");
        stacks.add("JPW");

        return stacks;
    }



}
