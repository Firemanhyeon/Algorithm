class Solution {
    public int solution(int[] array) {
        int answer = 0;
        StringBuilder str = new StringBuilder();
        for(int i=0;i<array.length;i++){
            str.append(String.valueOf(array[i]));
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='7'){
                answer++;
            }
        }
        return answer;
    }
}