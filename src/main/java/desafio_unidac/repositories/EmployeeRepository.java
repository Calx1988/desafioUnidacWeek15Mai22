package desafio_unidac.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import desafio_unidac.entities.Employee;

@Repository
public interface EmployeeRepository  extends MongoRepository<Employee, String>{

}
