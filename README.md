

```markdown
#  Projeto Final — Sistema de Cadastro e Notificação de Eventos

Este projeto foi desenvolvido como requisito para aprovação na unidade curricular **Programação de Soluções Computacionais** do curso de **Bacharelado em Ciência da Computação** da **UNISUL**.

---
#  Projeto Final — Sistema de Cadastro e Notificação de Eventos

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Java](https://img.shields.io/badge/Java-17+-red?logo=java&logoColor=white)](https://www.oracle.com/java/)
[![Gradle](https://img.shields.io/badge/Gradle-8%2B-02303A?logo=gradle)](https://gradle.org/)




##  Descrição

Sistema em Java com interface via console para **cadastro, consulta e notificação de eventos** na cidade do usuário. O programa permite:

- Cadastro de usuários com seus respectivos dados;
- Criação e listagem de eventos (festas, shows, esportivos etc.);
- Participação e cancelamento de presença em eventos;
- Ordenação dos eventos por data e hora;
- Notificação de eventos que estão ocorrendo no momento;
- Armazenamento e carregamento de dados a partir de arquivos `.data`.

---

##  Objetivos de Aprendizagem

- Aplicar os princípios da **programação orientada a objetos (POO)**;
- Estruturar projetos em **camadas (MVC)**;
- Trabalhar com **leitura e escrita de arquivos** em Java;
- Utilizar **coleções**, **datas** e **enums** de forma prática;
- Usar ferramentas modernas como **Git**, **Gradle** e **IntelliJ IDEA** no ciclo completo de desenvolvimento.

---

##  Tecnologias Utilizadas

- Java 17+
- Gradle 8+
- Git e GitHub
- IntelliJ IDEA (ou outra IDE de preferência)
- Armazenamento local via `.data` (modo texto)

---

##  Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/rfgunther/projFinal.git
   cd projFinal
   ```

2. Compile e execute via Gradle:
   ```bash
   ./gradlew build
   ./gradlew run
   ```

3. Ou, abra o projeto no IntelliJ e execute a classe `App.java`.

---

## 📂 Estrutura do Projeto

```
src/
  main/
    java/
      model/
      service/
      storage/
      App.java
  resources/
events.data
build.gradle
```

---

##  Licença

Este projeto está licenciado sob os termos da [MIT License](LICENSE).

---

##  Autor

Rudolf Fischer Günther  
[GitHub](https://github.com/rfgunther)

