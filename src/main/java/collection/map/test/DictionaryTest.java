package collection.map.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("==단어 입력 단계==");
        while (true) {

            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String s1 = br.readLine();
            if (s1.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            String s2 = br.readLine();
            map.put(s1, s2);
        }
        System.out.println("==단어 검색 단계==");
        while (true) {

            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String f1 = br.readLine();
            if (f1.equals("q")) {
                break;
            }
            String a1 = map.get(f1);
            if (a1 == null) {
                System.out.println(a1 + "는 사전에 없는 단어입니다.");
                continue;
            }
            System.out.println(f1 + "의 뜻: " + a1);

        }
    }
}
