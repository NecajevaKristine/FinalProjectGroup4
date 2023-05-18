package com.finalprojectgroup4.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService (UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void createUser (User user) throws  Exception{
        this.userRepository.save(user);
    }
    public User verifyUser(String nickName, String password) throws Exception {
        User user = this.userRepository.findByNickNameAndPassword(nickName, password);
        if(user == null) throw new Exception ("Nickname or password is not correct");
        return user;
    }

}
