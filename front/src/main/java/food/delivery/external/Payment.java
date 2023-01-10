package food.delivery.external;

import lombok.Data;
import java.util.Date;
@Data
public class Payment {

    private Long id;
    private String orderId;
    private String customerId;
    private Object payAmount;
    private String payType;
    private Date payDate;
}


