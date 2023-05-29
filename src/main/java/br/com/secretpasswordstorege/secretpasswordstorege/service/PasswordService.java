package br.com.secretpasswordstorege.secretpasswordstorege.service;

import br.com.secretpasswordstorege.secretpasswordstorege.controllers.Password;
import br.com.secretpasswordstorege.secretpasswordstorege.entity.Passwords;

public interface PasswordService {

    void savePassword(Passwords Password);

    String generatePassword(int caracters);
}
