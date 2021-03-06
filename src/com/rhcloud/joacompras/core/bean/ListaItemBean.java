package com.rhcloud.joacompras.core.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Hilton Wichwski Silva
 *
 */
@Entity
@Table(name="LISTA_ITEM")
public class ListaItemBean implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_LISTA_ITEM")
	private Long id;
	
	@OneToOne
	private ListaBean lista;
	
	@OneToOne(orphanRemoval=true)
	private ItemBean item;

	@Column(name="quantidade", nullable=false)
	private Integer quantidade;
	

	/**
	 * @return id
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * @return lista
	 */
	public ListaBean getLista() {
		return lista;
	}
	
	/**
	 * @param lista
	 */
	public void setLista(ListaBean lista) {
		this.lista = lista;
	}
	
	/**
	 * @return item
	 */
	public ItemBean getItem() {
		return item;
	}
	
	/**
	 * @param item
	 */
	public void setItem(ItemBean item) {
		this.item = item;
	}
	
	/**
	 * @return quantidade
	 */
	public Integer getQuantidade() {
		return quantidade;
	}
	
	/**
	 * @param quantidade
	 */
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + ((lista == null) ? 0 : lista.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListaItemBean other = (ListaItemBean) obj;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (lista == null) {
			if (other.lista != null)
				return false;
		} else if (!lista.equals(other.lista))
			return false;
		return true;
	}

}
