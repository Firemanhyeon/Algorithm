class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int cnt = Integer.parseInt(arr[i]);
            max = Math.max(max , cnt);
            min = Math.min(min , cnt);
        }
        answer = min+" "+max;
        
        return answer;
    }
}