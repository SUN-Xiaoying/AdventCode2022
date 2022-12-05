public class Main {
    public static void main(String[] args) {
        String line = "30-31,8-30";
        String[] chars = line.replace(",", "-").split("-");
        int[] nums= new int[4];

        for(int i=0; i< chars.length; i++){
            nums[i] = Integer.parseInt(chars[i]);
            System.out.println(nums[i]);
        }
        System.out.println(ifContains(nums));
    }

    private static boolean ifContains(int[] nums) {

        if (nums[2] > nums[1] || nums[0] > nums[3]) {
            return false;
        } else if (nums[0] >= nums[2]) {
            return nums[1] <= nums[3] ? true : false;
        } else {
            return nums[1] >= nums[3] ? true : false;
        }
    }
}