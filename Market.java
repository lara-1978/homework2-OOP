import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {   // реализует 2 интерфейса
    
    private final List<Actor> queue = new ArrayList<>(); //список наших акторов
    

    @Override
    public void acceptToMarket(Actor actor) { //приняли актора который зашел в магаз
        System.out.println(actor.getName() + " зашёл в магазин"); // сообщает,что актор с каким то именем пришел
        takeInQueue(actor); //ставим актора в очередь.
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) { //в этом методе мы проходимся по списку
        for (Actor actor : actors) {
            System.out.println(actor.getName()+ "вышел из магазина"); //пишем,что такой то вышел из магаза
            queue.remove(actor); //удалять из нашего списка
        }
        
    }
    @Override
    public void update() {
        takeOrders();//сначала вызовется метод этот
        giveOrders();//потом этот
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) { //поставим актора в очередь
        System.out.println(actor.getName() + " встал в очередь");
        queue.add(actor); //добавляем в нашу очередь
    }

    
    @Override
    public void takeOrders() {
        for (Actor actor : queue) { //проходим по нашей очереди,перебираем акторов
            if(!actor.isMakeOrder()){ // если актор не сделал свой заказ
                actor.setMakeOrder(true);// мы говорим,что актор наш делает заказ
                System.out.println(actor.getName()+ "сделал заказ"); //и выводим это сообщение в чат
            }
            
        }
        
    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue) { //мы тут так же перебираем нашу очередь
            if (actor.isMakeOrder()) { //если уже сделал заказ
                actor.setTakeOrder(true); //то мы ему его отдаем
                System.out.println(actor.getName() + " получил заказ"); //выводим это в сообщении
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>(); //сождаем обязательно отдельный список
        for (Actor actor : queue) {  // проходимся опять понашей очереди и акторам
            if(actor.isTakeOrder()){ // если он забрал свой заказ
                releasedActors.add(actor); //то мы его добавляем в список
            
            System.out.println(actor.getName() + " вышел из очереди");
            }
        }
        releaseFromMarket(releasedActors); //  тут мы передаем наш ссписок тех кто вышел из очереди
    }


}
