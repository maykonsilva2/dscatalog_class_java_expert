package com.devsuperior.dscatalog.entities;

import java.io.Serializable;

public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    public Category(){

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

// stop aula 8 proxima aula 9
/*
    Esse é um construtor padrão, Este construtor não faz nada e não aceita nenhum argumento. Ele simplesmente permite que você crie um objeto Category sem inicializar os campos id e name.

     public Category(){

    }

    Dica: para criar os Getters e Setters de forma rápida, clica botão direito>Source Action>Generate Getter and Setter
    Dica: para criar o construtor de forma rápida, clica botão direito>Source Action>Generate Constructor

    Função hashCode e equals: 
    essas funções garantem que cada objeto tenha um identificador único dentro de uma coleção, permitindo armazenamento e recuperação eficientes.
    hashCode é usado para alocar eficientemente o objeto em uma coleção, enquanto equals é usado para verificar a igualdade e manter a unicidade dos objetos na coleção.


    implements Serializable {
    private static final long serialVersionUID = 1L;
    
        - A implementação Serializable, permite que objetos dessa classe sejam convertidos em uma sequência de bytes, o que facilita o processo de serialização. Isso é útil para salvar objetos em arquivos, enviar objetos em redes ou armazená-los em bancos de dados.
        -O serialVersionUID é um identificador único para cada classe serializável. É usado durante a deserialização para verificar que o remetente e o receptor de um objeto serializado têm classes carregadas que são compatíveis em relação à serialização.
        Se você alterar a classe de alguma forma (por exemplo, adicionando novos campos), é recomendável alterar o serialVersionUID. Se você não fizer isso, poderá ter problemas ao deserializar objetos antigos que foram serializados com uma versão anterior da classe.
 */