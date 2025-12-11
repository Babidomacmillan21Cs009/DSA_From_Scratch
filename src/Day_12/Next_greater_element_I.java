package Day_12;

public class Next_greater_element_I {

    public static int[] findNextGreaterElement(int[] nums1, int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;
        for (int i = 0; i < n1; i++) {
            int j = 0;
            while (nums1[i] != nums2[j]) {
                j++;
            }
            while (nums1[i] >= nums2[j] && j < n2 - 1) {
                j++;
            }
            if (nums1[i] < nums2[j])
                nums1[i] = nums2[j];
            else
                nums1[i] = -1;
        }
        return nums1;
    }


    public static void main(String[] args) {
        int[] nums1 = {3,1,5,7,9,2,6};
        int[] nums2 = {1,2,3,5,6,7,9,11};
        int[] ans = findNextGreaterElement(nums1, nums2);
        for (int i : ans){
            System.out.print(i+" ");
        }

    }
}
