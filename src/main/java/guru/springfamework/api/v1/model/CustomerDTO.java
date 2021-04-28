package guru.springfamework.api.v1.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CustomerDTO {

    @ApiModelProperty(value = "This is the first name", required = true)
    String firstname;
    @ApiModelProperty(required = false, value = "This is the last name.")
    String lastname;
    String customer_url;
}
