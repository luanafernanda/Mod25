
package br.com.luana.services;

import br.com.luana.dao.IProdutoDAO;
import br.com.luana.domain.Produto;
import br.com.luana.services.generic.GenericService;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoDAO {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}