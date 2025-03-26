package generic.test.ex3.unit;

public class Shuttle<T extends BioUnit> {

    private T t1;
    public void in(T t1){
        this.t1 = t1;
    }
    public T out(){
        return t1;
    }



    public void showInfo(){
        System.out.println("이름: " + t1.getName() + ",HP: " + t1.getHp());
    }

}
