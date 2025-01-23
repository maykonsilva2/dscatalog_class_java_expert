package com.devsuperior.dscatalog.entities;

import java.io.Serial;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_category")
public class Category implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Category() {

    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Category other = (Category) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}

/*
 * Esse é um construtor padrão, Este construtor não faz nada e não aceita nenhum
 * argumento. Ele simplesmente permite que você crie um objeto Category sem
 * inicializar os campos id e name.
 * 
 * public Category(){
 * 
 * }
 * 
 * Dica: para criar os Getters e Setters de forma rápida, clica botão
 * direito>Source Action>Generate Getter and Setter
 * Dica: para criar o construtor de forma rápida, clica botão direito>Source
 * Action>Generate Constructor
 * 
 * Função hashCode e equals:
 * essas funções garantem que cada objeto tenha um identificador único dentro de
 * uma coleção, permitindo armazenamento e recuperação eficientes.
 * hashCode é usado para alocar eficientemente o objeto em uma coleção, enquanto
 * equals é usado para verificar a igualdade e manter a unicidade dos objetos na
 * coleção.
 * 
 * NOTE: Podemos criar de forma rápida o hashCode e equals, clicando botão
 * direito>Source Action>Generate hashCode() and equals()...
 * 
 * 
 * implements Serializable {
 * private static final long serialVersionUID = 1L;
 * 
 * - A implementação Serializable, permite que objetos dessa classe sejam
 * convertidos em uma sequência de bytes, o que facilita o processo de
 * serialização. Isso é útil para salvar objetos em arquivos, enviar objetos em
 * redes ou armazená-los em bancos de dados.
 * -O serialVersionUID é um identificador único para cada classe serializável. É
 * usado durante a deserialização para verificar que o remetente e o receptor de
 * um objeto serializado têm classes carregadas que são compatíveis em relação à
 * serialização.
 ** Se você alterar a classe de alguma forma (por exemplo, adicionando novos
 * campos), é recomendável alterar o serialVersionUID. Se você não fizer isso,
 * poderá ter problemas ao deserializar objetos antigos que foram serializados
 * com uma versão anterior da classe.
 * 
 * Atualizar o serialVersionUID automaticamente:
 * Intale a extensão "Java Extension pack".
 * vá na classe e clique com o botão direito>Source Action>Generate Serial
 * Version UID
 * ou Pressione ctrl+shift+P e digite "Java: Generate Serial Version UID"
 * 
 * @Serial
 * - A anotação @Serial foi introduzida no Java 14 para marcar explicitamente
 * elementos relacionados à serialização. Ela é usada para indicar que um campo
 * ou método está relacionado ao processo de serialização. No seu exemplo, a
 * anotação @Serial é usada para marcar o campo serialVersionUID.
 * 
 * 
 * @Entity
 * - A anotação @Entity ela informa ao JPA que uma classe é uma entidade,
 * significa qie a classe representa um TABELA no banco de dados e cada
 * instância da classe representa uma LINHA nessa tabela.
 * 
 * @Table
 * - Caso a tabela possua um nome diferente, podemos estabelecer esse mapeamento
 * com a anotação @Table
 * 
 * @Id
 * - Anotação @Id: Indica o campo id como a chave primária.
 * 
 * @GeneratedValue
 * - Anotação @GeneratedValue: Especifica que o valor do id será gerado
 * automaticamente pelo banco de dados.
 */