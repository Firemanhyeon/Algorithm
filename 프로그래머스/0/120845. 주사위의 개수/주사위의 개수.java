class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int width = box[0];
        int high = box[1];
        int height = box[2];
        width = box[0]/n;
        high = box[1]/n;
        height = box[2]/n;
        
        answer = width * high * height;
        return answer;
    }
}