import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;

    public Hand(){
        this.hand = new ArrayList<>();
    }

    public void add(Card card){
        hand.add(card);
    }

    public void print(){
        hand.forEach(System.out::println);
    }

    public ArrayList<Card> getHand(){
        return this.hand;
    }
    @Override
    public int compareTo(Hand comparedHand){
        int thisHandVal = this.getHand().stream().mapToInt(Card::getValue).reduce(0, Integer::sum);
        int comparedHandVal = comparedHand.getHand().stream().mapToInt(Card::getValue).reduce(0, Integer::sum);
        return thisHandVal - comparedHandVal;
    }
    public void sortBySuit(){
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
    public void sort(){
        Collections.sort(this.hand);
    }

}
