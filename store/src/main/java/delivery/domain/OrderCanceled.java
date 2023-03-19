package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String customerId;
    private String customerAddress;
    private String qty;
    private String status;

    public OrderCanceled(Store aggregate) {
        super(aggregate);
    }

    public OrderCanceled() {
        super();
    }
}
