package br.com.senacsp.tads.stads4ma.libray.presetation;

import br.com.senacsp.tads.stads4ma.libray.domain.User;
import br.com.senacsp.tads.stads4ma.libray.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {


    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> fetchAllUsers(){

        List<User> users = this.userService.findAll();
        return ResponseEntity.ok().body(this.userService.findAll());
    }


}
