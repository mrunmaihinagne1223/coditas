package com.example.apispring.service;

import com.example.apispring.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {
    private  BookService bookService;
    private static List<Product>productList = new ArrayList<>();

    static {
        productList.add(new Product(123L,"ball"));
        productList.add(new Product(322L,"bat"));
        productList.add(new Product(55566L,"beach"));
        productList.add(new Product(7676L,"door"));

    }
    public List<Product> getProductList(){
        return productList;
    }
    public Product getProductId(int id){
        Product product = null;
        product=productList.stream().filter(e->e.getProductId()==id).findFirst().get();
        return product;
    }
    public Product addProduct(Product  product){

       productList.add(product);
        return product;
    }
    public void deletProduct(int  bid){
       productList.stream().filter(p ->p.getProductId()!= bid).collect(Collectors.toList());
//        Product existingemployee = productList.findById(id).orElseThrow(
//                () -> new ResourceNotFoundException("Employee", "id", id));
//        employeeRepository.deleteById(id);
    }
    public void updateProduct(Product p,int upid){
       productList.stream().map(b->{
           if(b.getProductId()==upid){
               b.setProductName(p.getProductName());
           }
           return b;
       }).collect(Collectors.toList());
    }
}
