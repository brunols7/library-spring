package br.com.senacsp.tads.stads4ma.libray.domain.repository;

import br.com.senacsp.tads.stads4ma.libray.domain.User;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Component
public class NonPersistentUserRepository implements UserRepository<User, UUID>{

    private List<User> internalData = new ArrayList<>();

    public NonPersistentUserRepository(){
        Faker faker = new Faker();

        for(int i = 0; i < 10; i++){
            User user = new User(
                    UUID.randomUUID(),
                    faker.name().fullName(),
                    faker.internet().emailAddress(),
                    faker.internet().password()
            );
            this.internalData.add(user);
        }
    }

    @Override
    public List<User> findAll() {
        return this.internalData.stream().toList();
    }
}
