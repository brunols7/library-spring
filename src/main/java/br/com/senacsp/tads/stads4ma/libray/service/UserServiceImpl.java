package br.com.senacsp.tads.stads4ma.libray.service;

import br.com.senacsp.tads.stads4ma.libray.domain.User;
import br.com.senacsp.tads.stads4ma.libray.domain.repository.NonPersistentUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final NonPersistentUserRepository userRepository;

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        users.addAll(this.userRepository.findAll());
        return users;
    }
}
