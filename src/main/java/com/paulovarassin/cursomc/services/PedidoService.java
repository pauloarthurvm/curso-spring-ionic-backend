package com.paulovarassin.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulovarassin.cursomc.domain.Pedido;
import com.paulovarassin.cursomc.repositories.PedidoRepository;
import com.paulovarassin.cursomc.services.exceptions.ObjectNotFoundException;


@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id){
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! "
				+ "Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}
