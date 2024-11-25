package controller;

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import com.example.demo.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtService jwtService;

    @PostMapping("/login")
    public String login(@RequestBody UserModel userModel) {
        // Xử lý đăng nhập và tạo JWT
        return jwtService.createJwt(userModel.getUsername());
    }
}