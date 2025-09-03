package br.com.senacsp.tads.stads4ma.libray.presetation;

import br.com.senacsp.tads.stads4ma.libray.domain.User;
import br.com.senacsp.tads.stads4ma.libray.service.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/users")
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> fetchAllUsers() {
        return ResponseEntity.ok().body(this.userService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> fetchById(@PathVariable UUID id){
        User user = this.userService.findById(id);
        if( user == null ){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable UUID id){
        User user = this.userService.findById(id);
        if( user == null ){
            return ResponseEntity.notFound().build();
        }
        userService.deleteById(id);
        return ResponseEntity.ok("Usuário deletado com sucesso!");
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        return new ResponseEntity<User>(this.userService.create(user), HttpStatus.CREATED);
    }


}
