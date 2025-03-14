package com.mayhem.lms.service;

import com.mayhem.lms.dto.RegisterDto;
import com.mayhem.lms.model.Account;
import com.mayhem.lms.model.User;
import com.mayhem.lms.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(RegisterDto newUser) {
        Account account = new Account();
        account.setEmail(newUser.getEmail());
        account.setPassword(newUser.getPassword());


        User user = new User();
        user.setFirstName(newUser.getFirstName());
        user.setLastName(newUser.getLastName());
        user.setPhone(newUser.getPhoneNumber());

        userRepository.save(user);
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public boolean deleteUser(Long id){
        return userRepository.findById(id).map(profile -> {
            userRepository.delete(profile);
            return true;
        }).orElse(false);
    }
}
