package com.devsuperior.dscatalog.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
/*
 * aula 10
 * Em uma arquitetura RESTful, os controladores REST são geralmente
 * representados por classes de recursos(resources).
 * Então por conversão sempre que um recourso for criado, a classe que o
 * representa deve ser nomeada com o nome do recurso + Resource.
 * 
 * @RestController: Anotação(annotation) que indica que a classe é um
 * controlador REST, está
 * dizendo ao Spring que esta classe é um controlador e que o retorno dos
 * métodos devem ser automaticamente serializado para forma a resposta do corpo
 * da requisição.
 * 
 * 
 * - @RestController é uma combinação das anotações @Controller e @ResponseBody.
 * - @Controller: Indica que a classe é um controlador Spring MVC(um
 * controlador que lida com requisições HTTP do cliente)
 * - @ResponseBody: Indica que o valor retornado pelo método deve ser
 * serializado automaticamente para o corpo da resposta HTTP, o Spring
 * converterá o retorno dos métodos para JSON ou XML, dependendo do que for
 * configurado.
 * 
 * @RequestMapping: Anotação que mapeia requisições HTTP, ou seja, define qual
 * URL será associada a um método específico.
 * Dica: Endpoints RESTful devem ser nomeados no plural, endpoints são os
 * caminhos que a aplicação disponibilizara para serem acessados.
 * 
 * @GetMapping: Define que o método será chamado quando houver uma requisição do
 * tipo GET para o endpoint("/categories").
 * 
 * ResponseEntity: É um tipo especial do Spring que já encapsula uma resposta
 * HTTP, ele é um tipo genérico que recebe um tipo de dado, ou seja, o tipo de
 * dado que será retornado no corpo da resposta dentro <>
 * - ResponseEntity.ok(): Método que retorna uma resposta de sucesso com o
 * código 200.
 * - ResponseEntity.notFound(): Método que retorna uma resposta de erro com o
 * código 404.
 * - ResponseEntity.status(HttpStatus): Método que retorna uma resposta com um
 * código HTTP específico.
 * - ResponseEntity.ok().body(): Método que retorna o corpo da resposta.
 * 
 * 
 * 
 * Usando injenção de dependência para acessar o serviço CategoryService, para pegar a lista de categorias.
    ```java
    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    ```
    - Onde @Autowired é uma anotação que indica que a instância de CategoryService será injetada automaticamente pelo Spring.
    - O método findAll() chama o método findAll() do serviço CategoryService e retorna a lista de categorias.
    - ResponseEntity.ok().body(list) retorna uma resposta de sucesso com a lista de categorias no corpo da resposta.
    - Com isso seguimos a a arquitetura RESTful, aonde o CONTROLADOR REST é responsável por receber as requisições, ae a camada de serviço é responsável por realizar a lógica de negócio, e a camada de acesso a dados é responsável por acessar o banco de dados.
 */