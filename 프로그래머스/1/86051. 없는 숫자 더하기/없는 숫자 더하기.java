import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int count=0;
        int sum=0;
        boolean chk;
        for(int i=0;i<10;i++){
            chk = true;
            for(int j=0;j<numbers.length;j++){
                if(i==numbers[j]){
                    chk=false;
                }
            }
            if(chk){
                sum+=i;
            }
        }
        return sum;
    }
}