class ShuffleString{
     public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        String result = solution.restoreString(s, indices);
        System.out.println(result);
    }
}


class Solution {
    public String restoreString(String s, int[] indices) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int a = indices[i];
            ans = ans + s.charAt(a);
        }
        return ans;
    }
}
