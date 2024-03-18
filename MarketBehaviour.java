import java.util.List;

public interface MarketBehaviour {

void acceptToMarket(Actor actor);  //тут он принимает нашего актора и добовляет его в магазин и потом он ещё давится и в очередь
void releaseFromMarket(List<Actor> actors); //метод принимает список наших акторс, проходит по нашему списку и выгоняет потом из магазина
void update(); //метод обновляет инфу
}