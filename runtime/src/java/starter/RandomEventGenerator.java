package starter;

import api.EventAbstract;
import generator.NamedEvent;
import product.ProductEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomEventGenerator {

    private static final Random random = new Random();
    private static final List<Integer> eventIds = new ArrayList<>();

    public static EventAbstract generateRandomEvent() {
        switch (random.nextInt(2)) {
            case 0:
                return NamedEvent.createNamedEvent(RandomEventGenerator.class, generateEventId());
            case 1:
                return ProductEvent.createProductEvent(RandomEventGenerator.class, generateEventId());
        }

        throw new IllegalArgumentException("switch (random.nextInt(2)) generates overflow");
    }

    public static int generateEventId() {
        return generateId();
    }

    private static int generateId() {
        int i = random.nextInt();
        if (eventIds.contains(i)) {
            return generateId();
        }
        eventIds.add(i);
        return i;
    }
}
