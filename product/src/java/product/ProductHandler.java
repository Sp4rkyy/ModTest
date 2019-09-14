package product;

import api.EventAbstract;
import api.EventHandlerI;

public class ProductHandler implements EventHandlerI<ProductEvent> {

    @Override
    public boolean supportsEventType(EventAbstract eventAbstract) {
        return eventAbstract instanceof ProductEvent;
    }

    @Override
    public void handleEvent(EventAbstract event) {
        if(supportsEventType(event)){
            System.out.println("ProductHandler handels Event: " + event.getEventType() + " " + event.getID());
        }
    }


}
