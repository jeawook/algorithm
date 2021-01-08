package algorithm_baekjoon.baekjoon.locationSort2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 11651 좌표 정렬하기2
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Location> list = new ArrayList<>();
        List<Location> list1 = new LinkedList<>();
        int num = Integer.parseInt(br.readLine());

        for (int i=0;i<num;i++){
            int[] location = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            list.add(new Location(location[0], location[1] ));
        }

        Comparator<Location> locationComparator = new Comparator<Location>() {
            @Override
            public int compare(Location o1, Location o2) {
                if (o1.y > o2.y){
                    return 1;
                }else if (o1.y == o2.y){
                    if (o1.x > o2.x){
                        return 1;
                    }
                }
                return -1;
            }
        };
        Collections.sort(list,locationComparator);
        while (!list.isEmpty()){
            Location location = list.remove(0);
            sb.append(location.x+" "+ location.y+"\n");
        }
        System.out.println(sb.toString());
    }


}
class Location{
    int x;
    int y;
    public Location(int x, int y){
        this.x = x;
        this.y = y;
    }
}