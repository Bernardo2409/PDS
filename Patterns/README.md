# Design Patterns - Refactoring Guru Examples

Este projeto contém exemplos de todos os 22 padrões de design do GoF (Gang of Four), baseados nos exemplos do [Refactoring Guru](https://refactoring.guru/design-patterns).

## Padrões Implementados

### Creational Patterns (5)
| Padrão | Descrição |
|--------|-----------|
| `Abstract_Factory` | Cria famílias de objetos relacionados sem especificar classes concretas |
| `Builder` | Constrói objetos complexos passo a passo |
| `Factory_Method` | Define interface para criar objetos, deixando subclasses escolherem o tipo |
| `Prototype` | Cria novos objetos copiando protótipos existentes |
| `Singleton` | Garante apenas uma instância de uma classe |

### Structural Patterns (7)
| Padrão | Descrição |
|--------|-----------|
| `Adapter` | Converte interface de uma classe para outra esperada pelos clientes |
| `Bridge` | Separa abstração da implementação |
| `Composite` | Compõe objetos em estruturas de árvore |
| `Decorator` | Adiciona responsabilidades a objetos dinamicamente |
| `Facade` | Interface simplificada para um subsistema complexo |
| `Flyweight` | Compartilha objetos para suportar grande quantidade eficientemente |
| `Proxy` | Substituto que controla acesso ao objeto original |

### Behavioral Patterns (10)
| Padrão | Descrição |
|--------|-----------|
| `Chain_of_Responsibility` | Passa pedido através de uma cadeia de handlers |
| `Command` | Encapsula pedido como objeto |
| `Iterator` | Acessa elementos de coleção sequencialmente |
| `Mediator` | Define objeto que encapsula interações entre objetos |
| `Memento` | Captura e restaura estado interno de objeto |
| `Observer` | Define dependência um-para-muitos entre objetos |
| `State` | Altera comportamento quando estado interno muda |
| `Strategy` | Define família de algoritmos intercambiáveis |
| `Template_Method` | Define esqueleto de algoritmo, delegando passos a subclasses |
| `Visitor` | Define nova operação sem alterar classes dos elementos |

## Como Executar

Cada padrão tem uma classe `Main.java` com exemplo executável:

```bash
cd src
javac PatternName/*.java
java PatternName.Main
```

## Folder Structure

- `src`: código fonte dos padrões
- `bin`: ficheiros compilados
- `lib`: dependências (se necessário)
