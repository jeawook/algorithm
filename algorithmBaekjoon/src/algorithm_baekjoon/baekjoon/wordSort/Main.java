package algorithm_baekjoon.baekjoon.wordSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// 1181번 단어 정렬
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        int num = Integer.parseInt(br.readLine());
        for (int i =0;i<num;i++){
            list.add(br.readLine());
        }
        list = list.stream().distinct().collect(Collectors.toList());
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 단어 길이가 같을 경우
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                // 그 외의 경우
                else {
                    return o1.length() - o2.length();
                }
            }
        };

        Collections.sort(list, stringComparator);

        for (String tmp : list){
            sb.append(tmp+"\n");
        }
        System.out.println(sb.toString());


    }
}

