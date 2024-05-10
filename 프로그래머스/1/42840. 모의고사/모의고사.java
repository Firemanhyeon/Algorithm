import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] array3 = {3,3,1,1,2,2,4,4,5,5};
        int answer1=0;
        int answer2=0;
        int answer3=0;
        for(int i =0; i<answers.length; i++){
            if(array1[i%array1.length] == answers[i]) answer1++;
            if(array2[i%array2.length] == answers[i]) answer2++;
            if(array3[i%array3.length] == answers[i]) answer3++;
        }
        int max = Math.max(Math.max(answer1 , answer2) , answer3);
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        
        List<Integer> list = new ArrayList<>();
        if(max==answer1){
            list.add(1);
        }
        if(max==answer2){
            list.add(2);
        }
        if(max==answer3){
            list.add(3);
        }
        answer= new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]= list.get(i);
        }
        

        
        return answer;
        
    }
}