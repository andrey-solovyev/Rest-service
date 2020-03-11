package payroll;

import org.springframework.data.jpa.repository.JpaRepository;
import payroll.Model.Order;
import payroll.Model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
