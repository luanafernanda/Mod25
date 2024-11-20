
package br.com.luana.services.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.luana.dao.Persistente;
import br.com.luana.exceptions.TipoChaveNaoEncontradaException;


public interface IGenericService <T extends Persistente, E extends Serializable> {
	
	/**
     * M�todo para cadastrar novos registro no banco de dados
     *
     * @param entity a ser cadastrado
     * @return retorna verdadeiro para cadastrado e falso para n�o cadastrado
     */
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    /**
     * M�todo para excluir um registro do banco de dados
     *
     * @param valor chave �nica do dado a ser exclu�do
     */
    public void excluir(E valor);

    /**
     *M�todo para alterar um registro no bando de dados.
     *
     * @param entity a ser atualizado
     */
    public void alterar(T entity) throws TipoChaveNaoEncontradaException;

    /**
     * M�todo para consultar um registro no banco de dados
     *
     * @param valor chave �nica do dado a ser consultado
     * @return
     */
    public T consultar(E valor);

    /**
     * M�todo que ir� retornar todos os registros do banco de dados de uma determinado dado ou tabela
     *
     * @return Registros encontrados
     */
    public Collection<T> buscarTodos();

}