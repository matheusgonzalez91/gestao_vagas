package br.com.matheusdev.gestaovagas.modules.candidate.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileCandidateResponseDTO {

    @Schema(example = "Desenvolvedor Java")
    private String description;

    @Schema(example = "matheusgonzalez91")
    private String username;

    @Schema(example = "gonzalezmatheus@gmail.com")
    private String email;
    private UUID id;

    @Schema(example = "Matheus de Souza Gonzalez")
    private String name;

}
