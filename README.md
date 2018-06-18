# 策略模式
## UML类图
![image](UMLDuck.jpg)
![image](DuckUml.png)
## 测试
```java
public class Main {

    public static void main ( String[] args ) {

        Duck mallardDuck = new MallardDuck ( );
        Duck redheadDuck = new RedheadDuck ( );
        Duck rubberDuck  = new RubberDuck ( );

        redheadDuck.display ( );
        mallardDuck.display ( );
        rubberDuck.display ( );
        System.out.println ( "-----------------------------------------------------" );

        redheadDuck.setQuackBehavior ( new Squack ( ) );
        redheadDuck.quack ( );
        redheadDuck.setQuackBehavior ( ( ) -> System.out.println ( "测试" ) );
        redheadDuck.quack ( );
    }

}

```
测试结果：
![image](testResult.png)
