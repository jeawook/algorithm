package algorithm_progremers.kakao_2021.new_id;

class Solution {

    public static void main(String[] args) {

//        String new_id = "...!@BaT#*..y.abcdefghijklm";
        String new_id = "=.=";
//        String result = "bat.y.abcdefghi";
        String result = "aaa";
        String solution = solution(new_id);
        System.out.println(solution);
        System.out.println(result.equals(solution));

    }

    public static String solution(String new_id) {

        // 1단계 소문자로 치환
        new_id = new_id.toLowerCase();


        // 2단계 소문자와 -, . 만 남기고 제거
        String id = "";
        for (int i = 0; i < new_id.length(); i++) {
            char ch = new_id.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                id += ch;
            } else if( ch >= '0' && ch <= '9') {
                id += ch;
            }else if (ch == '_'){
                id += ch;
            } else if (ch == '-') {
                id += ch;
            } else if (ch == '.') {
                id += ch;
            }
        }

        // 3단계 마침표(.) 가 2번 이상 연속된 부분을 하나의 마침표로 치환
        for (int i = 0; i < id.length(); i++) {
            if (id.charAt(i) == '.') {
                String dot = ".";
                int j = i + 1;
                while (j != id.length() && id.charAt(j) == '.') {
                    dot += ".";
                    j++;
                }
                if (dot.length() > 1) {
                    id = id.replace(dot, ".");
                }
            }
        }


        // 4단계 마침표가(.) 처음이나 끝에 위치한다면 제거
        if (id.startsWith(".")) {
            id = id.substring(1, id.length());
        }
        if (id.endsWith(".")) {
            id = id.substring(0, id.length() - 1);
        }

        if (id.length() == 0) {
            id = "a";
        }

        if (id.length() >= 16) {
            id = id.substring(0, 15);
        }

        if (id.charAt(id.length() - 1) == '.') {
            id = id.substring(0, id.length() - 1);
        }
        char ch = id.charAt(id.length() - 1);
        if (id.length() == 1) {
            id = id + ch + ch;
        } else if (id.length() == 2) {
            id = id + ch;
        }
        return id;
    }
}
