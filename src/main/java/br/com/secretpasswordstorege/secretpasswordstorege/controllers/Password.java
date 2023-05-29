package br.com.secretpasswordstorege.secretpasswordstorege.controllers;

import br.com.secretpasswordstorege.secretpasswordstorege.entity.Passwords;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/password")
public interface Password {

    @PostMapping("/save")
    void save(Passwords password);
}
