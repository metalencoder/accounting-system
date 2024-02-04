package org.accounting.accounting_system.dao;

import org.accounting.accounting_system.POJO.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {

}
