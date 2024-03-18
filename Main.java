public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Stive");
        Human human2 = new Human("Mark");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
    }
}
// тут добавили наших людей про помощи market.acceptToMarket