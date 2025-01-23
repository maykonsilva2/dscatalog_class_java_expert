package com.devsuperior.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dscatalog.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}

/* 
    O código cria a camada de acesso a dados, que é responsável por acessar o banco de dados e realizar operações de leitura e escrita.
    ```java	
    public interface CategoryRepository extends JpaRepository<Category, Long> {}
    ````


   interface 
    - Uma interface é tipo um contrato, por exemplo uma classe Personagem  dentro dessa classe tem os métodos andar() e  atacar(), toda vez que uma classe implementar a interface Personagem ela é obrigada a implementar os métodos andar() e atacar().
        ```java	
        public interface Personagem {
            void andar();
            void atacar();
        }

        public class Guerreiro implements Personagem {
            @Override
            public void andar() {
                System.out.println("Guerreiro andando");
            }

            @Override
            public void atacar() {
                System.out.println("Guerreiro atacando");
            }
        }
        ```
 * 
 * JpaRepository<>
 * - JpaRepository é uma interface do Spring Data JPA que fornece métodos CRUD
 * (Create, Read, Update, Delete) prontos para uso. Ao estender(extends) de JpaRepository,
 * você ganha acesso a esses métodos sem precisar escrevê-los manualmente.
 * JpaRepository<T, ID> ele é um tipo genérico que recebe dois tipos de dados, o
 * primeiro é o tipo da entidade que será gerenciada pelo repositório e o
 * segundo
 * é o tipo do ID da entidade. No código passamos a entidade Category e o tipo do ID
 * que é Long, a entidade category foi criada no pacote entities por você.
 * 
 * @Repository
 * - A anotação @Repository é usada para indicar que a classe é um repositório
 *      ```java
 *          import org.springframework.stereotype.Repository;
 *         @Repository
 *     ```
 */