class Solution {
    static void swap(char[] ch ,int a , int b){
        char temp = ch[a];
        ch[a]= ch[b];
        ch[b]=temp;
    }
    public  int solution(String A, String B) {
        int answer = 0;
        int count=0;
        char[] ch = A.toCharArray();
        char[] ch1 = B.toCharArray();
        boolean chk ;
        for(int j=0;j<A.length();j++){
            chk = true;
            for(int i=0;i<ch.length;i++){
                if(ch[i]!=ch1[i]){
                    chk=false;
                    break;
                }
            }
            if(!chk){
                count++;
                for(int k=ch.length-1;k>0;k--){
                    swap(ch,k,k-1);
                }
            }else if(chk){
                return count;
            }
            if(!chk && j==A.length()-1){
                answer=-1;
            }
        }

        return answer;
    }
}