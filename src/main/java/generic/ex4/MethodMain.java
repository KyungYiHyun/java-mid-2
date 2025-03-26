package generic.ex4;

public class MethodMain {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        System.out.println("result = " + result);

        Integer integerValue = GenericMethod.<Integer>numberMethod(i);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        System.out.println("타입 추론");
        Integer integerValue2 = GenericMethod.numberMethod(i);
        Double doubleValue2 = GenericMethod.numberMethod(20.0);

    }
}
