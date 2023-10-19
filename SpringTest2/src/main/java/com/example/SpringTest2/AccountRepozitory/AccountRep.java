package com.example.SpringTest2.AccountRepozitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringTest2.entity.Account;

public interface AccountRep extends JpaRepository<Account, Long> {

}
