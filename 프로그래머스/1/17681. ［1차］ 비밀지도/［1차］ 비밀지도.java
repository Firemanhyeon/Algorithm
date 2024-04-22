class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
       String[] array = new String[n];
        String[] strArr = new String[arr1.length];
        String[] strArr2 = new String[arr2.length];
        String result="";
        for(int i=0;i<arr1.length;i++){
            StringBuilder str = new StringBuilder(Integer.toBinaryString(arr1[i]));
            if(str.length()<n){
                while(str.length()<n){
                    str.insert(0,"0");
                }
            }
            strArr[i] = new String(str);
        }
        for(int i=0;i<arr2.length;i++){
            StringBuilder str = new StringBuilder(Integer.toBinaryString(arr2[i]));
            if(str.length()<n){
                while(str.length()<n){
                    str.insert(0,"0");
                }
            }
            strArr2[i] = new String(str);
        }


        for(int i=0;i<array.length;i++){
            array[i]="";
            for(int j=0;j<strArr.length;j++){
                if(Integer.parseInt(String.valueOf(strArr[i].charAt(j)))==1 || Integer.parseInt(String.valueOf(strArr2[i].charAt(j)))==1){
                    array[i] += "#";
                }else{
                    array[i] += " ";
                }
            }
        }
        return array;
    }
}