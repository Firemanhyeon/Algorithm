class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int minIndex=0;
        int min=Math.abs(array[0]-n);
        for(int i=1;i<array.length;i++){

            if(array[i]-n<0 && min>Math.abs(array[i]-n)){
                min=Math.abs(array[i]-n);
                minIndex=i;
            }else if(array[i]-n>0 && min>Math.abs(array[i]-n)){
                min = array[i]-n;
                minIndex=i;
            }else if(array[i]-n==0 ){
                minIndex=i;
                break;
            }else if(min==Math.abs(array[i]-n)){
                if(array[minIndex]<array[i]){
                    continue;
                }else{
                    minIndex=i;
                }
            }
        }
        answer=array[minIndex];
        return answer;
    }
}