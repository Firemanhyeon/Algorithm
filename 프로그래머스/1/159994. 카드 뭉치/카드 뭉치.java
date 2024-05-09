class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        //1번카드 인덱스
        int cards1Idx=0;
        //2번카드인덱스
        int cards2Idx=0;
        //있는지없는지 체크
        boolean chk = false;
        
        for(int i=0;i<goal.length;i++){
            //1번카드 i번 인덱스가 goal i번 인덱스에 있는지 체크
            if(goal[i].equals(cards1[cards1Idx])){
                //있다면 true
                chk=true;
                //중복제거
                cards1[cards1Idx] = "";
                //인덱스++
                if(cards1.length>cards1Idx+1){
                    cards1Idx++;    
                }
                //없다면 2번카드 i번 인덱스가 goal i번 인덱스에 있는지 체크
            }else if(goal[i].equals(cards2[cards2Idx])){
                //있다면 true
                chk=true;
                //중복제거
                cards2[cards2Idx] = "";
                //인덱스 ++ 
                if(cards2.length>cards2Idx+1){
                    System.out.println(123);
                    cards2Idx++;    
                }
                //없다면 check = false
            }else{
                chk=false;
                break;
            }
        }
        if(chk){
            answer = "Yes";
        }else{
            answer="No";
        }
        return answer;
    }
}