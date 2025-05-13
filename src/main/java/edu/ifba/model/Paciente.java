package edu.ifba.model;

import java.util.List;
import java.util.UUID;

public class Paciente extends Pessoa {
private String planosaude;
private List<Consulta> consultas;

public Paciente(String planosaude, List<Consulta> consultas) {
    this.planosaude = planosaude;
    this.consultas = consultas;
}
public Paciente(UUID id, String nome, String whatsapp, Genero genero, Endereco endereco, Usuario usuario,
        String planosaude, List<Consulta> consultas) {
    super(id, nome, whatsapp, genero, endereco, usuario);
    this.planosaude = planosaude;
    this.consultas = consultas;
}
public String getPlanosaude() {
    return planosaude;
}
public void setPlanosaude(String planosaude) {
    this.planosaude = planosaude;
}
public List<Consulta> getConsultas() {
    return consultas;
}
public void setConsultas(List<Consulta> consultas) {
    this.consultas = consultas;
}
   
    
    
}
