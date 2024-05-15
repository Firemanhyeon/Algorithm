class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dh = {0,1,-1,0};
        int[] dw = {1,0,0,-1};
        
        String[][] brd = new String[board.length+2][board.length+2];//비교할 새로운판
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                brd[i+1][j+1]= board[i][j];
            }
        }
        for(int i=0;i<4;i++){
            int h_check = h+dh[i]+1;
            int w_check = w+ dw[i]+1;
            String beforeBrd = board[h][w];
            String brdString = brd[h_check][w_check];
            if(brdString == null || beforeBrd == null){
                continue;
            }else{
                if(beforeBrd.equals(brdString)){
                    answer++;
                }
            }
            
           
            
            
        }
        // for(int i=0;i<brd.length;i++){
        //     for(int j=0;j<brd.length;j++){
        //         System.out.println(brd[i][j]);
        //     }
        //     System.out.println();
        // }
        return answer;
    }
}