package algorithm_baekjoon.baekjoon.multitap_scheduling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//1700번 멀티탭 스케줄링
public class Main {
    static int N;
    static int K;
    static List<Integer> list;
    static int[] plugs;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        plugs = new int[K];
        list = new ArrayList<>();
        int ans = 0;
        st = new StringTokenizer(br.readLine());
        for (int i=0;i<K;i++) {
            plugs[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=0;i<K;i++) {
            if (list.size() < N && !list.contains(plugs[i])) {
                list.add(plugs[i]);
            }else if (!list.contains(plugs[i])) {
                list.remove(last(i));
                list.add(plugs[i]);
                ans++;
            }

        }
        System.out.println(ans);
    }
    static int last(int n) {
        int location = 0;
        int index = 0;
        for (int i=0;i<list.size();i++) {
            int tmp = list.get(i);
            boolean flag = true;
            for (int j=n+1;j<K;j++) {
                if (tmp == plugs[j]) {
                    flag  = false;
                    if (location < j){
                        index = i;
                        location = j;
                    }
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return index;
    }

/*2 7
2 3 2 3 1 2 7
: 2
2 13
2 3 1 3 1 3 1 3 2 2 2 2 2
: 2
2 15
3 2 1 2 1 2 1 2 1 3 3 3 3 3 3
: 2
3 8
1 2 3 4 1 1 1 2
: 1
1 3
1 2 1
: 2
3 6
1 2 3 4 1 2
: 1
6 7
1 1 1 1 1 1 2
: 0
2 10
1 2 3 2 3 2 2 2 1 2
: 2
5 20
1 2 3 4 1 1 1 3 3 2 5 7 20 1 3 4 2 1 9 19
: 4
3 20
1 2 3 4 4 3 5 8 9 19 20 1 2 3 20 4 1 2 3 4
: 10
3 10
2 3 1 4 2 3 2 4 1 4
: 2*/
}
