package decorator;

/**
 * Decorator pattern is widely and commonly used pattern that provides mechanisms to
 * extend the behaviour dynamically at runtime.
 */

public class DecoratorAPP {


    public static void main(String[] args) {
        DecoratePattern pattern = new DecoratePattern();
        DecoratePattern.ConcreteComponent component = pattern.new ConcreteComponent();
        DecoratePattern.ConcreteDecoratorA d1 = pattern.new ConcreteDecoratorA();
        DecoratePattern.ConcreteDecoratorB d2 = pattern.new ConcreteDecoratorB();

        d1.setComponent(component);
        d2.setComponent(d1);
        d2.operation();
    }
}
