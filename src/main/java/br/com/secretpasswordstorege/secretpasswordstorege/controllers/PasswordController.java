package br.com.secretpasswordstorege.secretpasswordstorege.controllers;

import br.com.secretpasswordstorege.secretpasswordstorege.entity.Passwords;
import br.com.secretpasswordstorege.secretpasswordstorege.service.PasswordService;
import org.springframework.stereotype.Controller;

@Controller
public class PasswordController implements Password{

    private PasswordService passwordService;

    @Override
    public void save(Passwords password) {
        passwordService.savePassword(password);
    }
}
