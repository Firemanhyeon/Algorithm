class Solution {
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        com(arr,0,0,arr.length,answer);
        return answer;
    }
    public void com(int[][] arr , int x , int y , int size , int[] answer){
     
        if(sameChk(arr,x,y,size,answer)){
            return;
        }
        
        int nSize = size/2;
        com(arr,x,y,nSize,answer);
        com(arr,x,y+nSize,nSize,answer);
        com(arr,x+nSize,y,nSize,answer);
        com(arr,x+nSize,y+nSize,nSize,answer);
    }
    
    public boolean sameChk(int[][]arr , int x , int y , int size, int[] answer){
        int val = arr[x][y];
        boolean chk = true;
        for(int i=x;i<x+size;i++){
            for(int j=y;j<y+size;j++){
                if(arr[i][j] != val){
                    chk= false;
                }
            }
        }
        if(chk){
            answer[arr[x][y]]++;
            return true;
        }else{
            return false;
        }
    }
}