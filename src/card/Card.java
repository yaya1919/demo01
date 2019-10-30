package card;
public class Card {

    private final String Species;
    private final String Rank;
    public String species;// 花色
    public String rank;// 点数

    public Card(String Species, String Rank) {
        super();
        this.Species = Species;
        this.Rank = Rank;
    }
    public String toString(String species, String rank)//定义toString()方法
    {

        return Species + Rank;
    }


    public void printcard() {
    }
}



