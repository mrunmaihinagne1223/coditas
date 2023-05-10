package com.example.apispring.controller;

import com.example.apispring.model.Product;
import com.example.apispring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TestController {
   // @Autowired
    private  BookService bookService;

    public TestController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/test")
    public List<Product> getAllProduct(){

      return this.bookService.getProductList();

    }
    @GetMapping("/test/{id}")
    public Product getAllProductByID(@PathVariable("id") int id){

        return this.bookService.getProductId(id);

    }
    @PostMapping("/test/addproduct")
    public Product addAllProduct(@RequestBody Product product){

        Product p=this.bookService.addProduct(product);
        return p;

    }
    @DeleteMapping("/tests/{bookid}")
    public void deletAllProductbyId(@PathVariable("bookid") int bookid){
        this.bookService.deletProduct(bookid);
    }
    @PutMapping("/testup/{upid}")
    public Product updateProductbyId(@RequestBody Product p,@PathVariable("upid") int upid){
        this.bookService.updateProduct(p,upid);

        return p;
    }




}
