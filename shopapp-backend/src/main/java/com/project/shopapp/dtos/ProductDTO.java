package com.project.shopapp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {
    @NotBlank(message = "Title is requỉed")
    @Size(min = 3,max = 200,message = "Title must be between 3 and 200 character")
    private String name;

    @Min(value = 0,message = "Price must be greater than or equal to 0")
    @Max(value = 10000000,message = "Price must be greater than or equal to 10000000")
    private Float price;
    private String thumbnail;
    private String description;
    @JsonProperty("category_id")
    private Long categoryID;

}
