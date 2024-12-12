class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int idx = arr1[0].length > arr2[0].length ? arr1.length : arr2.length ; 
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        
        for(int i=0;i<arr1.length;i++){ //arr1의 열만큼 반복
            for(int j=0;j<arr2[0].length;j++){//arr2의 열만큼 반복
                int temp = 0;
                for(int k=0;k<arr1[0].length;k++){//arr2의 열만큼 반복
                    temp+=arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = temp;
            }
        }
        return answer;
    }
}