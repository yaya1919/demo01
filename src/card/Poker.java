package card;
import java.util.ArrayList;
import java.util.List;

    public class Poker {
        public List<String> Species = new ArrayList<>(); //花色共4种
        public List<String> Rank = new ArrayList<>(); //点数3.4.5····2共13种
        public List<Card> pokerList = new ArrayList<>(); //扑克中的扑克牌共52张，没有王牌

        public Poker() {
            Species.add("HEART");
           Species.add("SPADE");
            Species.add("DIAMOND");
           Species.add("CLUB");
            Rank.add("3");
            Rank.add("4");
            Rank.add("5");
            Rank.add("6");
            Rank.add("7");
            Rank.add("8");
            Rank.add("9");
            Rank.add("10");
            Rank.add("J");
            Rank.add("Q");
            Rank.add("K");
            Rank.add("A");
            Rank.add("2");

            for (int Species = 0; Species < 4; Species++) {
                for (int Rank = 0; Rank < 13; Rank++) {
                    Card mCard = new Card(this.Species.get(Species), this.Rank.get(Rank));
                    pokerList.add(mCard);
                }
            }
        }

        //打印扑克牌
      /*  public String toString() {
            for (int i = 0; i < this.pokerList.size(); i++) {
                System.out.print(this.pokerList.get(i).toString() + " ");
            }
            System.out.println("");*/

    }
