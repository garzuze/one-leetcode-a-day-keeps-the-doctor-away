import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;


class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int resultOne = 0;
        int resultTwo = 0;
        Set<Integer> nums1Set = Arrays.stream(nums1)
                                .boxed()
                                .collect(Collectors.toSet());
        Set<Integer> nums2Set = Arrays.stream(nums2)
                        .boxed()
                        .collect(Collectors.toSet());

        for (int i = 0; i < nums1.length; i++) {
            if (nums2Set.contains(nums1[i])) {
                resultOne++;
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (nums1Set.contains(nums2[i])) {
                resultTwo++;
            }
        }

        int[] result = {resultOne, resultTwo};

        return result;
    }
}
