import java.util.*;
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        //몬스터의 마지막 공격 인덱스 구하기
        int lastAttack = 0;
        for(int i=0;i<attacks.length;i++){
            if(lastAttack<attacks[i][0]){
                lastAttack = attacks[i][0];
            }
        }
        //마지막공격만큼 반복문
        int nowHealth = health;//현재체력
        int cnt=0;//연속성공횟수
        
        Map<Integer,Integer> map = new HashMap<>();//공격하는 인덱스와 데미지 맵자료구조
        for(int j=0;j<attacks.length;j++){
            map.put(attacks[j][0] , attacks[j][1]);
        }
        
        for(int i=0;i<=lastAttack;i++){
            if(map.containsKey(i)){ // 공격을 받은경우
                nowHealth -= map.get(i);
                cnt =0;
            }else{//공격을 받지않음
                 nowHealth += bandage[1]; // 일반 회복
                cnt++;
                if (cnt == bandage[0]) { // 연속 성공 횟수가 조건에 맞으면 추가 회복
                    cnt = 0;
                    nowHealth += bandage[2];
                }
            }
            
            if(nowHealth >= health){
                nowHealth = health;
            }
            if(nowHealth<=0){
                nowHealth=-1;
                break;
            }
        }
        System.out.println(nowHealth);
        if(nowHealth<=0){
            nowHealth=-1;
        }
        answer=nowHealth;
        return answer;
    }
}