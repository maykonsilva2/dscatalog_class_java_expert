backend/
├── pom.xml
└── ...

# No arquivo pom.xml

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-resources-plugin</artifactId>
    <version>3.1.0</version> <!--$NO-MVN-MAN-VER$ -->
</plugin>
```

O ``maven-resources-plugin`` é um plugin do Apache Maven que é usado para copiar e filtrar recursos (como arquivos de configuração, propriedades, etc.) do diretório de recursos para o diretório de destino durante o processo de construção do projeto. Ele é essencial para garantir que todos os recursos necessários estejam disponíveis no diretório de destino quando o projeto for construído.

# Como Funciona

``GroupId`` e ``ArtifactId``: Especifica o plugin do Maven que será usado (``org.apache.maven.plugins:maven-resources-plugin``).

``Version``: Define a versão do plugin que será utilizada (3.1.0)

#### o plugin copia os arquivos do diretório`` src/main/resources`` para o diretório de saída (``${project.build.directory}/classes``) e aplica a filtragem nos arquivos de recursos.