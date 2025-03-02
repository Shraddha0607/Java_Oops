package SecurityLearningBasicAndRoleBased.repository;

import SecurityLearningBasicAndRoleBased.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    // method to fetch user based on name
    Optional<User> findUserByUsername(String username);

}

