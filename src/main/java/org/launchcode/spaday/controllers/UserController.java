package org.launchcode.spaday.controllers;

import org.launchcode.spaday.data.UserData;
import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {

    // handles GET requests to /user/add
    @GetMapping("add")
    public String displayAddUserForm(){
        return "user/add";
    }

    // handles POST requests to /user/add
    @PostMapping("add")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify){
        if(user.getPassword().equals(verify)){
            UserData.add(user);
            model.addAttribute("users", UserData.getAll());
            return "user/index";
        }
        model.addAttribute("error", "Password does not match, please re-enter");
        model.addAttribute("username", user.getUsername());
        model.addAttribute("email", user.getEmail());
        return "user/add";
    }

    @GetMapping("detail/{id}")
    public String displayUserDetailForm(Model model, @PathVariable("id") int id){
        model.addAttribute(UserData.getById(id));
        return "user/detail";
    }
}
