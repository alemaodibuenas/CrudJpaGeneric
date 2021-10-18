package principal;

import java.util.Date;

import dominio.Categoria;
import dominio.Produto;
import dominio.SubCategoria;
import servico.CategoriaServico;
import servico.ProdutoServico;
import servico.SubCategoriaServico;

public class Teste {	
	
	public void listarCategoria() {
		CategoriaServico servico = new CategoriaServico("exemplo-jpa");
		for (Categoria item : servico.listar()) {
			System.out.println(item);			
		}
		servico.dispose();		
	}
	
	public void listarSubCategoria() {
		SubCategoriaServico servico = new SubCategoriaServico("exemplo-jpa");
		for (SubCategoria item : servico.listar()) {
			System.out.println(item);			
		}
		servico.dispose();		
	}
	
	public void listarProduto() {		
		ProdutoServico servico = new ProdutoServico("exemplo-jpa");
		for (Produto item : servico.listar()) {
			System.out.println(item);			
		}
		servico.dispose();		
	}
	
	public void inserirCategoria() {
		CategoriaServico servico = new CategoriaServico("exemplo-jpa");
		servico.inserir(new Categoria(null,"teste", new Date()));
		servico.dispose();
	}

}
