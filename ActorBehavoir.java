public interface ActorBehavoir{ //описывает интерфейс для всех участников очреди

    void setMakeOrder (boolean isMakeOrder);
    void setTakeOrder (boolean isTakeOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
}