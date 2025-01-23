package com.devsuperior.dscatalog.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.repositories.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();    
    }
}

/* @Service: Anotação que indica que a classe é um componente que vai participe da injeção de dependência do Spring, ou seja, o Spring vai gerenciar a criação de instâncias dessa classe e vai injetar essas instâncias em outras classes que precisarem dela.
    ```java
        import org.springframework.stereotype.Service;
        @Service
    ```

    Injeção de dependência essa é uma váriavél do tipo CategoryRepository, para injetar a dependência do CategoryRepository dentro da classe CategoryService você deve colocar a annotation @Repository na classe CategoryRepository e a annotation @Autowired na váriavél repository da classe CategoryService.
    ```java
        import org.springframework.beans.factory.annotation.Autowired;
        @Autowired
        private CategoryRepository repository;
    ```
 * 
 */