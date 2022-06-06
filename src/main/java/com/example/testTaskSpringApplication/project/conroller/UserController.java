package com.example.testTaskSpringApplication.project.conroller;

import com.example.testTaskSpringApplication.project.entity.UserEntity;
import com.example.testTaskSpringApplication.project.exception.UserAlreadyExistException;
import com.example.testTaskSpringApplication.project.exception.UserNotFoundException;
import com.example.testTaskSpringApplication.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    private

    @PostMapping
     ResponseEntity registration(@RequestBody UserEntity user) {
        try {
            userService.registration(user);
            return ResponseEntity.ok("Пользователь успешно сохранен");
        } catch (UserAlreadyExistException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }


    @GetMapping
    public ResponseEntity getOneUser(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(userService.getOne(id));
        } catch (UserNotFoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(userService.delete(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

//    @GetMapping("/pagination")
//    public String listPages(
//            Model model,
//            @RequestParam(value = "size", required = false, defaultValue = "0") Integer size,
//            @RequestParam(value = "size", required = false, defaultValue = "7") Integer page
//    ) {
//        Page<UserEntity> pageUser = userRepo.findAll(PageRequest.of(page, size));
//        model.addAttribute("userPage", pageUser);
//        model.addAttribute("numbers", IntStream.range(0, pageUser.getTotalPages()).toArray());
//        return "indexpag";
//    }
}
