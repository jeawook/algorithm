package algorithm_baekjoon.ageSort;
import java.io.*;
import java.util.*;

class Member implements Comparable<Member>{
    int age;
    String name;

    Member(int age, String name){
        this.age=age;
        this.name=name;
    }

    @Override
    public int compareTo(Member o) {
        // TODO Auto-generated method stub
        if(this.age>o.age) return 1; //나이에 대해 오름차순
        else if(this.age<o.age)	return -1;
        else return 0;
    }
}

// 10814번 나이순 정렬
class Main{

    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb=new StringBuilder();
    static int N;
    static ArrayList<Member> list;

    public static void main(String args[]) throws Exception {
        N=Integer.parseInt(br.readLine());
        list=new ArrayList<>();
        for(int i=0;i<N;i++) {
            String s[]=br.readLine().split(" ");
            list.add(new Member(Integer.parseInt(s[0]), s[1]));
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++) {
            bw.write(list.get(i).age+" "+list.get(i).name+"\n");
        }
        bw.flush();
        bw.close();
    }

}