package br.com.secretpasswordstorege.secretpasswordstorege.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Passwords {

    @Id
    private String id;
    private String caraceters;
    private String password;
    private String passwordGenerated;

}
