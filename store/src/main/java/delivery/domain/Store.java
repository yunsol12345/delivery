package delivery.domain;

import delivery.StoreApplication;
import delivery.domain.Accepted;
import delivery.domain.OrderCanceled;
import delivery.domain.OrderedToStore;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Store_table")
@Data
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String customerId;

    private String customerAddress;

    private String status;

    private String qty;

    private String customerName;

    private Integer payDate;

    @PostPersist
    public void onPostPersist() {
        Accepted accepted = new Accepted(this);
        accepted.publishAfterCommit();

        OrderedToStore orderedToStore = new OrderedToStore(this);
        orderedToStore.publishAfterCommit();
    }

    @PostUpdate
    public void onPostUpdate() {
        OrderCanceled orderCanceled = new OrderCanceled(this);
        orderCanceled.publishAfterCommit();
    }

    public static StoreRepository repository() {
        StoreRepository storeRepository = StoreApplication.applicationContext.getBean(
            StoreRepository.class
        );
        return storeRepository;
    }

    //<<< Clean Arch / Port Method
    public static void pay(Payed payed) {
        /** Example 1:  new item 
        Store store = new Store();
        repository().save(store);

        */

        /** Example 2:  finding and process
        
        repository().findById(payed.get???()).ifPresent(store->{
            
            store // do something
            repository().save(store);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void payCancel(OrderCanceled orderCanceled) {
        /** Example 1:  new item 
        Store store = new Store();
        repository().save(store);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(store->{
            
            store // do something
            repository().save(store);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
