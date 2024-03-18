abstract class Actor implements ActorBehavoir { //актор населдуется от акторбехавор
    protected String name;  //наши поля 
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name){
        this.name=name;
        isMakeOrder = false;
        isTakeOrder = false;

    }

    public abstract String getName(); //тут реализовывать ничего не будем в этом классе

    
//тут методы никакие реализовывать не будем

}

