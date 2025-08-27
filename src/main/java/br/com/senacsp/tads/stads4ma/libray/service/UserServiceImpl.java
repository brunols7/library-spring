package br.com.senacsp.tads.stads4ma.libray.service;

import br.com.senacsp.tads.stads4ma.libray.domain.repository.NonPersistentUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final NonPersistentUserRepository userRepository;

}
