class Solution {
    public int solution(int n) {
        int answer = 0;
        //10진법을 3진법으로 바꾸기
        StringBuilder str = new StringBuilder();
        while(n>0){
            str.append(String.valueOf(n%3));
            n=n/3;
        }
        //알아서뒤집힘

        
        int count =0;
        //다시 10진법으로 바꾸기
        for(int i=str.length()-1;i>=0;i--){
            int num = Integer.parseInt(String.valueOf(str.charAt(count)));
            num = num*(int)Math.pow(3 , i);
            count++;
            answer+=num;
        }
        return answer;
    }
}