package guru.springfamework.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VendorDTO {
    private String name;
    @JsonProperty("vendor_url")
    private String vendorUrl;
}
