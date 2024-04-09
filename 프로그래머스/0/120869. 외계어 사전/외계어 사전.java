class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        boolean chk=true;
        for(int i=0;i<dic.length;i++){
            chk=true;
            for(int j=0;j<spell.length;j++){
                if(!dic[i].contains(spell[j])){
                    chk=false;
                    break;
                }
            }
            if(chk){
                answer=1;
                break;
            }else{
                answer=2;
            }
        }

        return answer;
    }
}