package com_spyra.expense_monitor.category;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/categories")
@RestController
public class CategoryController {

    private final CategoryService service;

    @PostMapping
    public Category addCategory(@RequestBody CategoryRequest request){
       return  service.createCategory(request.name()) ;
    }
}
