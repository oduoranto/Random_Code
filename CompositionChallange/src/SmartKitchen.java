public class SmartKitchen extends Kitchen {
    private CoffeMaker brewmaster;
    private DishWasher dishWasher;
    private Refrigirator iceBox;

    public SmartKitchen(String kitchen, CoffeMaker brewmaster, DishWasher dishWasher, Refrigirator iceBox) {
        super(kitchen);
        this.brewmaster = brewmaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public CoffeMaker getBrewmaster() {
        return brewmaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigirator getIceBox() {
        return iceBox;
    }

    public String addWater() {
        return ">>Adding water to dishes... ";
    }

    public String pourMilk() {
        return "Pouring.. " ;
    }

    public String loadDishWasher() {

return " ";
    }
    public void setKitchenStuff(Refrigirator refrigirator,DishWasher dishWasher,CoffeMaker coffeMaker){

    }
    public String doKitchenWork (){
        return getDishWasher().doDishes() + " "+
         getBrewmaster().brewCoffee() + " "
                + getIceBox().orderFood();

    }
}