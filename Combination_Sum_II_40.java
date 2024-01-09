

    import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

    public class Combination_Sum_II_40 {

    public class Solution {
        public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> list = new ArrayList<>();
            Arrays.sort(candidates);
            combinationSum(new ArrayList<>(), target, list, candidates, 0);
            return list;
        }

        public static void combinationSum(List<Integer> ans, int target, List<List<Integer>> result, int[] candidates, int index) {
            if (target == 0) {
                result.add(new ArrayList<>(ans));
                return;
            }

            for (int i = index; i < candidates.length; i++) {
                // Skip duplicates
                if (i > index && candidates[i] == candidates[i - 1]) {
                    continue;
                }

                if (candidates[i] <= target) {
                    ans.add(candidates[i]);
                    combinationSum(ans, target - candidates[i], result, candidates, i + 1);
                    ans.remove(ans.size() - 1);
                } else {
                    break; // Since the array is sorted, no need to check further
                }
            }
        }
    }

}
