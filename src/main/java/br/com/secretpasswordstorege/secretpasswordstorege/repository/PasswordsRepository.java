package br.com.secretpasswordstorege.secretpasswordstorege.repository;

import br.com.secretpasswordstorege.secretpasswordstorege.entity.Passwords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordsRepository extends JpaRepository<String, String> {
}
