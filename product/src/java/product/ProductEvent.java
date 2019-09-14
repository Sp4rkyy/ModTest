package product;

import api.EventAbstract;

public class ProductEvent extends EventAbstract {



    private ProductEvent(Object source, int id) {
        super(source, id);
    }

    public static ProductEvent createProductEvent(Object source, int id) {
        return new ProductEvent(source, id);
    }

    @Override
    public String getEventType() {
        return ProductEvent.class.getSimpleName();
    }
}
