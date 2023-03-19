package delivery.domain;

import delivery.FrontApplication;
import delivery.domain.MenuChoosed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "MenuChoice_table")
@Data
public class MenuChoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String storeId;

    private String storeName;

    private String menuId;

    private String menuName;

    private Integer price;

    private Integer customerId;

    private String customerName;

    private String customerAddress;

    @PostPersist
    public void onPostPersist() {
        MenuChoosed menuChoosed = new MenuChoosed(this);
        menuChoosed.publishAfterCommit();
    }

    public static MenuChoiceRepository repository() {
        MenuChoiceRepository menuChoiceRepository = FrontApplication.applicationContext.getBean(
            MenuChoiceRepository.class
        );
        return menuChoiceRepository;
    }

    //<<< Clean Arch / Port Method
    public static void storeChoice(Ordered ordered) {
        /** Example 1:  new item 
        MenuChoice menuChoice = new MenuChoice();
        repository().save(menuChoice);

        */

        /** Example 2:  finding and process
        
        repository().findById(ordered.get???()).ifPresent(menuChoice->{
            
            menuChoice // do something
            repository().save(menuChoice);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
