package payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import payroll.data.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
