class Solution {
    public int solution(int[][] board) {
        int[][] newBoard= new int[board.length+2][board.length+2];
        for(int i=0;i<board.length;i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j]==1) {
                    change(i+1,j+1 , newBoard);
                }
            }
        }
        int cnt=0;
        for(int i=1;i<newBoard.length-1;i++) {
            for(int j=1;j<newBoard[i].length-1;j++) {
                if(newBoard[i][j]==0) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    
    public static void change(int i , int j,int[][] newBoard){
        newBoard[i-1][j-1]=1;
        newBoard[i-1][j]=1;
        newBoard[i-1][j+1]=1;
        newBoard[i][j-1]=1;
        newBoard[i][j]=1;
        newBoard[i][j+1]=1;
        newBoard[i+1][j-1]=1;
        newBoard[i+1][j]=1;
        newBoard[i+1][j+1]=1;
    }
}