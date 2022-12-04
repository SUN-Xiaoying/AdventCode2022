package day03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("src/day03/day03.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        String line1, line2;
        int result=0;
        while ((line=br.readLine())!= null){

//            int mid = line.length() /2;
//            String line1 = line.substring(0,mid);
//            String line2 = line.substring(mid);

//            if(line1.length() != line2.length()){
//                throw new RuntimeException("Unequal division!");
//            }
//            result += getWeight(getSameChar(line1, line2));


            line1 = br.readLine();
            line2 = br.readLine();
            result += getSameChar(getSameString(line, line1), getSameString(line1, line2));
        }

        System.out.println(result);

        br.close();
    }

    private static String getSameString(String line1, String line2) {
        String str="";
        for(int i=0; i<line1.length(); i++){
            for(int j=0; j<line2.length(); j++){
                if(line1.charAt(i) == line2.charAt(j)){
                    str += line1.charAt(i);
                }
            }
        }
        return str;
    }

    private static int getSameChar(String line1, String line2) {
        for(int i=0; i<line1.length(); i++){
            for(int j=0; j<line2.length(); j++){
                if(line1.charAt(i) == line2.charAt(j)){
                    int ascValue = line1.charAt(i);
                    return ascValue<97 ? ascValue-38 : ascValue-96;
                }
            }
        }
        throw new RuntimeException("Not same char found!");
    }

    private static int getWeight(char ch){
        // ASCII Code: 65=A 97=a
        int ascValue = ch;
        return ascValue<97 ? ascValue-38 : ascValue-96;
    }
}
