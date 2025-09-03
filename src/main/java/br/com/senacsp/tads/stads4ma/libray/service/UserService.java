package br.com.senacsp.tads.stads4ma.libray.service;

import br.com.senacsp.tads.stads4ma.libray.domain.User;
import br.com.senacsp.tads.stads4ma.libray.domain.repository.NonPersistentUserRepository;
import br.com.senacsp.tads.stads4ma.libray.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface UserService {


    List<User> findAll();
    User findById(UUID id);
    void deleteById(UUID id);
    User create(User user);
}
