package fr.icchoirlyon.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    List<User> findAll();

    User findById(Long id);

    List<User> findByAdmin(Boolean admin);

    User findByUsername(String username);
}
