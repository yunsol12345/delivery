package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Payed extends AbstractEvent {

    private Long id;
    private String state;
    private String oderId;
    private Integer price;
    private Integer customerId;
    private Integer customerName;
    private Integer customerAddress;
    private Integer payDate;

    public Payed(Pay aggregate) {
        super(aggregate);
    }

    public Payed() {
        super();
    }
}
