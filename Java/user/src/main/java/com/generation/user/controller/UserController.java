package main.java.com.generation.user.controller;
import com.generation.user.model.UserEntity;
import com.generation.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Definir la clase como Controller con la anotacion @RestController
// Definir el endpoint para realizar las peticiones mediante HTTP con la anotacion @RequestMapping (mapeo general)
@RestController
@RequestMapping("/api/v1")
public class UserController {

    //Mando a llamar una instancia de Service encapsulada y de tipo final
    private final UserService userService;

    //Inyecto la instancia de Service dentro del constructor del Controller, anotando con @Autowired
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Metodo para mandar a llamar el metodo getUser() desde UserService y poder mapearlo
    @GetMapping("/users")
    public List<UserEntity> getAllUser(){
        return this.userService.getUser();
    }



}
