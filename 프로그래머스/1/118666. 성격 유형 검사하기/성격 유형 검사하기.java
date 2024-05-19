import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<Character,Integer> map = new HashMap<>();
        char[] ch = {'R','T','C','F','J','M','A','N'};
        for(int i=0;i<ch.length;i++){
            map.put(ch[i],0);
        }
        
        for(int i=0;i<survey.length;i++){
            char first = survey[i].charAt(0);
            char second = survey[i].charAt(1);
            
            int score = getScore(i,choices);
            if(choices[i]>4){//4보다 클때 first가 +되어야함
                map.put(second,map.get(second)+score);
            }else if(choices[i]<4){//4보다 작을때 second가 +되어야함
                map.put(first,map.get(first)+score);
            }else{//4일경우 아무도점수안받음
                
            }
        }
        answer+= String.valueOf(getWin('R','T',map));
        answer+= String.valueOf(getWin('C','F',map));
        answer+= String.valueOf(getWin('J','M',map));
        answer+= String.valueOf(getWin('A','N',map));
        return answer;
    }
    
    public static int getScore(int i , int[] choices){
        if(choices[i]==1){
            return 3;
        }else if(choices[i]==2){
            return 2;
        }else if(choices[i]==3){
            return 1;
        }else if(choices[i]==4){
            return 0;
        }else if(choices[i]==5){
            return 1;
        }else if(choices[i]==6){
            return 2;
        }else if(choices[i]==7){
            return 3;
        }else{
            return 0;
        }
    }
    public static char getWin(char firstChar , char secondChar , Map<Character,Integer> map){
        int firstScore = map.get(firstChar);
        int secondScore = map.get(secondChar);
        if(firstScore > secondScore){
            return firstChar;
        }else if(firstScore<secondScore){
            return secondChar;
        }else{
            return firstChar;
        }
    }
}