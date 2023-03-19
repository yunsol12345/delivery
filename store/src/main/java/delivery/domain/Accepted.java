package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Accepted extends AbstractEvent {

    private Long id;
    private String customerId;
    private String customerAddress;
    private String qty;
    private String status;

    public Accepted(Store aggregate) {
        super(aggregate);
    }

    public Accepted() {
        super();
    }
}
