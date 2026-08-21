class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new ArrayList<>();

        int rb = 0;
        int cb = 0;
        int re = matrix.length - 1;
        int ce = matrix[0].length - 1;

        while (rb <= re && cb <= ce) {

            // Right
            for (int i = cb; i <= ce; i++) {
                res.add(matrix[rb][i]);
            }
            rb++;

            // Down
            for (int j = rb; j <= re; j++) {
                res.add(matrix[j][ce]);
            }
            ce--;

            // Left
            if (rb <= re) {
                for (int k = ce; k >= cb; k--) {
                    res.add(matrix[re][k]);
                }
                re--;
            }

            // Up
            if (cb <= ce) {
                for (int l = re; l >= rb; l--) {
                    res.add(matrix[l][cb]);
                }
                cb++;
            }
        }

        return res;
    }
}