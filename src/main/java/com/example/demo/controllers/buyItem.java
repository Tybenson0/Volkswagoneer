package com.example.demo.controllers;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.service.PartService;
import com.example.demo.service.PartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;


@Controller
public class buyItem {
    @Autowired
    private ProductService productService;
    @Autowired
    private PartService partService;

    /* I thought I  had to add a buy now for the parts also by mistake, so i just left the code here for fun :)
    @GetMapping("/buyPart")
    public String deletePart(@Valid @RequestParam("partID") int theId, Model theModel){
        Part part = partService.findById(theId);
            int currentInv = part.getInv();
            part.setInv(currentInv - 1);
            partService.save(part);
            return "confirmationdeleteproduct";
    }
    */

    @GetMapping("/buyProduct")
    public String buyProduct(@RequestParam("productID") int theId, Model theModel) {
        Product product = productService.findById(theId);
        int currentInv = product.getInv();
        if (currentInv > 0) {
            product.setInv(currentInv - 1);
            productService.save(product);
            return "purchaseSuccess";
        } else {
            return "purchaseFailure";
        }

    }

}
