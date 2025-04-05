package collection.compare.test;

public enum Emblem {
    SPADE("♠"), // 스페이드(♠)
    HEART("♥"),// 하트(♥)
    DIAMOND("♦"),// 다이아몬드(♦)
    CLUB("♣");

    private String emblem;

    Emblem(String emblem) {
        this.emblem = emblem;
    }

    public String getEmblem() {
        return emblem;
    }


    @Override
    public String toString() {
        return "(" + emblem + ")";
    }
}
