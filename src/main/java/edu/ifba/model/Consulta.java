package edu.ifba.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Consulta {
   private UUID id;
   private LocalDateTime data;
   private Boolean retorno;
   private BigDecimal valor;
   private StatusPagamento statusPagamento;
   private Receita receita;
   private StatusConsulta statusConsulta;
    
    public Consulta() {
    }

    public Consulta(UUID id, LocalDateTime data, Boolean retorno, BigDecimal valor, StatusPagamento statusPagamento,
            Receita receita, StatusConsulta statusConsulta) {
        this.id = id;
        this.data = data;
        this.retorno = retorno;
        this.valor = valor;
        this.statusPagamento = statusPagamento;
        this.receita = receita;
        this.statusConsulta = statusConsulta;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Boolean getRetorno() {
        return retorno;
    }

    public void setRetorno(Boolean retorno) {
        this.retorno = retorno;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public StatusPagamento getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }

    public StatusConsulta getStatusConsulta() {
        return statusConsulta;
    }

    public void setStatusConsulta(StatusConsulta statusConsulta) {
        this.statusConsulta = statusConsulta;
    }

    
}
