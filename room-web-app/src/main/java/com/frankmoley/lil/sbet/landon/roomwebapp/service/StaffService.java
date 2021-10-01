package com.frankmoley.lil.sbet.landon.roomwebapp.service;

import com.frankmoley.lil.sbet.landon.roomwebapp.data.StaffRepository;
import com.frankmoley.lil.sbet.landon.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

//    private static final List<StaffMember> staff = new ArrayList();
//
//    static {
//        for (int i = 0; i < 10; i++) {
//            staff.add(new StaffMember("Jan" + i, "Nowak" + i, "Bodyguard"));
//        }
//    }

    private final StaffRepository staffRepository;

    public StaffService (StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<StaffMember> getAllStaff() {
        return staffRepository.findAll();
    }

}
