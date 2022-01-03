package minji.완전탐색;

import java.util.*;
import java.util.Scanner;

public class N과M7 {
    public static int N;
    public static int M;
    public static boolean[] visit;
    public static int[] map;
    public static StringBuilder sb;

    public static void sol(int start, int count, String temp) {
        if (count == M) {
            sb.append(temp).append("\n");
            // System.out.println(temp);
            return;
        }
        for (int i = 0; i < N; i++) {
            sol(i, count + 1, temp + " " + Integer.toString(map[i]));

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        visit = new boolean[10001];
        map = new int[N];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            map[i] = x;
        }
        Arrays.sort(map);

        sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sol(i, 1, Integer.toString(map[i]));

        }
        System.out.println(sb.toString());
    }
}