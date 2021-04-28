package guru.springfamework.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VendorDTO {
    @ApiModelProperty(value = "name of vendor")
    private String name;
    @ApiModelProperty(value = "vendor's url")
    @JsonProperty("vendor_url")
    private String vendorUrl;
}
