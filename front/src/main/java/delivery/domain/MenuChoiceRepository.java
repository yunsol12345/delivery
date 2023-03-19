package delivery.domain;

import delivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "menuChoices",
    path = "menuChoices"
)
public interface MenuChoiceRepository
    extends PagingAndSortingRepository<MenuChoice, Long> {}
