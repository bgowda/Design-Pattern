
public class CallbackHandler {

    public static interface Handler{
        public void handle(int r);
    }

    public static class DefaultHandler1 implements Handler{

        @Override
        public void handle(int r) {
            System.out.println("This is  a default handler");
        }
    }


    public static class Concrete {

        public void sum(int x, int y, Handler handler){
            handler.handle(x+y);
        }

        public void multiply (int x, int y, Handler handler){
            handler.handle(x*y);
        }
    }

    public static void main(String[] args) {
        Concrete c = new Concrete();
        c.sum(2,3,new Handler() {
            @Override
            public void handle(int r) {
                System.out.println(r);
            }
        });

        c.multiply(2,3,new DefaultHandler1());
    }

    private static void methodCall(int r) {
        System.out.println(r*10);
    }
}
