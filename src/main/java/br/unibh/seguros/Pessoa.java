package br.unibh.seguros;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Pessoa {
	
	@Id
	private Long id;
	private String nome;
	private String sexo;
	private String cpf;
	private String telefoneComercial;
	private String telefoneResidencial;
	private String telefoneCelular;
	private String email;
	private Date dataNascimento;
	private Date dataCadastro;
	
}
