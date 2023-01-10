package food.delivery.domain;

import food.delivery.domain.PayCompleted;
import food.delivery.FrontApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Payment_table")
@Data

public class Payment  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String customerId;
    
    
    
    @Embedded
    
    private Money payAmount;
    
    
    
    
    
    private String payType;
    
    
    
    
    
    private Date payDate;

    @PostPersist
    public void onPostPersist(){


        PayCompleted payCompleted = new PayCompleted(this);
        payCompleted.publishAfterCommit();

    }

    public static PaymentRepository repository(){
        PaymentRepository paymentRepository = FrontApplication.applicationContext.getBean(PaymentRepository.class);
        return paymentRepository;
    }






}
