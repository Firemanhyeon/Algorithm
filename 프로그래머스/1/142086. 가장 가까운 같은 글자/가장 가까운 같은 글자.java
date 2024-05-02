class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        //0번인덱스는 무조건 -1 
        // 자기인덱스와 indexOf에서 반환하는 인덱스가 다를때 자기인덱스 - indexOf인덱스
        answer = new int[s.length()];
        StringBuilder stb = new StringBuilder(s);
        answer[0] = -1;
        for(int i=1;i<answer.length;i++){
            String str = stb.charAt(i)+"";
            if(stb.indexOf(str)!=i && stb.indexOf(str)!=-1){
                answer[i] = i - stb.indexOf(str);
                stb.setCharAt(stb.indexOf(str),'Z');
            }
            else if(stb.indexOf(str)==-1){
                answer [i] = -1;
            }
            else if(stb.indexOf(str)==i){
                answer[i]=-1;
            }


        }
        return answer;
    }
}