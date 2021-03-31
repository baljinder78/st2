package com.St2_backend.st2.Controller;

import com.St2_backend.st2.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class UserControler {
    @RequestMapping("/")
    public String allusers(Model model)
    {
        ArrayList<User> user=new ArrayList<>();
        User u1=new User();
        u1.setName("baljinder");
        u1.setNumber("hi");
        u1.setEmail("hira");

        user.add(u1);

        model.addAttribute("user",user);

        System.out.println("hello");
        return "index";
    }

}
