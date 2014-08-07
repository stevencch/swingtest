/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oracle.cch.swingtest.services;

import com.oracle.cch.swingtest.Repositories.impl.exceptions.NonexistentEntityException;
import com.oracle.cch.swingtest.Repositories.impl.exceptions.PreexistingEntityException;
import com.oracle.cch.swingtest.entities.Product;

/**
 *
 * @author chacao
 */
public interface StoreService {
    void AddProduct(Product product) throws PreexistingEntityException, Exception;

    void DeleteProduct(Integer id) throws NonexistentEntityException;

    void UpdateProduct(Product product) throws NonexistentEntityException, Exception;
    
    public Product findProduct(Integer id);
    String SaidHello();
}
