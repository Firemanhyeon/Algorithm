class Solution {
    public int solution(String s) {
        int answer = 0;
        String a = s;
        if(a.contains("zero")){
            a=a.replaceAll("zero", "0");
        }
        if(a.contains("one")){
            a=a.replaceAll("one", "1");
        }
        if(a.contains("two")){
            a=a.replaceAll("two", "2");
        }
        if(a.contains("three")){
            a=a.replaceAll("three", "3");
        }
        if(a.contains("four")){
            a=a.replaceAll("four", "4");
        }
        if(a.contains("five")){
            a=a.replaceAll("five", "5");
        }
        if(a.contains("six")){
            a=a.replaceAll("six", "6");
        }
        if(a.contains("seven")){
            a=a.replaceAll("seven", "7");
        }
        if(a.contains("eight")){
            a=a.replaceAll("eight", "8");
        }
        if(a.contains("nine")){
            a=a.replaceAll("nine", "9");
        }
        answer = Integer.parseInt(a);
        return answer;
    }
}