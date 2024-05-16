import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> box = new Stack();
        for(int i=0;i<moves.length;i++){
            int cnt = moves[i]-1;
            for(int j=0;j<board.length;j++){ 
                 if(board[j][cnt]!=0){
                    if(box.empty()){
                       box.push(board[j][cnt]);
                       board[j][cnt] = 0;
                        break;
                    }else if(box.peek()==board[j][cnt]){
                       answer+=2;
                       box.pop();
                       board[j][cnt]=0;
                        break;
                    }else{
                        box.push(board[j][cnt]);
                        board[j][cnt]=0;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}