import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];//순서를 담기 위한 새로운배열생성
        //내림차순정렬
        Integer[] numlist1 = new Integer[numlist.length];
        int[] numlist2 = new int[numlist.length];
        for(int i=0;i<numlist.length;i++){
            numlist1[i] = numlist[i];
        }
        Arrays.sort(numlist1,Comparator.reverseOrder());//내림차순 정렬

        int count=0;
        int min = 0;
        for(int i=0; i<10000;i++){
            for(int j=0;j<numlist1.length;j++){
                if(Math.abs(numlist1[j]-n) ==min){
                    answer[count]= j;
                    count++;
                }
            }
            min++;

        }
         for(int i=0;i<numlist1.length;i++){
             int index = answer[i];
             numlist2[i]=numlist1[index];
         }
        return numlist2;
    }
}