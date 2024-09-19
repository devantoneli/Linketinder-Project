package classes

class Candidato extends Pessoa{
    String cpf
    int idade
    List<String> competencias = []

    Candidato(String nome, String email, String cpf, int idade, String estado, String cep, String descricao, List<String> competencias) {
        super(nome, email, estado, cep, descricao, competencias)
        this.cpf = cpf
        this.idade = idade
        this.competencias = competencias
    }

    @Override
    String toString() {
        return "Nome: ${nome}, Email: ${email}, CPF: ${cpf}, Idade: ${idade}, Estado: ${estado}, CEP: ${cep}, Descrição: ${descricao}, Competências: ${competencias.join(', ')}"
    }
}