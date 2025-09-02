package br.com.senacsp.tads.stads4ma.libray.domain.repository;

import br.com.senacsp.tads.stads4ma.libray.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface UserRepository<T, ID> {
    List<User> findAll();
    User findById(UUID id);
}
