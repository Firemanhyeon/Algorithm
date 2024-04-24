class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder str = new StringBuilder();
        for(int i=1;i<food.length;i++){
            int a = food[i]/2;

                for(int j=0;j<a;j++){
                    str.append(i);
                }
                
            
        }
        answer+=str;
        answer+="0";
        str.reverse();
        answer+=str;
        return answer;
    }
}