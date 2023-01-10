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
    @Autowired OrderStoreRepository orderStoreRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='PayCompleted'")
    public void wheneverPayCompleted_OrderRelay(@Payload PayCompleted payCompleted){

        PayCompleted event = payCompleted;
        System.out.println("\n\n##### listener OrderRelay : " + payCompleted + "\n\n");


        // Comments // 
		//주문전달

        // Sample Logic //

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCanceld'")
    public void wheneverOrderCanceld_OrderCancelRelay(@Payload OrderCanceld orderCanceld){

        OrderCanceld event = orderCanceld;
        System.out.println("\n\n##### listener OrderCancelRelay : " + orderCanceld + "\n\n");


        

        // Sample Logic //

        

    }

}


