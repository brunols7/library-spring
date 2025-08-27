package br.com.senacsp.tads.stads4ma.libray.service;

import br.com.senacsp.tads.stads4ma.libray.domain.User;
import br.com.senacsp.tads.stads4ma.libray.domain.repository.NonPersistentUserRepository;
import br.com.senacsp.tads.stads4ma.libray.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {


    List<User> findAll();
}
