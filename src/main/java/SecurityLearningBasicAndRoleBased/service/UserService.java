package SecurityLearningBasicAndRoleBased.service;

import SecurityLearningBasicAndRoleBased.model.User;
import SecurityLearningBasicAndRoleBased.repository.UserRepo;
import SecurityLearningBasicAndRoleBased.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;

    public User createUser(User user){
        // to change the password in encrypted form
        user.setPassoword(new BCryptPasswordEncoder(12).encode(user.getPassoword()));
        return userRepo.save(user);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // verify user name
        Optional<User> user = userRepo.findUserByUsername(username);
        if(user.isEmpty()) throw new UsernameNotFoundException("User not found");
        System.out.println(user.toString() + " this is the user");
        return new UserPrincipal(user.get());
    }


}
