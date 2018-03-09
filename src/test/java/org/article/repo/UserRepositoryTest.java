package org.article.repo;

import static org.junit.Assert.assertEquals;
import org.article.Application;
import org.article.domain.User;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.web.WebAppConfiguration;
import java.util.Optional;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class UserRepositoryTest {

    //@Autowired
    //private UserRepository userRepository;

    @After
    public void tearDown() {
        //userRepository.deleteAll();
    }

    @Test
    public void findByUserName() {
        //final User user = new User();
        //user.setUserName("userName");
        //user.setFirstName("firstName");
        //user.setFirstName("lastName");
        //userRepository.save(user);

        //final Optional<User> actualUser = userRepository.existsById(user.getUserName());
        //assertEquals(user, actualUser);
    }
}
