package br.com.matheusdev.gestaovagas.modules.company.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class CreateJobDTO {

    @Schema(example = "Vaga para pessoa desenvolvedora júnior", requiredMode = Schema.RequiredMode.REQUIRED)
    private String description;

    @Schema(example = "GymPass, Plano de saúde", requiredMode = Schema.RequiredMode.REQUIRED)
    private String benefits;

    @Schema(example = "Júnior", requiredMode = Schema.RequiredMode.REQUIRED)
    private String level;

}
