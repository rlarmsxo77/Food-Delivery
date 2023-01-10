package food.delivery.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="MenuRead_table")
@Data
public class MenuRead {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}
