public class BaseballCardDemo {
    public static void main(String[] args) {
        BaseballCard card1 = new BaseballCard("Mickey Mantle", 1952);
        BaseballCard card2 = new BaseballCard("Mickey Mantle", 1952);
        BaseballCard card3 = new BaseballCard("Shohei Ohtani", 2018);

        System.out.println("Testing toString():");
        System.out.println("Card 1: " + card1.toString());
        System.out.println("Card 3: " + card3); 
        System.out.println();

        System.out.println("Testing equals():");
        System.out.println("Is Card 1 the same as Card 2? " + card1.equals(card2)); 
        System.out.println("Is Card 1 the same as Card 3? " + card1.equals(card3)); 
    }
}
