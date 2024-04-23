class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        boolean chk=true;
        if(s.length()==4 || s.length()==6){
            for(int i=0;i<s.length();i++){
                if(!Character.isDigit(s.charAt(i))){
                    chk=false;
                    break;
                }
            }
            if(chk){
                answer=true;
            }
        }
        return answer;
    }
}