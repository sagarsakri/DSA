package recursion;

public class CombinationSum_II {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(candidates, target, 0, ans, new ArrayList<>());
        return ans;

    }

    public void findCombination(int[] candidates, int target, int ind, List<List<Integer>> ans, List<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
        }
        for (int i = ind; i < candidates.length; i++) {
            if (i > ind && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] > target) break;
            ds.add(candidates[i]);

            findCombination(candidates, target - candidates[i], i + 1, ans, ds);
            ds.remove(ds.size() - 1);

        }
    }

}
