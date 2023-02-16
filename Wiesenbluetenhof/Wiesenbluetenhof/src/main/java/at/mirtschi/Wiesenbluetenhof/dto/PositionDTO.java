package at.mirtschi.Wiesenbluetenhof.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class PositionDTO {

    @Positive
    private Long id;

    @NotNull
    @PositiveOrZero
    private Long categoryId;

    @NotNull
    @PositiveOrZero
    private Long productId;

    @NotNull
    @Positive
    private Integer quantity;

}
