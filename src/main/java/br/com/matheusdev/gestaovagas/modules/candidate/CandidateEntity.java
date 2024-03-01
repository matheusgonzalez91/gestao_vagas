package br.com.matheusdev.gestaovagas.modules.candidate;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "candidate")
public class CandidateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Schema(example = "Matheus de Souza Gonzalez")
    private String name;

    @NotBlank()
    @Pattern(regexp = "\\S+", message = "O campo [USERNAME] não pode conter espaços.")
    @Schema(example = "matheusgonzalez91")
    private String username;

    @Email(message = "O campo [EMAIL] deve conter um e-mail válido.")
    @Schema(example = "gonzalezmatheus@gmail.com")
    private String email;

    @Length(min = 10, max = 100, message = "A senha deve conter de [10] a [100] caracteres.")
    @Schema(example = "admin@1234", minLength = 10, maxLength = 100, requiredMode = Schema.RequiredMode.REQUIRED)
    private String password;

    @Schema(example = "Desenvolvedor Java")
    private String description;
    private String curriculum;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
