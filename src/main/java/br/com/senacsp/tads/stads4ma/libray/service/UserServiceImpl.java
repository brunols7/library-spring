package br.com.senacsp.tads.stads4ma.libray.service;

import br.com.senacsp.tads.stads4ma.libray.domain.User;
import br.com.senacsp.tads.stads4ma.libray.domain.repository.NonPersistentUserRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@NoArgsConstructor(force = true)
public class UserServiceImpl implements UserService{

    private final NonPersistentUserRepository userRepository;

    @Override
    public List<User> findAll() {
        List<User> resultset = new ArrayList<>();
        resultset.addAll(this.userRepository.findAll());
        return resultset;
    }

    @Override
    public User findById(UUID id){
        return this.userRepository.findById(id);
    }

}
