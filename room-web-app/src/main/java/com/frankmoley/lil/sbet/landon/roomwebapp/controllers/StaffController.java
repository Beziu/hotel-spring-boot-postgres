package com.frankmoley.lil.sbet.landon.roomwebapp.controllers;

import com.frankmoley.lil.sbet.landon.roomwebapp.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/staffs")
public class StaffController {

//    private static final List<StaffMember> staffMembers = new ArrayList<>();
//
//    static {
//        for (int i = 0; i < 10; i++) {
//            staffMembers.add(new StaffMember("Bat " + i, "Man " + i, "GARDNER"));
//        }
//    }

    private final StaffService staffService;

    public StaffController (StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public String getAllEmployees (Model model) {
        model.addAttribute("staffs", staffService.getAllStaff());
        return "staffs";
    }
}
