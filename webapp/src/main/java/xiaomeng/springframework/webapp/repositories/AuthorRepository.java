package xiaomeng.springframework.webapp.repositories;
import xiaomeng.springframework.webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
