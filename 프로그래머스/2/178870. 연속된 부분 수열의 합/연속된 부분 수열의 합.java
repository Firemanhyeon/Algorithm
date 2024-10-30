class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int start =0;
        int end =0 ;
        int sum = sequence[0];
        int length = Integer.MAX_VALUE;
        int currentLength = 0;
        while(end<sequence.length && start<sequence.length){
            //같은경우
            //지금 저장되어있는 length와 길이 비교
            if(sum==k){
                currentLength = end-start+1;
                if(currentLength < length){
                    answer[0] = start;
                    answer[1] = end;
                    length = currentLength;
                }
    
            }
            //이상
            if(sum>=k){
                sum-=sequence[start++];
            //미만
            }else{
                if(++end<sequence.length){
                    sum+=sequence[end];
                }
            }
        }
        return answer;
    }
}