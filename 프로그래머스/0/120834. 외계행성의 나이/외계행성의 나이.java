class Solution {
    public String solution(int age) {
        String answer = "";
        
        String str = String.valueOf(age);
        int[] arr = new int[str.length()];
        for(int i=0;i<arr.length;i++){
            char ch = str.charAt(i);
            
            arr[i]= Character.getNumericValue(ch);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                answer+="a";
            }else if(arr[i]==1){
                answer+="b";
            }else if(arr[i]==2){
                answer+="c";
            }else if(arr[i]==3){
                answer+="d";
            }else if(arr[i]==4){
                answer+="e";
            }else if(arr[i]==5){
                answer+="f";
            }else if(arr[i]==6){
                answer+="g";
            }else if(arr[i]==7){
                answer+="h";
            }else if(arr[i]==8){
                answer+="i";
            }else if(arr[i]==9){
                answer+="j";
            }
        }
        
        return answer;
    }
}