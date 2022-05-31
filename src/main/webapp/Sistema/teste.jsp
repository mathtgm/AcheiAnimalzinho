<%@page import="br.com.adotante.AdotanteDAO"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="br.com.adotante.Adotante"%>
<%@page import="java.sql.Date"%>
<%@page import="br.com.pessoa.Pessoa"%>
<%@page import="br.com.funcionario.Funcionario"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="br.com.animal.Animal"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="br.com.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

// //Definindo pessoa1
// Pessoa pessoa1 = new Pessoa();
// pessoa1.setNome("Matheus Gabriel");
// pessoa1.setUsuario("mathtmg");
// pessoa1.setSenha("123");
// pessoa1.setTelefone("(19) 996646158");
// pessoa1.setCpf("434.324.798-83");
// pessoa1.setGenero("Masculino");
// pessoa1.setBairro("Jaridm oito de Abril");
// pessoa1.setDataNasc(new Date(System.currentTimeMillis()));
// pessoa1.setLogadouro("Rua José Bressan");
// pessoa1.setNumero("45");

// //Definindo Pessoa2
// Pessoa pessoa2 = new Pessoa();
// pessoa2.setNome("Maria Gabriela");
// pessoa2.setUsuario("mariamg");
// pessoa2.setSenha("123");
// pessoa2.setTelefone("(19) 996682918");
// pessoa2.setCpf("434.324.432-78");
// pessoa2.setGenero("Feminino");
// pessoa2.setBairro("Centro");
// pessoa2.setDataNasc(new Date(System.currentTimeMillis()));
// pessoa2.setLogadouro("Rua Cinco");
// pessoa2.setNumero("6");

// //Definindo funcionario
// Funcionario funcionario1 = new Funcionario();
// funcionario1.setPessoa(pessoa1);

// //Definindo adotante
// Adotante adotante1 = new Adotante();
// adotante1.setPessoa(pessoa2);

// //Definindo animal
// Animal animal1 = new Animal();
// animal1.setNome("Nala");
// animal1.setDescricao("Cachorro legal e divertido");
// animal1.setIdade(1);
// animal1.setPelagem("Caramelo");
// animal1.setPeso(5.6);
// animal1.setPorte("Grandde");
// animal1.setTipo("Cachorro");
// animal1.setEntrada(new Timestamp(System.currentTimeMillis()));
// animal1.setNascimento(new Date(System.currentTimeMillis()));

// //Definindo o funcionario que cadastrou o animal no sistema
// animal1.setFuncionario(funcionario1);
// funcionario1.getAnimais().add(animal1);

// //Adicionando o adotante ao animal
// animal1.setAdotante(adotante1);
// adotante1.getAnimais().add(animal1);

// //Enviando as entidade ao banco de dados
// EntityManagerFactory emf = Persistence.createEntityManagerFactory("banco-jpa");
// EntityManager em = emf.createEntityManager();

// em.getTransaction().begin();
// em.persist(funcionario1);
// em.persist(adotante1);
// em.persist(animal1);
// em.getTransaction().commit();
 
AdotanteDAO DAO = new AdotanteDAO();
DAO.consultaAdotante(1);

%>
</body>
</html>