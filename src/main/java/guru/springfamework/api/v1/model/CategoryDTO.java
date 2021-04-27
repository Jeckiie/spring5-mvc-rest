package guru.springfamework.api.v1.model;

import guru.springfamework.api.v1.mapper.CategoryMapper;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jt on 9/24/17.
 */
@Data
public class CategoryDTO {
    private Long id;
    private String name;
}
