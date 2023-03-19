package delivery.external;

import java.util.Date;
import lombok.Data;

@Data
public class Delivery {

    private Long id;
    private String customerAddress;
    private String state;
    private String customerName;
    private String customerId;
    private String storeId;
    private String menuId;
    private String pickDt;
    private String finishCook;
}
