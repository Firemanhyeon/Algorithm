class Solution {
    public int solution(int n) {
        int num2 =0;
        int num3=0;
        String str = Integer.toString(n);
        char[] arr =new char[str.length()];
        for(int i=0;i<arr.length;i++){
            char gks = str.charAt(i);
            arr[i]=gks;
            num2=Character.getNumericValue(gks);
            num3+=num2;
        }
        return num3;
    }
}