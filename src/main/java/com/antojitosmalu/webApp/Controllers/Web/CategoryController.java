package com.antojitosmalu.webApp.Controllers.Web;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.antojitosmalu.webApp.Domain.DTO.CategoryDTO;
import com.antojitosmalu.webApp.Domain.Services.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/categories")
public class CategoryController {
  @Autowired
  private CategoryService categoryService;

  @GetMapping("/all")
  public List<CategoryDTO> getAll() {
    return categoryService.getAll();
  }

  @GetMapping("/{id}")
  public CategoryDTO getById(@PathVariable("id") Integer id) {
    return categoryService.getById(id);
  }

  @PostMapping("/save")
  public CategoryDTO save(@RequestBody CategoryDTO categoryDTO) {
    return categoryService.save(categoryDTO);
  }

  @PutMapping("/update/{id}")
  public CategoryDTO update(@RequestBody CategoryDTO categoryDTO, @PathVariable("id") Integer id) {
    return categoryService.update(id ,categoryDTO);
  }

  @DeleteMapping("/delete/{id}")
  public void delete(@PathVariable("id") Integer id) {
    categoryService.delete(id);
  }
}
