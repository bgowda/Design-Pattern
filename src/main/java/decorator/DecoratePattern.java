package decorator;

public class DecoratePattern {
    abstract class Component {
        public abstract void operation();
    }

    class ConcreteComponent extends Component {

        @Override
        public void operation() {
            System.out.println("This is concerete implemenation");
        }
    }

    abstract class Decorator extends Component {
        protected Component component;

        public void setComponent(Component component) {
            this.component = component;
        }

        @Override
        public void operation() {
            System.out.println("Inside Decorator");
            if (component != null) {
                component.operation();
            }
            System.out.println("Outside Decorator");
        }
    }

    class ConcreteDecoratorA extends Decorator {
        @Override
        public void operation() {
            super.operation();    //To change body of overridden methods use File | Settings | File Templates.
            System.out.println("Decorator A initialized");
        }
    }

    class ConcreteDecoratorB extends Decorator {
        @Override
        public void operation() {
            super.operation();    //To change body of overridden methods use File | Settings | File Templates.
            System.out.println("Decorator B initialized");
        }
    }
}