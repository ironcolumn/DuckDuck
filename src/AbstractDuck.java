public abstract class AbstractDuck implements Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    public AbstractDuck ( FlyBehavior flyBehavior , QuackBehavior quackBehavior ) {

        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void fly ( ) {

        flyBehavior.perform ( );
    }

    @Override
    public void quack ( ) {

        quackBehavior.perform ( );
    }

    @Override
    public void display ( ) {

        System.out.println ( "I`m a/an " + this.getClass ( ).getSimpleName ( ) );
        System.out.print ( "Trying to fly:" );
        fly ( );
        System.out.print ( "Trying to quack:" );
        quack ( );
    }

    @Override
    public void swim ( ) {

        System.out.println ( "I`am swimming!" );
    }

    @Override
    public void setFlyBehavior ( FlyBehavior flyBehavior ) {

        this.flyBehavior = flyBehavior;
    }

    @Override
    public void setQuackBehavior ( QuackBehavior quackBehavior ) {

        this.quackBehavior = quackBehavior;
    }
}
