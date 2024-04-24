class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder str = new StringBuilder();
        StringBuilder str1 = new StringBuilder();
        for(int i=1;i<food.length;i++){
            int a = food[i]/2;
            if(food[i]/2 >=1){
                for(int j=0;j<a;j++){
                    str.append(i);
                }
                
            }
        }
        answer+=str;
        str.reverse();
        
        answer+="0";
        answer+=str;
        //str.append(str1);
        System.out.println(str1);
        return answer;
    }
}