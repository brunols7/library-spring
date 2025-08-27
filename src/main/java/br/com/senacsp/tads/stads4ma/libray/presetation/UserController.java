package br.com.senacsp.tads.stads4ma.libray.presetation;

import br.com.senacsp.tads.stads4ma.libray.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;


}
