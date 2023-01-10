package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryStated extends AbstractEvent {

    private Long id;
    private String orderId;

    public DeliveryStated(Delivery aggregate){
        super(aggregate);
    }
    public DeliveryStated(){
        super();
    }
}
