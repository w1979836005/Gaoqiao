package com.example.usercenterback;
import java.util.Date;

import com.example.usercenterback.model.domain.User;
import com.example.usercenterback.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class UserServiceTest {
    @Resource
    UserService userService;
    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("fll");
        user.setAvatarUrl("jgp");
        user.setGender(0);
        user.setPassword("123456789");
        user.setPhone("1");
        user.setEmail("1");
        user.setIsValid(0);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user.setIsDelete(0);


        userService.save(user);
    }
}
