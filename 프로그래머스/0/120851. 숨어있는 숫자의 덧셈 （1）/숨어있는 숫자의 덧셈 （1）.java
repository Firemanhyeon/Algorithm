class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] str = my_string.toCharArray();
        for(int i=0;i<str.length;i++){
            if((int)str[i]<=57 && (int)str[i]>=48){
                answer+=(int)str[i]-'0';
            }
        }
        return answer;
    }
}