package algorithm_baekjoon.movie_director;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//1436번 영화감독 숌
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int num = 666;
        int count = 1;

        while(count != N) {
            num++;
            if(String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);
    }
}
