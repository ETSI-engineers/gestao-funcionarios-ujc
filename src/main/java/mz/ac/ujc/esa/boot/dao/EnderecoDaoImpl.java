package mz.ac.ujc.esa.boot.dao;

import org.springframework.stereotype.Repository;

import mz.ac.ujc.esa.boot.domain.Endereco;

@Repository
public abstract class EnderecoDaoImpl extends AbstractDao<Endereco, Long> implements EnderecoDao{

}
