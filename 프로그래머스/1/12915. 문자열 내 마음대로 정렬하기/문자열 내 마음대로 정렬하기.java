import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
       String[] answer = new String[strings.length];
        Arrays.sort(strings);
        List<String> list = new ArrayList<>();
        char[] ch = new char[strings.length];
        for(int i=0;i<ch.length;i++){
            ch[i]=strings[i].charAt(n);
        }
        Arrays.sort(ch);
        for(int i=0;i<strings.length;i++) {
            for (int j = 0; j < strings.length; j++) {
                if (strings[j].charAt(n) == ch[i]) {
                    if (!list.contains(strings[j])) {
                        list.add(strings[j]);
                        break;
                    }
                }
            }
        }
        for(int i=0;i<ch.length;i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}