package food.delivery.domain;

import food.delivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="orderStores", path="orderStores")
public interface OrderStoreRepository extends PagingAndSortingRepository<OrderStore, Long>{

}
