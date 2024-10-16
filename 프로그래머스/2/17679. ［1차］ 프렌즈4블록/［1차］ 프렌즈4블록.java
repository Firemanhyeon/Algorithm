class Solution {
    public int solution(int m, int n, String[] board) {
        int[] x = {0,1,1};//우 밑 대각
        int[] y = {1,0,1};
        int answer = 0;
        char[][] brd = new char[m][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length();j++){
                brd[i][j]=board[i].charAt(j);
            }
        }
        //2x2찾기

        while(true){
            boolean[][] remove = new boolean[m][n];
            boolean found = false;
            for(int i=0;i<brd.length-1;i++){
                for(int j=0;j<brd[i].length-1;j++){
                    char current = brd[i][j];
                    if(current == ' '){
                        continue;
                    }


                    //체크
                    boolean chk = true;
                    for(int k=0;k<3;k++){

                        int nx = i+x[k];
                        int ny = j+y[k];
                        if(current != brd[nx][ny]){
                            chk=false;
                            break;
                        }
                    }

                    //2x2성립했을때
                    if(chk){
                        found=true;
                        remove[i][j]=true;
                        remove[i][j+1]=true;
                        remove[i+1][j]=true;
                        remove[i+1][j+1]=true;
                    }
                }
            }
            if(!found) break;
            //지우기
            for(int i=0;i<brd.length;i++){
                for(int j=0;j<brd[i].length;j++){
                    if(remove[i][j]){
                        brd[i][j]=' ';
                        answer++;
                    }
                }
            }
            //위에꺼 내리기
            for(int j=0;j<n;j++){
                for(int i=m-1;i>=0;i--){
                    if (brd[i][j] == ' ') { 
                        int k = i - 1; 
                        while (k >= 0 && brd[k][j] == ' ') k--; 
                        if (k >= 0) { 
                            brd[i][j] = brd[k][j];
                            brd[k][j] = ' ';
                        }
                    }

                }
            }
        }

        return answer;
    }
}