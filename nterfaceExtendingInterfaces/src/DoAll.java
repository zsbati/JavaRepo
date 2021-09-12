public class DoAll implements Feed {

    /** This works as multiple inheritance in C++, because
     * we can have non-abstract static methods on the interfaces.
     * The disadvantage is that they can't be @Overridden.
     * So in this respect, it is almost like C++. */


    @Override
    public void beg() {
        System.out.println("Please gimmie food & drinx!");
    }

    @Override
    public void drinkWine() {
        System.out.println("Lemmie have a WINE!");
    }

    @Override
    public void drinkWater() {
        System.out.println("Holy WATER, please!");
    }

    @Override
    public void drinkBrandy() {
        System.out.println("Brandy to the testicles of my soul!");
    }

    @Override
    public void eatFood() {
        System.out.println("What FOOD?");
    }

    @Override
    public void eatSnacks() {
        System.out.println("Snacks from outer space?");
    }

    public void action(){
        beg();
        drinkBrandy();
        eatFood();
        drinkWater();
        Drink.drinkBeer(); //static method with a body in the interface
        eatSnacks();
        drinkWine();
        Eat.eatSocks(); //static method with a body in the interface
    }

}
