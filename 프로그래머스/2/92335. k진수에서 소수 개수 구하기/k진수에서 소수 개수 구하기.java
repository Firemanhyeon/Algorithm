class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        //10진수 n을 k진수로 바꾸기
        String num = Integer.toString(n,k);
        String[] strs = num.split("0+");
        for (String part : strs) {
            if (!part.isEmpty()) {  // 빈 문자열이 아닌 경우만 처리
                Long result = Long.parseLong(part);
                if (chkNum(result)) {  // 소수인지 체크
                    answer++;
                }
            }
        }
        return answer;
    }
    
    public static boolean chkNum(Long result){
        if(result < 2) return false;
        if(result == 2 || result == 3) return true;
        if(result % 2 == 0) return false; 

        for(int i = 3; i <= Math.sqrt(result); i += 2){ 
            if(result % i == 0) return false;
        }
        return true;
    }
}