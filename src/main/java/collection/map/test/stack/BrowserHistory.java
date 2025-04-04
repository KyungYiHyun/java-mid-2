package collection.map.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    Deque<String> stack = new ArrayDeque<>();
    public void visitPage(String s) {
        System.out.println("방문: " + s);
        stack.push(s);
    }

    public String goBack() {
        stack.pop();
        System.out.println("뒤로가기: " + stack.peek());
        return stack.peek();
    }
}
