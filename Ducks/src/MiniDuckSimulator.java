public class MiniDuckSimulator {

    public static void main(String[] args) {

        System.out.println("calling a mallard duck");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("calling a model duck");
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }

}
