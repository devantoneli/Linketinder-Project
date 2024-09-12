class Pessoa {
  String nome
  String email
  String estado
  String cep
  String descricao
  List<String> competencias = []

  Pessoa(String nome, String email, String estado, String cep, String descricao, List<String> competencias) {
    this.nome = nome
    this.email = email
    this.estado = estado
    this.cep = cep
    this.descricao = descricao
    this.competencias = competencias
  }
}

class Candidato extends Pessoa{
  String cpf
  int idade
  List<String> competencias = []

  Candidato(String nome, String email, String cpf, int idade, String estado, String cep, String descricao, List<String> competencias) {
    super(nome, email, estado, cep, descricao, competencias)
    this.cpf = cpf
    this.idade = idade

  }

  @Override
  String toString() {
    return "Nome: ${nome}, Email: ${email}, CPF: ${cpf}, Idade: ${idade}, Estado: ${estado}, CEP: ${cep}, Descrição: ${descricao}, Competências: ${competencias.join(', ')}"
  }
}

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

def candidatos = [
        new Candidato("Ana", "ana@example.com", "12345678901", 28, "São Paulo", "01234567", "Desenvolvedora com experiência em várias linguagens.", ["Python", "Java", "Spring Framework"]),
        new Candidato("Carlos", "carlos@example.com", "23456789012", 35, "Rio de Janeiro", "23456789", "Especialista em frontend com foco em Angular.", ["Angular", "JavaScript", "HTML/CSS"]),
        new Candidato("Maria", "maria@example.com", "34567890123", 29, "Minas Gerais", "34567890", "Desenvolvedora Java com experiência em Spring Boot.", ["Java", "Spring Boot", "SQL"]),
        new Candidato("João", "joao@example.com", "45678901234", 31, "Bahia", "45678901", "Engenheiro de software com foco em Python e machine learning.", ["Python", "Machine Learning", "Data Science"]),
        new Candidato("Pedro", "pedro@example.com", "56789012345", 27, "São Paulo", "56789012", "Desenvolvedor full stack com conhecimento em várias tecnologias.", ["Java", "JavaScript", "Spring Framework"])
]

def empresas = [
        new Empresa("TechCorp", "contato@techcorp.com", "12345678000195", "Brasil", "São Paulo", "12345678", "Empresa de tecnologia com foco em soluções inovadoras.", ["Java", "Python", "Spring Framework"]),
        new Empresa("WebSolutions", "suporte@websolutions.com", "23456789000198", "Brasil", "Rio de Janeiro", "23456789", "Especializada em desenvolvimento web e design.", ["Angular", "React", "JavaScript"]),
        new Empresa("DataInsights", "contato@datainsights.com", "34567890000199", "Brasil", "Minas Gerais", "34567890", "Consultoria em análise de dados e BI.", ["Python", "SQL", "Machine Learning"]),
        new Empresa("Innovatech", "info@innovatech.com", "45678901000191", "Brasil", "Bahia", "45678901", "Foco em inovação tecnológica e desenvolvimento de software.", ["Java", "Spring Boot", "Data Science"]),
        new Empresa("GlobalNet", "contact@globalnet.com", "56789012000192", "Brasil", "São Paulo", "56789012", "Soluções em rede e segurança da informação.", ["Network Security", "Cloud Computing", "DevOps"] )
]


Scanner ler = new Scanner(System.in)

print """menu:
1. Listar Candidatos
2. Listar Empresas
3. Sair
Escolha uma opção: """;

String comando = ler.nextLine();
switch (comando) {
    case "1":
        candidatos.each { println it };
        break
    case "2":
        empresas.each { println it }
        break
    case "3":
        println "Programa finalizado."
        break
    default:
        println "Opção inválida. Tente novamente."
        break
}

