package desafio_unidac.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employees")
public class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String name;
	private String cpf;
	
	@Transient
	private Set<Recipe> listRecipe = new HashSet<>();
	
	public Employee() {
	}

	public Employee(String id, String name, String cpf) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Set<Recipe> getListRecipe() {
		return listRecipe;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(id, other.id);
	}
}
