class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int maxX=0;
        int minX=Integer.MAX_VALUE;
        int maxY=0;
        int minY=Integer.MAX_VALUE;
        for(int i=0;i<wallpaper.length;i++){
            for(int j=0;j<wallpaper[i].length();j++){
                if(wallpaper[i].charAt(j)=='#'){
                    maxX=Math.max(j,maxX);
                    minX=Math.min(j,minX);
                    maxY=Math.max(i,maxY);
                    minY=Math.min(i,minY);
                }
            }
        }
        maxX+=1;
        maxY+=1;
        answer[0]=minY;
        answer[1]=minX;
        answer[2]=maxY;
        answer[3]=maxX;
        return answer;
    }
}