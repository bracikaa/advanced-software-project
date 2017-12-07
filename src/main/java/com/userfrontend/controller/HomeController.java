package com.userfrontend.controller;

import com.userfrontend.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashSet;

/**
 * Created by Laptop on 23.11.2017..
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signup(Model model){
        User newUser = new User();
        model.addAttribute("user", newUser);
        return "signup";
    }

    @RequestMapping(value="/signup", method = RequestMethod.POST)
    public void signupUser(@ModelAttribute("user") User user, Model model)
    {
//        if(userService.checkUserExists(user.getUsername(), user.getUser_email())) {
//            if(userService.checkEmailExists(user.getUser_email())) {
//                model.addAttribute("emailExists", true);
//            }
//
//            if(userService.checkUsernameExists(user.getUsername())) {
//                model.addAttribute("usernameExists", true);
//            }
//
//            return "signup";
//        } else {
//            Set<UserRole> userRoles = new HashSet<>;
//            user.roles.add(new UserRole(user, roleDao.findByName("USER")));
//            userService.createUser(user, userRoles);
//
//            return "redirect:/";
//        }

    }

}
