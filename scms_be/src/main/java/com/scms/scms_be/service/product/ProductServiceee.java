package com.scms.scms_be.service.product;

import java.io.IOException;
import java.util.List;

import com.scms.scms_be.dto.ProductDto;

public interface ProductServiceee {

    ProductDto addProduct(ProductDto productDto) throws IOException; ;

    List<ProductDto> getAllProduct();

    ProductDto updateProduct(Integer productId, ProductDto productDto) throws IOException;

    ProductDto getProductById(Integer productId);
}
