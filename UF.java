package org.example.code;

import java.util.List;

public class UF {
    private String nome;
    private String sigla;
    private String capital;
    private List<Double> coordenadas;
    private long populacao;
    private double area;
    private double densidade;
    private List<String> tresMaioresCidades;

    public UF(String nome, String sigla, String capital, List<Double> coordenadas, long populacao, double area, double densidade, List<String> tresMaioresCidades) {
        this.nome = nome;
        this.sigla = sigla;
        this.capital = capital;
        this.coordenadas = coordenadas;
        this.populacao = populacao;
        this.area = area;
        this.densidade = densidade;
        this.tresMaioresCidades = tresMaioresCidades;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public List<Double> getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(List<Double> coordenadas) {
        this.coordenadas = coordenadas;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getDensidade() {
        return densidade;
    }

    public void setDensidade(double densidade) {
        this.densidade = densidade;
    }

    public List<String> getTresMaioresCidades() {
        return tresMaioresCidades;
    }

    public void setTresMaioresCidades(List<String> tresMaioresCidades) {
        this.tresMaioresCidades = tresMaioresCidades;
    }
}








