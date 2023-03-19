package delivery.domain;

import delivery.RiderApplication;
import delivery.domain.DeliveryCompleted;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Delivery_table")
@Data
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String customerAddress;

    private String state;

    private String customerName;

    private String customerId;

    private String storeId;

    private String menuId;

    private String pickDt;

    private String finishCook;

    @PostPersist
    public void onPostPersist() {
        DeliveryCompleted deliveryCompleted = new DeliveryCompleted(this);
        deliveryCompleted.publishAfterCommit();
        // Get request from Delivery
        //delivery.external.Delivery delivery =
        //    Application.applicationContext.getBean(delivery.external.DeliveryService.class)
        //    .getDelivery(/** mapping value needed */);

    }

    public static DeliveryRepository repository() {
        DeliveryRepository deliveryRepository = RiderApplication.applicationContext.getBean(
            DeliveryRepository.class
        );
        return deliveryRepository;
    }
}
