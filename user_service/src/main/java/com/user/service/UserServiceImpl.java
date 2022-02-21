package com.user.service;
import java.util.List;
import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl  implements UserService{

    List<User> list = List.of(
            new User(1311L, "Rahul","9157574933"),
            new User(1312L, "mahesh", "92588885"),
            new User(1314L, "pritam singh", "6204858888")
    );


	
	  @Override
	    public User getUser(Long id) {
	        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
