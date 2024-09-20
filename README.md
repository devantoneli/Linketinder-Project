
# Linketinder

Programa Linketinder com o objetivo de realizar match entre empresa e candidato em torno de uma vaga, realizado por Raiza Antoneli Cavalcante dos Santos.

## Como executar

Para executar o programa, certifique-se de ter instalado o Groovy e o Java em seu sistema. Depois, acesse a pasta src do projeto pelo terminal e execute:

```bash
  groovy Main.groovy
```

## Comandos

#### Listar as empresas

```http
  1
```

#### Listar os candidatos

```http
  2
```

#### Cadastrar novo candidato

```http
  3
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `nome` | `string` | Nome do candidato|
| `email` | `string` | Email do candidato |
| `cpf` | `string` | CPF do candidato |
| `idade` | `int` | Idade do candidato |
| `estado` | `string` | Estado do candidato |
| `cep` | `string` | CEP do candidato |
| `descricao` | `string` | Descrição do candidato |
| `competencias` | `lista` | Lista de competencias do candidato |


#### Cadastrar nova empresa

```http
  4
```
| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `nome` | `string` | Nome da empresa|
| `email` | `string` | Email da empresa |
| `cnpj` | `string` | CNPJ da empresa |
| `pais` | `string` | Pais da empresa |
| `estado` | `string` | Estado da empresa |
| `cep` | `string` | CEP da empresa |
| `descricao` | `string` | Descrição da empresa |
| `competencias` | `lista` | Lista de competencias esperadas pela empresa |

#### Finalizar a execução do programa.

```http
  5
```

## Comentários

Para realizar o programa, foi pensado primeiramente em como seria guardado as informações, divindo-as em classes (Pessoa, Candidato e Empresa), depois, realizando o requisito do enunciado em guardar informações pre-cadastradas em arrays. Após isso, foi realizado o teste de inserção e só então a implementação do comando de inserir novos candidatos e novas empresas.
