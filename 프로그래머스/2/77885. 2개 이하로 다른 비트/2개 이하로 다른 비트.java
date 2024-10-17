class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                answer[i]=numbers[i]+1;
                continue;
            }else{
                String binary = Long.toBinaryString(numbers[i]);
                binary = adjustBinary(binary);
                answer[i] = Long.parseLong(binary,2);
            }
            
        }   
        return answer;
    }
    public String adjustBinary(String binary){
        int idx = binary.lastIndexOf('0');
        if(idx==-1){
            return "10"+binary.substring(1);
        }else{
            StringBuilder sb = new StringBuilder(binary);
            sb.setCharAt(idx , '1');
            sb.setCharAt(idx+1,'0');
            return sb.toString();
        }
    }
}