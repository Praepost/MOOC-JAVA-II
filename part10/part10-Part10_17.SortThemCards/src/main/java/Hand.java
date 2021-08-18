import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;
    
    public Hand(){
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card){
        this.cards.add(card);
    }
    
    public void print(){
        this.cards.stream().forEach(card -> System.out.println(card));
    }
    
    public void sort(){
        Collections.sort(cards, (c1, c2) -> c1.compareTo(c2));
    }
    
    public void sortBySuit(){
        Collections.sort(cards, new BySuitInValueOrder());
    }
    
    public int sum(){
        return this.cards.stream().map(card -> card.getValue())
                .reduce(0, (subtotal, nextCard) -> subtotal+nextCard);
    }
    
    @Override
    public int compareTo(Hand hand) {
        if(this.sum() > hand.sum()){
            return 1;
        }
        if(this.sum() < hand.sum()){
            return -1;
        }
        return 0;
    }
}