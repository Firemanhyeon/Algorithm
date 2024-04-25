class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String num ;
        for(int i=0;i<t.length()-p.length()+1;i++){
            num="";
            StringBuilder str =new StringBuilder();
            int count=i;
            for(int j=0;j<p.length();j++){

                str.append(t.charAt(count));
                count++;
            }
            num= new String(str);
            if(Long.parseLong(num) <= Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}