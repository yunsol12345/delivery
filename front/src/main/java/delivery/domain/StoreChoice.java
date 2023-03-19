package delivery.domain;

import delivery.FrontApplication;
import delivery.domain.Ordered;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "StoreChoice_table")
@Data
public class StoreChoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String storeId;

    private String storeName;

    @PostPersist
    public void onPostPersist() {
        Ordered ordered = new Ordered(this);
        ordered.publishAfterCommit();
        // Get request from StoreChoice
        //delivery.external.StoreChoice storeChoice =
        //    Application.applicationContext.getBean(delivery.external.StoreChoiceService.class)
        //    .getStoreChoice(/** mapping value needed */);

    }

    public static StoreChoiceRepository repository() {
        StoreChoiceRepository storeChoiceRepository = FrontApplication.applicationContext.getBean(
            StoreChoiceRepository.class
        );
        return storeChoiceRepository;
    }
}
