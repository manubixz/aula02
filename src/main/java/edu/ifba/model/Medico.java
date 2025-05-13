package edu.ifba.model;

import java.util.List;
import java.util.UUID;

public class Medico extends Pessoa{
   private String crm;
   private List<Especialidade> especialidades;
   
   public Medico(String crm, List<Especialidade> especialidades) {
    this.crm = crm;
    this.especialidades = especialidades;
   }
   public Medico(UUID id, String nome, String whatsapp, Genero genero, Endereco endereco, Usuario usuario, String crm,
        List<Especialidade> especialidades) {
    super(id, nome, whatsapp, genero, endereco, usuario);
    this.crm = crm;
    this.especialidades = especialidades;
   }
   public String getCrm() {
    return crm;
   }
   public void setCrm(String crm) {
    this.crm = crm;
   }
   public List<Especialidade> getEspecialidade() {
    return especialidades;
   }
   public void setEspecialidade(List<Especialidade> especialidade) {
    this.especialidades = especialidade;
   }
   
 
    
}
