package food.delivery.infra;
import food.delivery.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class OrderStoreHateoasProcessor implements RepresentationModelProcessor<EntityModel<OrderStore>>  {

    @Override
    public EntityModel<OrderStore> process(EntityModel<OrderStore> model) {

        
        return model;
    }
    
}
