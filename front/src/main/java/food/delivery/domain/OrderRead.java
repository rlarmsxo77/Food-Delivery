package food.delivery.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="OrderRead_table")
@Data
public class OrderRead {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}
