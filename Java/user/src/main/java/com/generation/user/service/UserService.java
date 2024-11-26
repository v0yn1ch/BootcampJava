package main.java.com.generation.user.service;
import com.generation.user.model.UserEntity;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

// Permite definir el modelo de negocio (logica comercial)

// Debemos indicar que nuestra clase es un servicio mediante la anotacion @Service de SpringFramework
@Service
public class UserService{

    // Emular una DB para crear nuestra primera API, debemos instanciar objetos en forma de List<>
    private final List<UserEntity> user = new ArrayList<>();

    public UserService(){
        user.add(new UserEntity(1L, "v0yn1ch", "123456789", "arturo.pesilva@gmail.com"));
        user.add(new UserEntity(2L, "cesar.f", "1234563", "cesar.f@gmail.com"));
        user.add(new UserEntity(3L, "josh.cano", "josue123", "josh.cano@gmail.com"));
        user.add(new UserEntity(4L, "tere.o", "periquito", "tere.o@gmail.com"));
        user.add(new UserEntity(5L, "artur.p", "123456789", "artur.p@gmail.com"));
    }

    // Metodo para la logica comercial que me permita recuperar todos los usuarios
    public List<UserEntity> getUser(){
        return user;
    }



}

