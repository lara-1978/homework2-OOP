public class Human extends Actor  { //наследуется от класса актор а актор-наследник  ctorBehavoir

    public Human(String name){
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    
    

    @Override
    public void setMakeOrder(boolean isMakeOrder) {
        super.isMakeOrder = isMakeOrder;
        
    }

    @Override
    public void setTakeOrder(boolean isTakeOrder) {
        super.isTakeOrder = isTakeOrder;
        
    }

    @Override
    public boolean isMakeOrder() {
        
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        
        return isTakeOrder;
    }



}
