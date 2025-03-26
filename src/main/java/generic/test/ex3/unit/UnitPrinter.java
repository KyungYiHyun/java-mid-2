package generic.test.ex3.unit;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T> t1){
        T out = t1.out();
        System.out.println("이름: " + out.getName() + ",HP: " + out.getHp());
    }

    public static void printV2(Shuttle<?> t1){
        BioUnit out = t1.out();
        System.out.println("이름: " + out.getName() + ",HP: " + out.getHp());
    }
}
