package fr.Istic.Repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.Istic.entities.PersRole;
import fr.Istic.entities.Person;
import fr.Istic.entities.Sport;

public interface PersonRepository extends JpaRepository<Person,Long>{
	List<Person> findByFirstname(String firstname);
    List<Person> findByLastname(String lastname);
    List<Person> findByEmailAndLastname(String email, String lastname);
    //List<Person> findByRolesAndEmail(String roles,String email);
   public Person findByEmail(String email);
List<Person> findByRolesAndEmail(List<PersRole> role, String email);
//List<Person> findBySports(Collection<Sport> sport);
List<Person> findBySports(Collection<Sport> sports);


}
