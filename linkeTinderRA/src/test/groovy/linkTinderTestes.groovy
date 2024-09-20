import classes.*
import spock.lang.Specification


class linkTinderTestes extends Specification{
    static Empresa Empresa
    static Candidato Candidato

    void "testeSetCandidato"() {
        given:
        String nome = "Lucas Almeida"
        int idade = 25
        String cpf = "525789665418"
        String email = "lucas.almeida@gmail.com"
        String cep = "11235562"
        String descricao = "Sou desenvolvedor pleno em busca de oportunidades no exterior"
        String estado = "Sao Paulo"
        List<String> competencias = ["PHP", "Java", "Css"]

        when:
        Candidato candidato = new Candidato(nome, email, cpf, idade , estado, cep, descricao, competencias)

        then:
        candidato.nome == nome
        candidato.idade == idade
        candidato.email == email
        candidato.cpf == cpf
        candidato.idade == idade
        candidato.cep == cep
        candidato.estado == estado
        candidato.descricao == descricao
        candidato.competencias == competencias
    }

    void "testeSetEmpresa"() {
        given:
        String nome = "Tech Solutions"
        String email = "contato@techsolutions.com"
        String cnpj = "12345678000195"
        String pais = "Brasil"
        String estado = "São Paulo"
        String cep = "11235562"
        String descricao = "Empresa de tecnologia em busca de novos talentos"
        List<String> competencias = ["Desenvolvimento", "Consultoria", "Suporte"]

        when:
        Empresa empresa = new Empresa(nome, email, cnpj, pais, estado, cep, descricao, competencias)

        then:
        empresa.nome == nome
        empresa.email == email
        empresa.cnpj == cnpj
        empresa.pais == pais
        empresa.estado == estado
        empresa.cep == cep
        empresa.descricao == descricao
        empresa.competencias == competencias
    }
}
