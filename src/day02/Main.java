package day02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("src/day02/day02.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        int score1 = 0;
        int score2 =0 ;
        while((line = br.readLine()) != null){
            score1 += getScore(line);
            score2 += getScore2(line);
        }

        System.out.println(score1);
        System.out.println(score2);
    }

    private static int getScore(String line) {
        char a = line.charAt(0);
        char b = line.charAt(2);

        switch (a){
            case 'A':
                switch (b){
                    case 'X':return 3+1;
                    case 'Y':return 6+2;
                    case 'Z':return 0+3;
                }
                break;
            case 'B':
                switch (b){
                    case 'X':return 0+1;
                    case 'Y':return 3+2;
                    case 'Z':return 6+3;
                }
                break;
            case 'C':
                switch (b){
                    case 'X':return 6+1;
                    case 'Y':return 0+2;
                    case 'Z':return 3+3;
                }
                break;
            default:
                System.out.println("WTF");
                return 0;
        }

        return 0;
    }
    private static int getScore2(String line){
        char a = line.charAt(0);
        char b = line.charAt(2);

        switch (a){
            case 'A':
                switch (b){
                    case 'X':return 3+0;
                    case 'Y':return 1+3;
                    case 'Z':return 2+6;
                }
                break;
            case 'B':
                switch (b){
                    case 'X':return 1+0;
                    case 'Y':return 2+3;
                    case 'Z':return 3+6;
                }
                break;
            case 'C':
                switch (b){
                    case 'X':return 2+0;
                    case 'Y':return 3+3;
                    case 'Z':return 1+6;
                }
                break;
            default:
                System.out.println("WTF");
                return 0;
        }

        return 0;
    }
}
