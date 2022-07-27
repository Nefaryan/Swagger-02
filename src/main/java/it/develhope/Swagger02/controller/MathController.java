package it.develhope.Swagger02.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.develhope.Swagger02.entities.ArithmeticOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Math")
public class MathController {

    String[] divisionPropiety = new String[]{"distributiva","invariativa"};

    @GetMapping(value ="")
    @ApiOperation(value = "greet the user",notes = "Print a welcome message")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponse(code = 500, message = "INTERNAL SERVER ERROR")
    public String welcomeMathMsg(){
        return "Welcome to math controller";
    }

    @GetMapping(value ="/division-info")
    @ApiOperation(value ="Division Proprieties",notes = "exposes the properties of the division")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({@ApiResponse(code = 400, message = "BAD INPUT"),
                   @ApiResponse(code = 404, message = "PAGE NOT FOUND"),
                   @ApiResponse(code = 500, message = "INTERNAL SERVER ERROR")})
    public ArithmeticOperation division(){
        return new ArithmeticOperation("Division","operazione inversa alla moltiplicazione",2,divisionPropiety);
    }

    @GetMapping(value = "/multiplication")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Moltiplication",notes = "Molpicate 2 numeber ")
    @ApiResponses({@ApiResponse(code = 400, message = "BAD INPUT"),
            @ApiResponse(code = 404, message = "PAGE NOT FOUND"),
            @ApiResponse(code = 500, message = "INTERNAL SERVER ERROR")})
    public Integer moltiplication(@RequestParam(required = true) Integer int1 ,@RequestParam(required = true) Integer int2){
        Integer result = (int1 * int2);
        return result;
    }

    @GetMapping(value = "/square{n}")
    @ApiOperation(value = "square",notes = "Return a square of the number" )
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({@ApiResponse(code = 400, message = "BAD INPUT"),
            @ApiResponse(code = 404, message = "PAGE NOT FOUND"),
            @ApiResponse(code = 500, message = "INTERNAL SERVER ERROR")})
    public Integer square(@RequestParam(required = true)Integer integer){
        return integer*integer;
    }






}
