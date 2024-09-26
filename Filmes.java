// criei a classe filmes para poder colocar os atributos
public class Filmes {
    // criei os atributos da classe
	private String titulo;  // atributo privado do titulo do filme
	private int duracao; // atributo privado da duracao do filme
	private String gen;  // atributo privado do genero do filme
	private String resultado;  // guarda todas as informações do filme
	// metodo construtor para organizar todos os atributos	
public Filmes(String titulo, int duracao, String gen ) {
	// metodo set para chamar os atributos privados
	setTitulo(titulo);                             
	setDuracao(duracao);                               
	setGen(gen);                                     
	// guarda todas as informações do filme
	this.resultado = info();
}
//metodo set para colocar um "valor" ao atributo titulo
public void setTitulo(String titulo) {
	if(titulo == null || titulo.trim().isEmpty()) { // o ".trim" seve para evitar espaços desnecessários e o ".isEmpty" serve para verificar se está vazio juntamente com o "null"
		throw new IllegalArgumentException("É necessário ter o titulo do filme."); // caso esteja vazio, informa que não pode estar vazio
	
	}
	// guarda a informação do titulo no atributo titulo
	this.titulo = titulo;
}
// metodo set para colocar um valor ao atributo duracao
public void setDuracao(int duracao) {
	if(duracao <= 0) {                   // faz a validação da quantidade de minutos para não ser 0 ou menor que 0
		throw new IllegalArgumentException("A duração do filme não pode ser 0 ou menor que 0."); // caso seja 0 ou menor que 0 informa a situação
	}
	this.duracao = duracao;           // guarda a informção da duração do filme
}
// metodo set para verificar se o "valor" dado ao atributo gen seja um dos três especificados
public void setGen(String gen) {
	// valida se o valor dado para o atributo gen seja um dos três especificados
	if(!gen.equalsIgnoreCase("Terror") && !gen.equalsIgnoreCase("Romance") && !gen.equalsIgnoreCase("Comédia")) {
		throw new IllegalArgumentException("O gênero do filme deve ser de Romance, Terror ou Comédia."); // caso seja algum genero diferente ele informa o problema
	}
	this.gen = gen; // guarda a informação do genero no atributo gen
}

public String getTitulo() {  // metodo get para pegar o valor dado ao atributo privado do titulo
	return titulo;
}

public int getDuracao() { // metodo get para pegar o valor dado ao atributo privado da duração
	return duracao;
}

public String getGen() {  // metodo get para pegar o valor dado ao atributo privado do genero
	return gen;
}

public String info(){        // metodo para informar o resultado final das caracteristicas do filme
	return "Título do filme: " + titulo + "\n" + "Duração do filme: " + duracao + " minutos." + "\n" + "Gênero do filme: " + gen + "\n";
}

public String getResultado() {  // metodo get para pegar todas as informações salvas do filme
	return resultado;
}

public static void main(String[]args) {
	// metodo try catch para ver se ocorreu alguma exceção
	try {                                                          
		// criei um novo objeto para dar os valores aos atributos
        Filmes f1 = new Filmes("Top gun Ases Indomaveis", 110, "Romance");
        // passa todas as informações salvas para o usuario
        System.out.println(f1.getResultado());             

        
    } catch (IllegalArgumentException erro) {                           // Se algum dos parâmetros está incorreto; 'IllegalArgumentException e' para o getMessage acessar o 'IllegalArgumentException' referente ao parâmetro incorreto
        System.out.println("Foi encontrado um erro: " + erro.getMessage()); // Se tiver incorreto retorna o 'IllegalArgumentException' referente ao parâmetro incorreto
    }
}
}