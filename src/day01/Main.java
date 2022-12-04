package day01;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        File file = new File("/Users/xiaoying.sun/Advent2022/src/day01/day01.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        long currNum=0;
        long[] topThree = new long[3];

        String line;

        while((line = br.readLine()) != null) {

            if(line.length() == 0){
                if(currNum > topThree[0]){
                    topThree[2] = topThree[1];
                    topThree[1] = topThree[0];
                    topThree[0] = currNum;
                } else if (currNum > topThree[1]){
                    topThree[2] = topThree[1];
                    topThree[1] = currNum;
                } else if (currNum > topThree[2]){
                    topThree[2] = currNum;
                }
                currNum = 0;
            } else {
                currNum += Long.parseLong(line);
            }
        }

        long result = Arrays.stream(topThree).sum();

        System.out.println(result);
    }
}