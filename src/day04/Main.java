package day04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception{
        File file = new File("src/day04/day04.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        int result1 = 0;
        int result2 = 0;
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

            if(!contains(nums)) {
                result1++;
            }
            if(!notOverlaps(nums)) {
                result2++;
            }
        }

        System.out.println(result2);
        br.close();
    }

    private static boolean notOverlaps(int[] nums) {
        return (nums[0] > nums[3]) || (nums[1] < nums[2]);
    }

    private static boolean contains(int[] nums) {
        return (nums[0] <= nums[2] && nums[1] >= nums[3]) || (nums[0] >= nums[2] && nums[1] <= nums[3]);
    }
}
