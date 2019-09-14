import api.EventHandlerI;
import product.ProductHandler;

module ModTest.product {
    exports product;

    requires ModTest.eventbus;

    provides EventHandlerI with ProductHandler;
}