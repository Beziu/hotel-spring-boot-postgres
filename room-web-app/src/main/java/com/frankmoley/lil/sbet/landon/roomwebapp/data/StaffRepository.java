package com.frankmoley.lil.sbet.landon.roomwebapp.data;

import com.frankmoley.lil.sbet.landon.roomwebapp.models.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StaffRepository extends JpaRepository<StaffMember, UUID> {

}
