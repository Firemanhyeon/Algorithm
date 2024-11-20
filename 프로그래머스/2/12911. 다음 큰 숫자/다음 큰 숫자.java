class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toBinaryString(n);
        int len =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                len++;
            }
        }
        for(int i=n+1;i<1000000;i++){
            String str2 = Integer.toBinaryString(i);
            int len2=0;
            for(int j=0;j<str2.length();j++){
                if(str2.charAt(j)=='1'){
                    len2++;
                }
            }
            if(len==len2){
                answer=i;
                break;
            }
        }
        return answer;
    }
}