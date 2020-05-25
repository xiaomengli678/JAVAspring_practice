package xiaomeng.springframework.webapp.repositories;

import xiaomeng.springframework.webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
