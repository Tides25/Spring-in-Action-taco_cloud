package tacos.component;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Other {

    @NotNull(message = "null input is invalid")
    private String input;
}
