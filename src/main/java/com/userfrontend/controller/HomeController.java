package com.userfrontend.controller;

import com.userfrontend.Dao.RoleDao;
import com.userfrontend.domain.PrimaryAccount;
import com.userfrontend.domain.SavingsAccount;
import com.userfrontend.domain.User;
import com.userfrontend.domain.security.UserRole;
import com.userfrontend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Laptop on 23.11.2017..
 */
@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleDao roleDao;

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

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signupPost(@ModelAttribute("user") User user,  Model model) {

        if(userService.checkUserExists(user.getUsername(), user.getEmail()))  {

            if (userService.checkEmailExists(user.getEmail())) {
                model.addAttribute("emailExists", true);
            }

            if (userService.checkUsernameExists(user.getUsername())) {
                model.addAttribute("usernameExists", true);
            }

            return "signup";
        } else {
            Set<UserRole> userRoles = new HashSet<>();
            userRoles.add(new UserRole(user, roleDao.findByName("ROLE_USER")));

            userService.createUser(user, userRoles);

            return "redirect:/";
        }
    }
    @RequestMapping("/userFront")
    public String userFront(Principal principal, Model model) {
        User user = userService.findByUsername(principal.getName());
        PrimaryAccount primaryAccount = user.getPrimaryAccount();
        SavingsAccount savingsAccount = user.getSavingsAccount();

        model.addAttribute("primaryAccount", primaryAccount);
        model.addAttribute("savingsAccount", savingsAccount);

        return "userFront";
    }
}
