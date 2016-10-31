/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Tafar
 */
public class Disciplina {
    private int id;
    private String nome;
    private int cargaHoraria;
    private String curso;
    private int numeroVagas;
    private String periodo;

    public Disciplina() {
    }

    public Disciplina(int id, String nome, int cargaHoraria, String curso, int numeroVagas, String periodo) {
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.curso = curso;
        this.numeroVagas = numeroVagas;
        this.periodo = periodo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNumeroVagas() {
        return numeroVagas;
    }

    public void setNumeroVagas(int numeroVagas) {
        this.numeroVagas = numeroVagas;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    @Override
    public String toString() {
        return getNome(); //To change body of generated methods, choose Tools | Templates.
    }  
    
    /*
    @Override
    public String toString() {
        String retorno = id + " - " + nome + " - " + cargaHoraria + " - " + curso + " - " + numeroVagas + " - " + periodo;
        return retorno;
    }*/
    
}
