import java.util.Arrays;
public class Card2 {
    private String species;
    private String suit;
    public Card2() {
    }
    public Card2(String species, String suit) {
        this.species = species ;
        this.suit = suit;
    }
    protected String getSpecies(String species)//定义getFace()方法
    {
        return species;
    }
    protected String getSuit(String suit) //定义getSuit()方法
    {
        return suit;
    }
    public String toString(String species, String suit)//定义toString()方法
    {
        return species + suit;
    }
    public static void main(String[] args) {
        String[] a = { "J","Q", "K", "A", "10", "9", "8", "7", "6", "5", "4", "3", "2"}; //定义字符串数组牌面值和花色

        String[] b= {"黑桃", "红桃", "梅花", "方块"};
        Card2[][] array = new Card2[4][13]; //定义一个二维数组存储52个Card对象
        //52个Card对象,每种花色对应13张牌面值就是4*13=52张牌，一种花色和一种牌面值就对应组成一张牌
        for (int i = 0; i < b.length; i++) //花色
        {
            for (int j = 0; j < a.length; j++) //牌面值
            {
                array[i][j] = new Card2(b[i], a[j]);//每种花色s对应13张牌面值f就4*13=52张牌，一种花色和一种面值牌就对应组成一张牌
                System.out.println (array[i][j]); //每张牌是由花色和牌面值组成的，直接输出array[i][j]就是一张牌
            }
        }

    }

    public String toString() {

        return "poker [species=" + species + ", suit=" + suit + "]";
    }

}
