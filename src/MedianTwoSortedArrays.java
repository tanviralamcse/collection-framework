import java.util.Arrays;

public class MedianTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int size1=nums1.length;
        int size2=nums2.length;
        int[] nums3= new int[size1+size2];
        while(i < nums1.length){
            nums3[k++] = nums1[i++];
        }
        while(j < nums1.length){
            nums3[k++] = nums2[j++];
        }
        Arrays.sort(nums3);
        int n = nums3.length;
        if (n % 2 == 0)
        {
            int z = n / 2;
            int e = nums3[z];
            int q = nums3[z - 1];
            int ans = (e + q) / 2;
            return ans;
        }
        else
        {
            int z = Math.round(n / 2);
            return nums3[z];
        }
    }
    public static void main(String[] args){
        int[] num1 = {1,3,4};
        int[] num2 = {2,4,5,6};
        MedianTwoSortedArrays abc = new MedianTwoSortedArrays();
        abc.findMedianSortedArrays(num1,num2);

    }
}
