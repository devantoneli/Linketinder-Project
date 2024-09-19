package interfaces

import classes.*

class Main {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in)

        def empresas = [
                new Empresa("TechCorp", "contato@techcorp.com", "12345678000195", "Brasil", "São Paulo", "12345678", "interfaces.Empresa de tecnologia com foco em soluções inovadoras.", ["Java", "Python", "Spring Framework"]),
                new Empresa("WebSolutions", "suporte@websolutions.com", "23456789000198", "Brasil", "Rio de Janeiro", "23456789", "Especializada em desenvolvimento web e design.", ["Angular", "React", "JavaScript"]),
                new Empresa("DataInsights", "contato@datainsights.com", "34567890000199", "Brasil", "Minas Gerais", "34567890", "Consultoria em análise de dados e BI.", ["Python", "SQL", "Machine Learning"]),
                new Empresa("Innovatech", "info@innovatech.com", "45678901000191", "Brasil", "Bahia", "45678901", "Foco em inovação tecnológica e desenvolvimento de software.", ["Java", "Spring Boot", "Data Science"]),
                new Empresa("GlobalNet", "contact@globalnet.com", "56789012000192", "Brasil", "São Paulo", "56789012", "Soluções em rede e segurança da informação.", ["Network Security", "Cloud Computing", "DevOps"])
        ]

        def candidatos = [
                new Candidato("Ana", "ana@example.com", "12345678901", 28, "São Paulo", "01234567", "Desenvolvedora com experiência em várias linguagens.", ["Python", "Java", "Spring Framework"]),
                new Candidato("Carlos", "carlos@example.com", "23456789012", 35, "Rio de Janeiro", "23456789", "Especialista em frontend com foco em Angular.", ["Angular", "JavaScript", "HTML/CSS"]),
                new Candidato("Maria", "maria@example.com", "34567890123", 29, "Minas Gerais", "34567890", "Desenvolvedora Java com experiência em Spring Boot.", ["Java", "Spring Boot", "SQL"]),
                new Candidato("João", "joao@example.com", "45678901234", 31, "Bahia", "45678901", "Engenheiro de software com foco em Python e machine learning.", ["Python", "Machine Learning", "Data Science"]),
                new Candidato("Pedro", "pedro@example.com", "56789012345", 27, "São Paulo", "56789012", "Desenvolvedor full stack com conhecimento em várias tecnologias.", ["Java", "JavaScript", "Spring Framework"])
        ]

print """
LinkeTinder - Raiza Antoneli
1 - Ver empresas cadastradas
2 - Ver candidatos cadastrados
3 - Cadastrar novo candidato
4 - Cadastrar nova empresa
5 - Sair
"""
        int op = ler.nextInt();
        while (op != 5){
            switch (op){
                case 1: {
                    empresas.each {println it}
                    print "Digite o próximo comando: "
                    op = ler.nextInt();
                    break
                }case 2: {
                    candidatos.each {println it}
                    print "Digite o próximo comando: "
                    op = ler.nextInt();
                    break
                }case 3: {
                    print "Nome: "
                    ler.nextLine()
                    String nome = ler.nextLine()
                    print "Idade: "
                    int idade = ler.nextInt()
                    ler.nextLine()
                    print "CPF: "
                    String cpf = ler.nextLine()
                    print "Email: "
                    String email = ler.nextLine()
                    print "CEP: "
                    String cep = ler.nextLine()
                    print "Descrição: "
                    String descricao = ler.nextLine()
                    print "Estado: "
                    String estado = ler.nextLine()
                    print "Digite as competências, separando-as por vírgula: "
                    List<String> competencias = ler.nextLine().split(",\\s*")
                    Candidato novoCandidato = new Candidato(nome, email, cpf, idade, estado, cep, descricao, competencias);
                    candidatos.add(novoCandidato);
                    print "Candidato cadastrado com sucesso! Digite o próximo comando: "
                    op = ler.nextInt();
                    break
                }case 4: {
                    ler.nextLine()
                    print "Nome: "
                    String nome = ler.nextLine()
                    print "Email: "
                    String email = ler.nextLine()
                    print "CNPJ: "
                    String cnpj = ler.nextLine()
                    print "Pais: "
                    String pais = ler.nextLine()
                    print "Estado: "
                    String estado = ler.nextLine()
                    print "CEP: "
                    String cep = ler.nextLine()
                    print "descricao: "
                    String descricao = ler.nextLine()
                    print "Digite as competências, separando-as por vírgula: "
                    List<String> competencias = ler.nextLine().split(",\\s*")
                    Empresa novaEmpresa = new Empresa(nome, email, cnpj, pais, estado, cep, descricao, competencias);
                    empresas.add(novaEmpresa);
                    print "Empresa cadastrada com sucesso! Digite o próximo comando: "
                    op = ler.nextInt();
                    break
                }
            }
        }



    }
}
