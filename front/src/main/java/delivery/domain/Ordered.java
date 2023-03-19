package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Ordered extends AbstractEvent {

    private Long id;
    private String storeId;
    private String storeName;

    public Ordered(StoreChoice aggregate) {
        super(aggregate);
    }

    public Ordered() {
        super();
    }
}
