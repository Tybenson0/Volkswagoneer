package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private boolean flag = true;
    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {


            if (outsourcedPartRepository.count() < 1) {
                OutsourcedPart part1 = new OutsourcedPart();
                part1.setCompanyName("ECS Tuning");
                part1.setName("Axle");
                part1.setInv(15);
                part1.setPrice(150.0);
                part1.setId(100L);
                part1.setMinInv(0);
                part1.setMaxInv(20);
                outsourcedPartRepository.save(part1);
                OutsourcedPart part2 = new OutsourcedPart();
                part2.setCompanyName("FCP Euro");
                part2.setName("Rims");
                part2.setInv(8);
                part2.setPrice(200.0);
                part2.setId(101L);
                part2.setMinInv(0);
                part2.setMaxInv(12);
                outsourcedPartRepository.save(part2);
                OutsourcedPart part3 = new OutsourcedPart();
                part3.setCompanyName("Urotuning");
                part3.setName("Exhaust Kit");
                part3.setInv(3);
                part3.setPrice(300.0);
                part3.setId(102L);
                part3.setMinInv(0);
                part3.setMaxInv(5);
                outsourcedPartRepository.save(part3);
                OutsourcedPart part4 = new OutsourcedPart();
                part4.setCompanyName("FCP Euro");
                part4.setName("Windshield Wipers");
                part4.setInv(30);
                part4.setPrice(10.0);
                part4.setId(103L);
                part4.setMinInv(0);
                part4.setMaxInv(50);
                outsourcedPartRepository.save(part4);
                OutsourcedPart part5 = new OutsourcedPart();
                part5.setCompanyName("Urotuning");
                part5.setName("brakes");
                part5.setInv(11);
                part5.setPrice(50.0);
                part5.setId(104L);
                part5.setMinInv(0);
                part5.setMaxInv(30);
                outsourcedPartRepository.save(part5);
            }



        if (productRepository.count() < 1) {
                Product GTI= new Product("GTI",2000.0,15);
                Product Tiguan= new Product("TIGUAN",5000.0,5);
                Product Jetta= new Product("JETTA",4000.0,8);
                Product Passat= new Product("PASSAT",6000.0,10);
                Product Golf = new Product("GOLF",2000.0,13);
                productRepository.save(GTI);
                productRepository.save(Tiguan);
                productRepository.save(Jetta);
                productRepository.save(Passat);
                productRepository.save(Golf);

        }


                 /*
                OutsourcedPart thePart = null;
                List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
                for (OutsourcedPart part : outsourcedParts) {
                    if (part.getName().equals("out test")) thePart = part;
                }
                */

       // System.out.println(thePart.getCompanyName());

        /*
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }
        */




        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
