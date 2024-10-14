import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        String[][] parseFile = new String[files.length][3];

        // 파일을 HEAD, NUMBER, TAIL로 분리
        for (int i = 0; i < files.length; i++) {
            String[] result = parse(files[i]);
            parseFile[i][0] = result[0];  // HEAD
            parseFile[i][1] = result[1];  // NUMBER
            parseFile[i][2] = result[2];  // TAIL
        }

        // 정렬 수행
        Arrays.sort(parseFile, (file1, file2) -> {
            String head1 = file1[0].toLowerCase();
            String head2 = file2[0].toLowerCase();

            // 1. HEAD 비교 (대소문자 무시)
            int headCompare = head1.compareTo(head2);
            if (headCompare != 0) {
                return headCompare;
            }

            // 2. NUMBER 비교 (숫자로 비교)
            int num1 = Integer.parseInt(file1[1]);
            int num2 = Integer.parseInt(file2[1]);
            return Integer.compare(num1, num2);
        });

        // 정렬된 파일명을 answer에 저장
        String[] answer = new String[files.length];
        for (int i = 0; i < parseFile.length; i++) {
            answer[i] = parseFile[i][0] + parseFile[i][1] + parseFile[i][2];
        }

        return answer;
    }

    // 파일명을 HEAD, NUMBER, TAIL로 나누는 함수
    public String[] parse(String file) {
        String head = "";
        String number = "";
        String tail = "";
        int i = 0;

        // HEAD 추출
        while (i < file.length() && !Character.isDigit(file.charAt(i))) {
            head += file.charAt(i);
            i++;
        }

        // NUMBER 추출 (최대 5자리)
        while (i < file.length() && Character.isDigit(file.charAt(i)) && number.length() < 5) {
            number += file.charAt(i);
            i++;
        }

        // TAIL 추출 (남은 부분, 없으면 빈 문자열)
        if (i < file.length()) {
            tail = file.substring(i);
        }

        return new String[]{head, number, tail};
    }
}
