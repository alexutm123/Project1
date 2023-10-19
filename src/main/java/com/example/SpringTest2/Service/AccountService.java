package com.example.SpringTest2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringTest2.AccountRepozitory.AccountRep;
import com.example.SpringTest2.entity.Account;
import com.example.SpringTest2.entity.Bill;
import com.example.SpringTest2.exceptions.ExeptionsAccaunt;


@Service
public class AccountService {

private final AccountRep repozit;
	
	@Autowired
	public AccountService(AccountRep repozit) {
	
		this.repozit = repozit;
	}
	
	public Long save(String name ,String email, List<Bill> bills)
	{
		Account account = new Account(name,email,bills);
		
		return repozit.save(account).getAccountId();
	}
	
	 public Account getById(Long accountId) {
	        return repozit.findById(accountId)
	        		.orElseThrow(() -> new ExeptionsAccaunt("Can't find account with id: " + accountId));
	    }
	 
	 public List<Account> getAll() { 
		    return repozit.findAll();
		}
	 
	 
	 public String deleteById(Long id) {
		    repozit.deleteById(id);
		    return "Succes";
		}
	 
	 
	 public Account updateAccount(Account update) {
			Account account = update;
		    return repozit.save(account);
	 }	 
}
