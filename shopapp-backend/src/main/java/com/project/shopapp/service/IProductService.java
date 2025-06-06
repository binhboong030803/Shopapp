package com.project.shopapp.service;

import com.project.shopapp.dtos.ProductDTO;
import com.project.shopapp.dtos.ProductImageDTO;
import com.project.shopapp.exceptions.DataNotFoundException;
import com.project.shopapp.models.Product;
import com.project.shopapp.models.ProductImage;
import com.project.shopapp.responses.ProductResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface IProductService {

    public Product createProduct(ProductDTO productDTO) throws DataNotFoundException;

     Product getProductById(long id) throws DataNotFoundException;

     Page<ProductResponse> getAllProduct(String keyword,Long categoryId,PageRequest pageRequest);

     Product updateProduct(long id,ProductDTO productDTO) throws DataNotFoundException;

     void deleteProduct(long id);

     boolean existsByName(String name);

     ProductImage createProductImage(Long id, ProductImageDTO productImageDTO) throws Exception;

     List<Product> findProductsByIds(List<Long> productIds);
}
