package atu.ie.week4cicd;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController{

    List<Person> productList = new ArrayList<>();

   @GetMapping("/getProducts")
    public List<Person> getProducts()
    {
        return productList;
    }
    @PostMapping("/addProducts")
    public List<Person> addProducts(@Valid @RequestBody Person product)
    {
        productList.add(product);
        return productList;
    }
}
