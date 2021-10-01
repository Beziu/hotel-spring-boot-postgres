package com.frankmoley.lil.sbet.landon.roomwebapp.controllers;

import com.frankmoley.lil.sbet.landon.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController {

    private static final List<StaffMember> STAFF_MEMBERS = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            STAFF_MEMBERS.add(new StaffMember("Bat " + i, "Man " + i, "GARDNER"));
        }
    }

    @GetMapping
    public String getAllEmployees (Model model) {
        model.addAttribute("employees", STAFF_MEMBERS);
        return "employees";
    }
}
