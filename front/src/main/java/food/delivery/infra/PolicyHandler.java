package food.delivery.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import food.delivery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import food.delivery.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired OrderRepository orderRepository;
    @Autowired PaymentRepository paymentRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @Autowired
    food.delivery.external.OrderStatusService orderStatusService;

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryStated'")
    public void wheneverDeliveryStated_OrderStatusUpdate(@Payload DeliveryStated deliveryStated){

        DeliveryStated event = deliveryStated;
        System.out.println("\n\n##### listener OrderStatusUpdate : " + deliveryStated + "\n\n");

        // REST Request Sample
        
        // orderStatusService.getOrderStatus(/** mapping value needed */);


        // Comments // 
		//주문상태변경

        // Sample Logic //
        Order.orderStatusUpdate(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveyCompleted'")
    public void wheneverDeliveyCompleted_OrderStatusUpdate(@Payload DeliveyCompleted deliveyCompleted){

        DeliveyCompleted event = deliveyCompleted;
        System.out.println("\n\n##### listener OrderStatusUpdate : " + deliveyCompleted + "\n\n");

        // REST Request Sample
        
        // orderStatusService.getOrderStatus(/** mapping value needed */);


        // Comments // 
		//주문상태변경

        // Sample Logic //
        Order.orderStatusUpdate(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderAccepted'")
    public void wheneverOrderAccepted_OrderStatusUpdate(@Payload OrderAccepted orderAccepted){

        OrderAccepted event = orderAccepted;
        System.out.println("\n\n##### listener OrderStatusUpdate : " + orderAccepted + "\n\n");

        // REST Request Sample
        
        // orderStatusService.getOrderStatus(/** mapping value needed */);


        // Comments // 
		//주문상태변경

        // Sample Logic //
        Order.orderStatusUpdate(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookFinished'")
    public void wheneverCookFinished_OrderStatusUpdate(@Payload CookFinished cookFinished){

        CookFinished event = cookFinished;
        System.out.println("\n\n##### listener OrderStatusUpdate : " + cookFinished + "\n\n");

        // REST Request Sample
        
        // orderStatusService.getOrderStatus(/** mapping value needed */);


        // Comments // 
		//주문상태변경

        // Sample Logic //
        Order.orderStatusUpdate(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderRejected'")
    public void wheneverOrderRejected_OrderStatusUpdate(@Payload OrderRejected orderRejected){

        OrderRejected event = orderRejected;
        System.out.println("\n\n##### listener OrderStatusUpdate : " + orderRejected + "\n\n");

        // REST Request Sample
        
        // orderStatusService.getOrderStatus(/** mapping value needed */);


        // Comments // 
		//주문상태변경

        // Sample Logic //
        Order.orderStatusUpdate(event);
        

        

    }

}


