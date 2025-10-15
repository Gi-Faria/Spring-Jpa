package com.giovanna.faria.prjCadFornecedor.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giovanna.faria.prjCadFornecedor.entities.Fornecedor;
import com.giovanna.faria.prjCadFornecedor.repository.FornecedorRepository;

@Service
public class FornecedorService {
	
	private final FornecedorRepository fornecedorRepository;
	
	@Autowired
public FornecedorService( FornecedorRepository fornecedorRepository) {
		
		this.fornecedorRepository = fornecedorRepository;
	}

public Fornecedor salvarFornecedor(Fornecedor fornecedor) {
	return fornecedorRepository.save(fornecedor);
}

public Fornecedor getForncedorById(Long id) {
	return fornecedorRepository.findById(id).orElse(null);
}

public List<Fornecedor> getAllFornecedor() {
	return fornecedorRepository.findAll();
}

public void deletarFornecedor(Long id) {
	fornecedorRepository.deleteById(id);
}


}
