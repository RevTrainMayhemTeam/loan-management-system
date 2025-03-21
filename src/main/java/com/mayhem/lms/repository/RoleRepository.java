package com.mayhem.lms.repository;

import com.mayhem.lms.model.AccountRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<AccountRole, Long> {
    AccountRole getByRoleName(String roleName);
}