package sit.int221.Integrated.controllers;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sit.int221.Integrated.models.Products;
import sit.int221.Integrated.repositories.BrandsRepository;
import sit.int221.Integrated.repositories.ColorsRepository;
import sit.int221.Integrated.repositories.ProductcolorRepository;
import sit.int221.Integrated.repositories.ProductsRepository;

import java.util.List;

//@CrossOrigin(origins = {"http://localhost:80"})
@RestController
public class RestControllers {
    @Autowired
    private ProductsRepository productsRepository;
    @Autowired
    private BrandsRepository brandsRepository;
    @Autowired
    private ProductcolorRepository productcolorsRepository;
    @Autowired
    private ColorsRepository colorsRepository;

    @GetMapping("/api/productWithPage")
    public List<Products> productWithPage(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "5") Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNo, pageSize );
        Page<Products> pageResult = productsRepository.findAll(pageable);
        return pageResult.getContent();
    }

}
