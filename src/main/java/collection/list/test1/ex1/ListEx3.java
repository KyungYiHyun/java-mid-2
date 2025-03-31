package collection.list.test1.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListEx3 {
    public static void main(String[] args) throws IOException {
        System.out.println("n개의 정수를 입력하세용 (종료 0)");
        List<Integer> list = new ArrayList<>();
        int total = 0;
        while (true){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int i = Integer.parseInt(br.readLine());
            if (i == 0){
                for (int j = 0; j < list.size(); j++) {
                    total += list.get(j);
                }
                break;
            }
            list.add(i);
        }
        System.out.println("합계: " + total);
        System.out.println("평균: " + (double) total / list.size());
    }
}
