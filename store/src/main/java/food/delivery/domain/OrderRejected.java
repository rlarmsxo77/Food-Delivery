package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderRejected extends AbstractEvent {

    private Long id;
    private String orderId;

    public OrderRejected(OrderStore aggregate){
        super(aggregate);
    }
    public OrderRejected(){
        super();
    }
}
