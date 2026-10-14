# 🏢 Sistema de Reserva de Salas

Projeto em Java que simula a reserva de salas, criado para praticar os pilares da
**Programação Orientada a Objetos (POO)**: encapsulamento, herança e polimorfismo.

## 📋 Sobre o projeto

O sistema controla a disponibilidade de salas e valida as reservas de acordo com a
capacidade e, no caso das salas de reunião, com a presença de projetor.

### Classes

| Classe | Descrição |
|--------|-----------|
| `Sala` | Classe base. Possui nome, disponibilidade e capacidade. Permite reservar e liberar a sala. |
| `SalaReuniao` | Herda de `Sala` e adiciona o atributo `possuiProjetor`. Sobrescreve `reservar()` para exigir projetor. |
| `App` | Classe principal com um exemplo de execução. |

### Regras de negócio

- **Sala comum:** a reserva só é feita se a sala estiver disponível **e** a quantidade
  de pessoas não ultrapassar a capacidade.
- **Sala de reunião:** além das regras acima, a sala precisa **possuir projetor**.
- Ao reservar com sucesso, a sala passa a ficar indisponível até ser liberada
  com `liberarSala()`.

## 🧠 Conceitos aplicados

- **Encapsulamento:** atributos privados com getters e setters.
- **Herança:** `SalaReuniao extends Sala`.
- **Polimorfismo:** uma variável do tipo `Sala` pode guardar um `SalaReuniao`, e o
  método `reservar()` executado é o da classe real do objeto (`@Override`).
- **Reuso de construtor:** uso de `super(...)` em `SalaReuniao`.

## 🚀 Como executar

**Pré-requisito:** JDK 8 ou superior instalado.

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/sistema-reserva-salas-java.git
cd sistema-reserva-salas-java

# Compile
javac *.java

# Execute
java App
```

## 💻 Exemplo de uso

```java
Sala s1 = new Sala("Sala 1", true, 8);
Sala s2 = new SalaReuniao("Sala 2", true, 20, false);

System.out.println(s1.reservar(6));   // true  -> sala disponível e cabe 6 pessoas
System.out.println(s2.reservar(15));  // false -> sala de reunião sem projetor
System.out.println(s1.reservar(2));   // false -> sala 1 já está reservada
```

### Saída esperada