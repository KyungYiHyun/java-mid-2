package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.setValue(10);
        Integer integer = (Integer) integerBox.getValue();
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.setValue("hello");
        String object = (String) stringBox.getValue();
        System.out.println("object = " + object);

        // 잘못된 타입 인수 전달
        integerBox.setValue("문자 100");
        Integer object1 = (Integer) integerBox.getValue();
    }
}
