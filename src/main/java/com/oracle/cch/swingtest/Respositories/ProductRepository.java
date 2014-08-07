/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oracle.cch.swingtest.Respositories;

import com.oracle.cch.swingtest.Repositories.impl.exceptions.NonexistentEntityException;
import com.oracle.cch.swingtest.Repositories.impl.exceptions.PreexistingEntityException;
import com.oracle.cch.swingtest.entities.Product;
import java.util.List;

/**
 *
 * @author chacao
 */
public interface ProductRepository {

    void create(Product product) throws PreexistingEntityException, Exception;

    void destroy(Integer id) throws NonexistentEntityException;

    void edit(Product product) throws NonexistentEntityException, Exception;

    Product findProduct(Integer id);

    List<Product> findProductEntities();

    List<Product> findProductEntities(int maxResults, int firstResult);

    int getProductCount();
    
}
