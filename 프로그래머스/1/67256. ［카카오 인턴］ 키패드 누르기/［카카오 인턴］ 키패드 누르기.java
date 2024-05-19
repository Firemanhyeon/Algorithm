class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int lefthand = 10;
        int righthand=12;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0){
                numbers[i]=11;
            }
            if(numbers[i]%3==1 ){//왼쪽만 쓸때
                answer+="L";
                lefthand=numbers[i];
            }else if(numbers[i]%3==0){//오른쪽만 쓸때
                //현재오른쪽손가락위치변경
                answer+="R";
                righthand=numbers[i];
            }else{//가운데
                int aRow = (lefthand-1)/3;
                int aCol = (lefthand-1)%3;
                
                int bRow = (numbers[i]-1)/3;
                int bCol = (numbers[i]-1)%3;
                
                int cRow = (righthand-1)/3;
                int cCol = (righthand-1)%3;
                
                
                int leftDistance =Math.abs(aRow-bRow) + Math.abs(aCol-bCol);
                int rightDistance =Math.abs(cRow-bRow) + Math.abs(cCol-bCol);
                if(leftDistance > rightDistance){
                    answer+="R";
                    righthand = numbers[i];
                }else if(leftDistance < rightDistance){
                    answer+="L";
                    lefthand= numbers[i];
                }else{
                    if(hand.equals("right")){
                        answer+="R";
                        righthand=numbers[i];
                    }else{
                        answer+="L";
                        lefthand= numbers[i];
                    }
                }
            }
        }
        return answer;
    }
}