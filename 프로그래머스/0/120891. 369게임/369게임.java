class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = String.valueOf(order);
        char[] ch = new char[str.length()];
        for(int i=0;i<ch.length;i++){
            ch[i]=str.charAt(i);
            if(ch[i]=='3' || ch[i]=='6'||ch[i]=='9'){
                answer++;
            }
        }
        
        return answer;
    }
}