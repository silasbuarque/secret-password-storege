package br.com.secretpasswordstorege.secretpasswordstorege.service.impl;


import br.com.secretpasswordstorege.secretpasswordstorege.entity.Passwords;
import br.com.secretpasswordstorege.secretpasswordstorege.repository.PasswordsRepository;
import br.com.secretpasswordstorege.secretpasswordstorege.service.PasswordService;
import org.springframework.stereotype.Service;

@Service
public class PasswordServiceImpl implements PasswordService {

    private final PasswordsRepository passwordsRepository;

    public PasswordServiceImpl(PasswordsRepository passwordsRepository) {
        this.passwordsRepository = passwordsRepository;
    }

    @Override
    public void savePassword(Passwords password){
        passwordsRepository.save(password.getPassword());
    }

    @Override
    public String generatePassword(int caracters) {
        return null;
    }
}
