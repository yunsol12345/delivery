package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class MenuChoosed extends AbstractEvent {

    private Long id;
    private String storeId;
    private String storeName;
    private String menuId;
    private String menuName;
    private Integer price;
    private Integer customerId;
    private String customerName;
    private String customerAddress;

    public MenuChoosed(MenuChoice aggregate) {
        super(aggregate);
    }

    public MenuChoosed() {
        super();
    }
}
