package pl.kedzierski.crud.control;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kedzierski.crud.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
