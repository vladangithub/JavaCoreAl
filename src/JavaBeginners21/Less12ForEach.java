package JavaBeginners21;

public class Less12ForEach {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 10;
        String[] strs = new String[3];
        strs[0] = "Hello";
        strs[1] = "World";
        strs[2] = "Java";
//        for (int i = 0; i < strs.length; i++) {
//            System.out.println(strs[i]);
//        }

        for (String xxx : strs) {
            System.out.println(xxx);
        }
        int[] nums1 = {1, 2, 3};
        int sum = 0;
        for (int x : nums1) {
            sum = sum + x;
        }
        System.out.println(sum);

        int val = 0;
        String s;
    }
}
