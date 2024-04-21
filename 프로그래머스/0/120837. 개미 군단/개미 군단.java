class Solution {
    public int solution(int hp) {
        int answer = 0;
        int jang = 5;
        int byeong=3;
        int ill=1;
        int cnt=0;
        
        cnt+=hp/jang;
        hp=hp%jang;
        cnt+=hp/byeong;
        hp=hp%byeong;
        while(hp!=0){
            cnt++;
            hp--;
        }
        return cnt;
    }
}