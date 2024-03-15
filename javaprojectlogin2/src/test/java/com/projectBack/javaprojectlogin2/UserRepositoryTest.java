package com.projectBack.javaprojectlogin2;


import jakarta.inject.Inject;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)

public class UserRepositoryTest {

    @Inject
    private UserRepository repo;

    @Inject
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser() {
        User user = new User();
        user.setEmail("cualquiera4@gmail.com");
        user.setPassWord("123d");
        user.setFirstName("ddAngel");
        user.setLastName("Diazss");
        
        User savedUser = repo.save(user);
        
        User existUser = entityManager.find(User.class, savedUser.getId());
        
        Assertions.assertThat(existUser.getEmail()).isEqualTo(user.getEmail());
    }
}
