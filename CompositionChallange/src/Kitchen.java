public class Kitchen {
  private String kitchen;

    public Kitchen(String kitchen) {
        this.kitchen = kitchen;
    }
}
class Refrigirator extends Kitchen {
    private boolean hasWorkToDo;

    public Refrigirator(String kitchen) {
        super(kitchen);
    }

    public Refrigirator(String Kitchen, boolean hasWorkToDo) {
        super(Kitchen);
        this.hasWorkToDo = hasWorkToDo;
    }

    public String orderFood() {
        if (hasWorkToDo == true) {
            return ">>Ordering food wait..";

        } else {
            return ">>Failed to order..";
        }
    }
}

    class DishWasher extends Kitchen {
        private boolean hasWorkToDo;

        public DishWasher(String kitchen) {
            super(kitchen);
        }

        public DishWasher(String kitchen, boolean hasWorkToDo) {
            super(kitchen);
            this.hasWorkToDo = hasWorkToDo;
        }

        public String doDishes() {
            if (hasWorkToDo == true) {
                return ">>Dish washing..";
            }
            return ">>Failed to dish wash..";
        }
    }


    class CoffeMaker extends Kitchen {
        private boolean hasWorkToDo;

        public CoffeMaker(String kitchen) {
            super(kitchen);
        }

        public CoffeMaker(String kitchen, boolean hasWorkToDo) {
            super(kitchen);
            this.hasWorkToDo = hasWorkToDo;
        }

        public String brewCoffee() {
            if (hasWorkToDo == true) {
                return ">>Loading..";
            }
            return ">>Failed to load..";
        }
    }

