/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oracle.cch.swingtest.services.impl;

import com.oracle.cch.swingtest.Repositories.impl.exceptions.NonexistentEntityException;
import com.oracle.cch.swingtest.Repositories.impl.exceptions.PreexistingEntityException;
import com.oracle.cch.swingtest.Respositories.ProductRepository;
import com.oracle.cch.swingtest.entities.Product;
import com.oracle.cch.swingtest.services.StoreService;

/**
 *
 * @author chacao
 */
public class StoreServiceImpl implements StoreService {

    private ProductRepository productRepository;

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
   

    @Override
    public String SaidHello() {
        return "hello";
    }

    @Override
    public void AddProduct(Product product) throws PreexistingEntityException, Exception {
        productRepository.create(product);
    }

    @Override
    public void DeleteProduct(Integer id) throws NonexistentEntityException {
        productRepository.destroy(id);
    }

    @Override
    public void UpdateProduct(Product product) throws NonexistentEntityException, Exception {
        productRepository.edit(product);
    }

    @Override
    public Product findProduct(Integer id) {
        return productRepository.findProduct(id);
    }
    
}
