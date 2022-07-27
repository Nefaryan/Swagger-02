package it.develhope.Swagger02.entities;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.lang.reflect.Array;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ArithmeticOperation {

    @ApiModelProperty(value = "Name of the operation",example = "Division")
    private String name;
    @ApiModelProperty(value = "Description of the operation",example = "Moltiplication is....")
    private String description;
    @ApiModelProperty(value = "Min number of operand for the operation",example = "2")
    private Integer minNumberOfOperands;
    @ApiModelProperty(value = "A array of propriety of the operation",example = "commutative,ecc...")
    private String[] properties;


}
