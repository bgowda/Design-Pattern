package loan;

import soaPattern.saga.Event;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.QueueSender;

public class Lender {

    public void sendEvent(Message message)  {
        // Get connection from the pool or create new
        // Connect to Jms Server
        //

        QueueSender queueSender = null; // get this object from session
        try {
            queueSender.send(message);
        } catch (JMSException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
