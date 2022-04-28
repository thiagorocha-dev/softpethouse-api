package br.com.softpethouse.api.user.dto;

import lombok.Data;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Schema(name = "User dto in", description = "User dto in")
public class UserDtoIn {

    @NotBlank(message = "Campo nome é obrigatório!")
    @Schema(title = "Name")
    @Parameter(description = "Name parameter")
    private String name;

    @NotNull(message = "Campo idade é obrigatório!")
    @Schema(title = "Age")
    @Parameter(description = "Age parameter")
    private int age;

}
