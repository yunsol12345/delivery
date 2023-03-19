package delivery.external;

import java.util.Date;
import lombok.Data;

@Data
public class Pay {

    private Long id;
    private String state;
    private String oderId;
    private Integer price;
    private Integer customerId;
    private Integer customerName;
    private Integer customerAddress;
    private Integer payDate;
}
