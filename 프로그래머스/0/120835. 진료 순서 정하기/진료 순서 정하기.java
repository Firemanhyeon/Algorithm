class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int min=emergency[0];
        int cnt ;
        for(int i=0;i<emergency.length;i++){
            cnt=emergency.length;
            for(int j=0;j<emergency.length;j++){
                if(emergency[i] > emergency[j]){
                    cnt--;
                }
            }
            answer[i]=cnt;
        }
        return answer;
    }
}