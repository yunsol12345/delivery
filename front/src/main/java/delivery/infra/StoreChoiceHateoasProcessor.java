package delivery.infra;

import delivery.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class StoreChoiceHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<StoreChoice>> {

    @Override
    public EntityModel<StoreChoice> process(EntityModel<StoreChoice> model) {
        return model;
    }
}
