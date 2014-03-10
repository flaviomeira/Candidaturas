package entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

@Entity
@Table(appliesTo = "ReceitasCandidatos")
public class ReceitasCandidatos {
	@GeneratedValue
	@Id
	int id;
	String Data_e_hora;
	String Sequencial_Candidato;
	String UF;
	String Numero_UE;
	String Municipio;
	String Sigla_Partido;
	String Numero_candidato;
	String Cargo;
	String Nome_candidato;
	String CPF_do_candidato;
	String Numero_Recibo_Eleitoral;
	String Numero_do_documento;
	String CPF_CNPJ_do_doador;
	String Nome_do_doador;
	String Nome_receita_doador;
	String Sigla_UE_doador;
	String Numero_partido_doador;
	String Numero_candidato_doador;
	String Cod_setor_economico_doador;
	String Setor_economico_doador;
	String Data_da_receita;
	String Valor_receita;
	String Tipo_receita;
	String Fonte_recurso;
	String Especie_recurso;
	String Descricao_da_receita;
	
	public String getData_e_hora() {
		return Data_e_hora;
	}
	public void setData_e_hora(String data_e_hora) {
		Data_e_hora = data_e_hora;
	}
	public String getSequencial_Candidato() {
		return Sequencial_Candidato;
	}
	public void setSequencial_Candidato(String sequencial_Candidato) {
		Sequencial_Candidato = sequencial_Candidato;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	public String getNumero_UE() {
		return Numero_UE;
	}
	public void setNumero_UE(String numero_UE) {
		Numero_UE = numero_UE;
	}
	public String getMunicipio() {
		return Municipio;
	}
	public void setMunicipio(String municipio) {
		Municipio = municipio;
	}
	public String getSigla_Partido() {
		return Sigla_Partido;
	}
	public void setSigla_Partido(String sigla_Partido) {
		Sigla_Partido = sigla_Partido;
	}
	public String getNumero_candidato() {
		return Numero_candidato;
	}
	public void setNumero_candidato(String numero_candidato) {
		Numero_candidato = numero_candidato;
	}
	
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	public String getNome_candidato() {
		return Nome_candidato;
	}
	public void setNome_candidato(String nome_candidato) {
		Nome_candidato = nome_candidato;
	}
	public String getCPF_do_candidato() {
		return CPF_do_candidato;
	}
	public void setCPF_do_candidato(String cPF_do_candidato) {
		CPF_do_candidato = cPF_do_candidato;
	}
	public String getNumero_Recibo_Eleitoral() {
		return Numero_Recibo_Eleitoral;
	}
	public void setNumero_Recibo_Eleitoral(String numero_Recibo_Eleitoral) {
		Numero_Recibo_Eleitoral = numero_Recibo_Eleitoral;
	}
	public String getNumero_do_documento() {
		return Numero_do_documento;
	}
	public void setNumero_do_documento(String numero_do_documento) {
		Numero_do_documento = numero_do_documento;
	}
	public String getCPF_CNPJ_do_doador() {
		return CPF_CNPJ_do_doador;
	}
	public void setCPF_CNPJ_do_doador(String cPF_CNPJ_do_doador) {
		CPF_CNPJ_do_doador = cPF_CNPJ_do_doador;
	}
	public String getNome_do_doador() {
		return Nome_do_doador;
	}
	public void setNome_do_doador(String nome_do_doador) {
		Nome_do_doador = nome_do_doador;
	}
	public String getNome_receita_doador() {
		return Nome_receita_doador;
	}
	public void setNome_receita_doador(String nome_receita_doador) {
		Nome_receita_doador = nome_receita_doador;
	}
	public String getSigla_UE_doador() {
		return Sigla_UE_doador;
	}
	public void setSigla_UE_doador(String sigla_UE_doador) {
		Sigla_UE_doador = sigla_UE_doador;
	}
	public String getNumero_partido_doador() {
		return Numero_partido_doador;
	}
	public void setNumero_partido_doador(String numero_partido_doador) {
		Numero_partido_doador = numero_partido_doador;
	}
	public String getNumero_candidato_doador() {
		return Numero_candidato_doador;
	}
	public void setNumero_candidato_doador(String numero_candidato_doador) {
		Numero_candidato_doador = numero_candidato_doador;
	}
	public String getCod_setor_economico_doador() {
		return Cod_setor_economico_doador;
	}
	public void setCod_setor_economico_doador(String cod_setor_economico_doador) {
		Cod_setor_economico_doador = cod_setor_economico_doador;
	}
	public String getSetor_economico_doador() {
		return Setor_economico_doador;
	}
	public void setSetor_economico_doador(String setor_economico_doador) {
		Setor_economico_doador = setor_economico_doador;
	}
	public String getData_da_receita() {
		return Data_da_receita;
	}
	public void setData_da_receita(String data_da_receita) {
		Data_da_receita = data_da_receita;
	}
	public String getValor_receita() {
		return Valor_receita;
	}
	public void setValor_receita(String valor_receita) {
		Valor_receita = valor_receita;
	}
	public String getTipo_receita() {
		return Tipo_receita;
	}
	public void setTipo_receita(String tipo_receita) {
		Tipo_receita = tipo_receita;
	}
	public String getFonte_recurso() {
		return Fonte_recurso;
	}
	public void setFonte_recurso(String fonte_recurso) {
		Fonte_recurso = fonte_recurso;
	}
	public String getEspecie_recurso() {
		return Especie_recurso;
	}
	public void setEspecie_recurso(String especie_recurso) {
		Especie_recurso = especie_recurso;
	}
	public String getDescricao_da_receita() {
		return Descricao_da_receita;
	}
	public void setDescricao_da_receita(String descricao_da_receita) {
		Descricao_da_receita = descricao_da_receita;
	}
	
	

}
