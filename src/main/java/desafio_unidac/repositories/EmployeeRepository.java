package desafio_unidac.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import desafio_unidac.entities.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}
