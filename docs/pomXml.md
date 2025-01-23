# Help

backend/pom.xml

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <version>3.8.1</version>
    <configuration>
        <source>21</source>
        <target>21</target>
    </configuration>
</plugin>
```

#### Explicação:

``<groupId>``: Especifica o grupo do plugin. org.apache.maven.plugins é o grupo para plugins oficiais do Maven.

``<artifactId>``: Especifica o nome do plugin. maven-compiler-plugin é o plugin responsável pela compilação do código-fonte Java.

``<version>``: Especifica a versão do plugin. 3.8.1 é a versão do maven-compiler-plugin que está sendo usada.

``<configuration>``: Bloco onde você pode definir configurações específicas para o plugin.

``<source>``: Especifica a versão do código-fonte Java que você está usando. 21 indica que o código-fonte está escrito para a versão 21 do Java.

``<target>``: Especifica a versão do bytecode Java que será gerado. 21 indica que o bytecode será compatível com a versão 21 do Java.

#### O que ele faz:

Compilação do código-fonte: O maven-compiler-plugin compila os arquivos .java em arquivos .class que podem ser executados pela JVM.

Configuração da versão do Java: As configurações ``<source>`` e ``<target>`` garantem que o código-fonte seja compilado usando a versão especificada do Java (neste caso, Java 21).

#### Versão do Maven:

A versão do Maven (3.9.9) que você está usando não afeta diretamente a configuração do maven-compiler-plugin. O plugin é uma ferramenta separada que o Maven usa durante o processo de build. A versão do Maven que você está usando deve ser compatível com a versão do plugin que você especificou.




# Help
```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-resources-plugin</artifactId>
    <version>3.1.0</version> <!--$NO-MVN-MAN-VER$ -->
</plugin>
```

O ``maven-resources-plugin`` é um plugin do Apache Maven que é usado para copiar e filtrar recursos (como arquivos de configuração, propriedades, etc.) do diretório de recursos para o diretório de destino durante o processo de construção do projeto. Ele é essencial para garantir que todos os recursos necessários estejam disponíveis no diretório de destino quando o projeto for construído.

# Como Funciona

- ``GroupId`` e ``ArtifactId``: Especifica o plugin do Maven que será usado (``org.apache.maven.plugins:maven-resources-plugin``).

- ``Version``: Define a versão do plugin que será utilizada (3.1.0)

 o plugin copia os arquivos do diretório`` src/main/resources`` para o diretório de saída (``${project.build.directory}/classes``) e aplica a filtragem nos arquivos de recursos.

Você pode encontrar essa informação nos seguintes links:

A página de introdução do plugin explica que o Resources Plugin trata da cópia dos recursos do projeto para o diretório de saída, distinguindo entre recursos principais e de teste [Apache Maven Resources Plugin – Introduction](https://maven.apache.org/plugins/maven-resources-plugin/)
A página de exemplos do plugin mostra como a filtragem é aplicada aos recursos, resultando na criação de saídas filtradas no diretório de build [Apache Maven Resources Plugin – Filtering](https://maven.apache.org/plugins/maven-resources-plugin/examples/filter.html).
A documentação específica do objetivo copy-resources detalha como copiar recursos que não estão no layout padrão do Maven ou não foram declarados [Copy Resources - Apache Maven](https://maven.apache.org/components/plugins/maven-resources-plugin/examples/copy-resources.html).


# Help
```xml
<!-- Plugin para compilar o código-fonte Java -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version> <!-- Modificação: Alteração da versão do plugin -->
                <executions> <!-- Modificação: Adição das execuções do plugin -->
                    <execution>
                        <id>default-compile</id>
                        <phase>compile</phase>
                        <goals>
                            <goal>compile</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>default-testCompile</id>
                        <phase>test-compile</phase>
                        <goals>
                            <goal>testCompile</goal>
                        </goals>
                    </execution>
                </executions>
                <configuration>
                    <source>21</source>
                    <target>21</target>
                </configuration>
            </plugin>
```

#### Adição das execuções do plugin maven-compiler-plugin:

### O que faz:
 Define as execuções do plugin para cobrir as fases de compilação (``compile``) e compilação de testes (``test-compile``) do ciclo de vida do Maven.
Por que foi feita: Garante que o plugin ``maven-compiler-plugin`` seja executado nas fases corretas do ciclo de vida do Maven, evitando erros de configuração.