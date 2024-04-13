import java.util.*;
class Solution {
    public String solution(String polynomial) {
       String answer = "";

        int onlyNumber=0;

        String[] part = polynomial.split(" ");


        int count=0;
        boolean chk = false;
        for(int i=0;i<part.length;i++){
            //x의 개수 구하기
            if(part[i].contains("x")){//x인 경우
                chk=false;
                String val = "";
                if((int)part[i].charAt(0)>=48 && (int)part[i].charAt(0)<=57 ){//숫자체크
                    if(part[i].length()>2){//두자리수이상의 숫자
                        val+=part[i].charAt(0);//String 변수에 넣어서 int형으로변환후 넣기
                        val+=part[i].charAt(1);
                        count+=Integer.parseInt(val);
                        chk=true;
                    }else{//한자리수
                    count+=Integer.parseInt(String.valueOf(part[i].charAt(0)));//바로넣기
                    chk=true;
                    }
                }

                if(!chk){//x인경우 1x 방지
                    count++;
                }
            }else{//숫자 찾기
                String val = "";
                if((int)part[i].charAt(0)>=48 && (int)part[i].charAt(0)<=57){
                    if(part[i].length()>=2){
                        val+=part[i].charAt(0);
                        val+=part[i].charAt(1);
                        onlyNumber+=Integer.parseInt(val);
                    }else{
                        onlyNumber+=Integer.parseInt(String.valueOf(part[i].charAt(0)));
                    }
                }
            }

        }
        if(onlyNumber!=0 && count!=0){//숫자 x 둘다 있는경우
            if(count==1){//1x 생략하기
                answer = "x + "+onlyNumber;
            }else{
                answer = count+"x + "+onlyNumber;
            }

        }else if(onlyNumber==0 && count!=0){//x만 있는경우
            if(count==1){//1x 생략하기
                answer = "x";
            }else{
                answer = count+"x";
            }
        }else if(onlyNumber!=0 && count==0){// 숫자만 있는경우
            answer= String.valueOf(onlyNumber);
        }

        return answer;
    }
}
