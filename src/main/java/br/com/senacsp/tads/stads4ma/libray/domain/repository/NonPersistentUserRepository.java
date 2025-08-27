package br.com.senacsp.tads.stads4ma.libray.domain.repository;

import br.com.senacsp.tads.stads4ma.libray.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class NonPersistentUserRepository implements UserRepository<User, UUID>{

    private List<User> internalData = new ArrayList<>();

    public NonPersistentUserRepository(){
        Faker faker = new Faker();
    }

}
