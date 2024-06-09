class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int oneSize = getLength(n);
        for(int i=n+1;i<=1000000;i++){
            int getOne = getLength(i);
            if(oneSize==getOne){
                answer = i;
                break;
            }
        }
        return answer;
    }
    public int getLength(int num){
        StringBuilder str = new StringBuilder();
        String len = Integer.toBinaryString(num);
        for(int i=0;i<len.length();i++){
            if(len.charAt(i)=='1'){
                str.append(len.charAt(i));
            }
        }
        return str.length();
    }
}