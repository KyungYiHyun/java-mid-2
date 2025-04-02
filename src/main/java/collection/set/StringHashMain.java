package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // char
        char charA = 'A';
        char chatB = 'B';
        System.out.println("charA = " + (int) charA);
        System.out.println("chatB = " + (int) chatB);

        // hashCode
        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('B') = " + hashCode("B"));
        System.out.println("hashCode('C') = " + hashCode("AB"));

        //hashIndex
        System.out.println("hashIndex(hashCode(\"A\")) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(hashCode(\"B\")) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(hashCode(\"AB\")) = " + hashIndex(hashCode("AB")));
    }

    static int hashCode(String str){
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += (int) c;
        }
        return sum;
    }

    static int hashIndex(int value){
        return value % CAPACITY;
    }
}
