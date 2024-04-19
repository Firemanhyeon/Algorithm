class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long count=(long)x;
        long count1=(long)x;
        for(int i=0;i<n;i++){
            answer[i]=count;
            count = count+count1;
        }
        return answer;
    }
}