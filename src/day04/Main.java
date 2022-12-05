package day04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception{
        File file = new File("src/day04/day04.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        int reslut=0;
        String[] chars;
        int[] nums = new int[4];

        while ((line=br.readLine()) != null) {
            chars = line.replace(",","-" ).split("-");

            if(chars.length != 4){
                throw new RuntimeException("Incorrect division");
            }

            for(int i=0; i< chars.length; i++){
                nums[i] = Integer.parseInt(chars[i]);
            }

            if(ifContains(nums)) {
                reslut++;
            }
        }

        System.out.println(reslut);
        br.close();
    }


    private static boolean ifContains(int[] nums) {
        // What's going on ? 462 wrong?
        if (nums[2] > nums[1] || nums[0] > nums[3]) {
            return false;
        } else if (nums[0] >= nums[2]) {
            return nums[1] <= nums[3] ? true : false;
        } else {
            return nums[1] >= nums[3] ? true : false;
        }
    }
}
