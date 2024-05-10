class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] beforeCh = before.toCharArray();
        char[] afterCh= after.toCharArray();
        for(int i=0;i<beforeCh.length;i++){
            for(int j=0;j<afterCh.length;j++){
                if(beforeCh[i]==afterCh[j]){
                    afterCh[j]=' ';
                    answer++;
                    break;
                }
            }
        }
        if(answer==beforeCh.length){
            answer=1;
        }else{
            answer=0;
        }
        return answer;
    }
}