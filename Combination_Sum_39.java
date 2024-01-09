import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Combination_Sum_39 {

    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {

            List<List<Integer>> list = new ArrayList<>();

            combinationSum(new ArrayList<>(), target, list, candidates, 0);

            return list;

        }

        public void combinationSum(List<Integer> ans, int target, List<List<Integer>> result, int[] candidates, int index) {

            if(index == candidates.length){
                if(target == 0){
                    result.add(new ArrayList<>(ans));
                }
                return;

            }

            if(candidates[index] <= target){
                ans.add(candidates[index]);
                combinationSum(ans, target-candidates[index], result, candidates, index);
                ans.remove(ans.size() - 1);
            }

            combinationSum(ans, target, result, candidates, index+1);






        }
    }
}
