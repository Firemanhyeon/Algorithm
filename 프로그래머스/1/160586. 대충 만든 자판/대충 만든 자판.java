class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int min=0;
        int[] answer = new int[targets.length];
        for(int i=0;i<targets.length;i++){//targets 만큼
            for(int j=0;j<targets[i].length();j++){//targets[i]의 스펠링만큼
                min=101;
                for(int k=0;k<keymap.length;k++){//keymap배열의 개수만큼
                    if(keymap[k].indexOf(targets[i].charAt(j))+1<min && keymap[k].indexOf(targets[i].charAt(j))!=-1){
                        min=keymap[k].indexOf(targets[i].charAt(j))+1;
                    }
                }
                if(min==101){
                    answer[i]=-1;

                    break;
                }
                answer[i]+=min;
            }

        }
        return answer;
    }
}