class Solution {
    public String solution(String new_id) {
        String answer = "";
        //1단계
        String levelOne = new_id.toLowerCase();
        //2단계
        //정규표현식
        levelOne = levelOne.replaceAll("[^a-z0-9-_.]", "");
        System.out.println(levelOne);
        //3단계
        levelOne=  levelOne.replaceAll("\\.{2,}", ".");
        //4단계
        levelOne= levelOne.replaceAll("^\\.|\\.$", "");
        System.out.println(levelOne);
        //5단계
        if (levelOne.isEmpty()) {
            levelOne = "a";
        }
        //6단계
        if(levelOne.length()>=16){
            levelOne = levelOne.substring(0,15);
            if(levelOne.charAt(levelOne.length()-1)=='.'){
                levelOne = levelOne.replaceAll("^\\.|\\.$", "");
            }
        }
        //7단계
            while(levelOne.length()<=2){
                levelOne+=levelOne.charAt(levelOne.length()-1);
            }
        return levelOne;
    }
}