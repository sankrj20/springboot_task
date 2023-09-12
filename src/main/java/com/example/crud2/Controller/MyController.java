package com.example.crud2.Controller;

import com.example.crud2.Entity.MyEntity;
import com.example.crud2.Exceptions.CustomException;
import com.example.crud2.Exceptions.CustomExceptionResponse;
import com.example.crud2.Services.MyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class MyController {
    @Autowired
    private final MyServices myServices;

    private static final Logger logger = LoggerFactory.getLogger(MyController.class);


    @Autowired
    public MyController(MyServices myServices) {
        this.myServices = myServices;
    }

    @GetMapping
    public List<MyEntity> findAllUsers(){
        return myServices.findAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<MyEntity> findUserById(@PathVariable("id") Long id){

        return myServices.findById(id);
    }

    @PostMapping
    public MyEntity saveUser(@RequestBody MyEntity myEntity){
        return myServices.saveUser(myEntity);
    }

    @PutMapping
    public MyEntity updateUser(@RequestBody MyEntity myEntity){
        return  myServices.updateUser(myEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") Long id){
        myServices.deleteUser(id);
    }
    @GetMapping("/by-lastname")
    public List<MyEntity> getUsersByLastname(@RequestParam String lastname) {
        return myServices.findUsersByLastname(lastname);
    }

    @GetMapping("/operation")
    public ResponseEntity<Object> performOperation() {
        try {
            // Simulate an error condition
            if (true) { // Replace with your actual condition
                throw new CustomException("Custom Exception Generated");
            }

            // Rest of your service logic

            return ResponseEntity.ok("Operation completed successfully.");
        } catch (CustomException ex) {
            CustomExceptionResponse errorResponse = new CustomExceptionResponse(
                    ex.getError(),
                    ex.getStatus_code(),
                    ex.getMessage(),
                    ex.getTimestamp()
            );
            return ResponseEntity.status(ex.getStatus_code()).body(errorResponse);
        }
    }


}
