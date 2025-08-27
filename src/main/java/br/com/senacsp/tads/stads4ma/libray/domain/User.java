package br.com.senacsp.tads.stads4ma.libray.domain;

import lombok.*;

import java.util.UUID;


@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User {

    private @Setter @Getter UUID id;
    private @Setter @Getter String name;
    private @Setter @Getter String email;
    private @Setter @Getter String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
