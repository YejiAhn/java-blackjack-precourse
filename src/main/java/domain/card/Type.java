package domain.card;

public enum Type {
    SPADE("스페이드"),
    DIAMOND("다이아몬드"),
    HEART("하트"),
    CLUB("클럽");

    private String korean;
    Type(String korean) {this.korean=korean;}
    public String getKorean() {return this.korean;}


}
