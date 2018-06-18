public class MuteQuack implements QuackBehavior {

    @Override
    public void perform() {
        System.out.println("This duck cannot quack.");
    }
}
