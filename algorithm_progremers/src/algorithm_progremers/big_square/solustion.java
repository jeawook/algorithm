package algorithm_progremers.big_square;

//가장 큰 정사각형 찾기
class Solution
{

    public static void main(String[] args) {
        int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
        //int[][] board = {{0,0,1,1},{1,1,1,1}};
        Solution solution = new Solution();
        System.out.println(solution.solution(board));
    }


    public int solution(int [][]board)
    {
        int h = board.length;
        int w = board[0].length;
        int max = 0;
        if (h > 2 && w >2){
            for(int i=1;i<h;i++) {
                for (int j=1;j<w;j++) {
                     if(board[i][j] == 1){
                         board[i][j] +=Math.min(Math.min(board[i-1][j-1],board[i-1][j]),board[i][j-1]);
                         max = max < board[i][j] ? board[i][j] : max;
                     }
                }
            }
        }else{
            max = board[0][0];
        }

        return max * max;
    }
}