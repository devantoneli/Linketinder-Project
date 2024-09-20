package classes

class Empresa extends Pessoa{
    String cnpj
    String pais

    Empresa(String nome, String email, String cnpj, String pais, String estado, String cep, String descricao, List<String> competencias) {
        super(nome, email, estado, cep, descricao, competencias)
        this.cnpj = cnpj
        this.pais = pais
    }

    @Override
    String toString() {
        return "Nome: ${nome}, Email Corporativo: ${email}, CNPJ: ${cnpj}, País: ${pais}, Estado: ${estado}, CEP: ${cep}, Descrição: ${descricao}, Competências: ${competencias.join(', ')}"
    }
}
