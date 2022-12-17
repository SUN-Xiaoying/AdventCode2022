package day06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Day06 {
    public static void main(String[] args) throws Exception {
        File file = new File("src/day06/day06.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        int result = 0;
        final int SIZE = 14;

        line = br.readLine();

        LinkedList<Character> fifo = new LinkedList<>();
        for(; result< SIZE; result++) {
            fifo.add(line.charAt(result));
        }

        System.out.println("Result" + result);

        for(; result< line.length(); result++) {
            if(!duplicated(fifo)){
                System.out.println(result);
                return;
            }
            fifo.removeFirst();
            fifo.add(line.charAt(result));
        }

    }

    public static boolean duplicated(LinkedList<Character> chars) {
        Set set = new HashSet(chars);
        return set.size() < chars.size();
    }
}
