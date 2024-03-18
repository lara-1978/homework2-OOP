public interface QueueBehaviour {//он показывает поведение нашего актора в очереди

void takeInQueue(Actor actor); //он может встать в очередь
void takeOrders();  // сделать заказ
void giveOrders();// получмит заказ
void releaseFromQueue(); // покинуть очередь
}