package com.vti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.DTO.AccountDTO;
import com.vti.Service.IAccountService;
import com.vti.entity.Account;

@RestController
@RequestMapping(value = "api/v1/accounts")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class AccountController {

	@Autowired
	private IAccountService service;

	@GetMapping()
	public ResponseEntity<?> getAllAccounts() {

		// get data
		List<Account> entities = service.getAllAccounts();

		return new ResponseEntity<List<Account>>(entities, HttpStatus.OK);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> getAccountByID(@PathVariable(name = "id") short id) {
		return new ResponseEntity<Account>(service.getAccounttByID(id), HttpStatus.OK);
	}

	@PostMapping()
	public ResponseEntity<?> createAccount(@RequestBody AccountDTO dto) {
		service.createAccount(dto.toEntity());
		return new ResponseEntity<String>("Create successfully!", HttpStatus.CREATED);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<?> updateAccount(@PathVariable(name = "id") short id, @RequestBody AccountDTO dto) {
		Account account = dto.toEntity();
		account.setAccountID(id);
		service.updateAccount(account);
		return new ResponseEntity<String>("Update successfully!", HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> deleteDepartment(@PathVariable(name = "id") short id) {
		service.deleteAccount(id);
		return new ResponseEntity<String>("Delete successfully!", HttpStatus.OK);
	}
}
