package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderedToStore extends AbstractEvent {

    private Long id;

    public OrderedToStore(Store aggregate) {
        super(aggregate);
    }

    public OrderedToStore() {
        super();
    }
}
