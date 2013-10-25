package soaPattern.saga;


import javax.jms.Message;
import javax.jms.MessageListener;
import java.util.ArrayList;
import java.util.Collection;

// Process manager is incomplete, it requires to implement event handler . As sagas may implmentaion is to compensate
// for failed transaction, that needs to be defined as well in the flow.
public class ProcessManager {

    private Collection<Listener> listeners = new ArrayList<Listener>();

    public <E extends Event> void registerListeners(Listener<E> listener) {
        this.listeners.add(listener);
    }

    public void eventOccurred(Stake stake) {
         notify(stake);
    }

    private void notify(Stake stake) {
        for(Listener listener : listeners){
            listener.update(stake);
        }
    }

    public void handle(BonusEvent bonusEvent) {

    }

    public void onMessage(Message message) {
         if(message instanceof BonusEvent){

         }
    }
}
