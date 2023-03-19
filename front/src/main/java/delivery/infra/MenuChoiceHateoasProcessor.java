package delivery.infra;

import delivery.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class MenuChoiceHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<MenuChoice>> {

    @Override
    public EntityModel<MenuChoice> process(EntityModel<MenuChoice> model) {
        return model;
    }
}
