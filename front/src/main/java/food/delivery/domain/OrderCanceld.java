package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderCanceld extends AbstractEvent {

    private Long id;
    private String orderId;

    public OrderCanceld(Order aggregate){
        super(aggregate);
    }
    public OrderCanceld(){
        super();
    }
}
