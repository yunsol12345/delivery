package delivery.domain;

import delivery.CustomerApplication;
import delivery.domain.OrderCanceled;
import delivery.domain.Payed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Pay_table")
@Data
public class Pay {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String state;

    private String oderId;

    private Integer price;

    private Integer customerId;

    private Integer customerName;

    private Integer customerAddress;

    private Integer payDate;

    @PostPersist
    public void onPostPersist() {
        Payed payed = new Payed(this);
        payed.publishAfterCommit();

        OrderCanceled orderCanceled = new OrderCanceled(this);
        orderCanceled.publishAfterCommit();
        // Get request from Pay
        //delivery.external.Pay pay =
        //    Application.applicationContext.getBean(delivery.external.PayService.class)
        //    .getPay(/** mapping value needed */);

        // Get request from Pay
        //delivery.external.Pay pay =
        //    Application.applicationContext.getBean(delivery.external.PayService.class)
        //    .getPay(/** mapping value needed */);

    }

    public static PayRepository repository() {
        PayRepository payRepository = CustomerApplication.applicationContext.getBean(
            PayRepository.class
        );
        return payRepository;
    }
}
