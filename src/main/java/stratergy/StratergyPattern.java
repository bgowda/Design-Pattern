package stratergy;


public class StratergyPattern {

    public interface Stratergy {
        public void algorithm();
    }

    public abstract class TemplateMethod  implements Stratergy {
        @Override
        public void algorithm() {
            System.out.println("This is algorithm");
            templateMethod();
        }

        public abstract void templateMethod();
    }

    public class ConcreteA extends TemplateMethod{

        public void templateMethod() {
            System.out.println("Stratergy A ");
        }
    }

    public class ConcreteB extends TemplateMethod{

        @Override
        public void templateMethod() {
            System.out.println("Stratergy B");
        }


    }
}
