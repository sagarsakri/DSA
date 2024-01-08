package recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        CombinationSum combinationSum = new CombinationSum();
        List<List<Integer>> result = combinationSum.combinationSum(candidates, target);

        System.out.println("Combinations that sum up to " + target + ":");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, target, candidates, ans, new ArrayList<>());
        return ans;
    }

    private void findCombinations(int ind, int target, int[] candidates,
                                  List<List<Integer>> ans, List<Integer> ds) {
        if (ind == candidates.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if (candidates[ind] <= target) {
            ds.add(candidates[ind]);
            findCombinations(ind, target - candidates[ind], candidates, ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombinations(ind + 1, target, candidates, ans, ds);
    }
}
