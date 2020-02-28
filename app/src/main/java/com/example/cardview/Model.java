package com.example.cardview;

/**
 * Created by Aldenir Rodrigues on 28/02/2020.
 */
public class Model {
  private String titulo;
  private String detalhes;
  private int foto;

  public Model (String titulo, String detalhes, int foto) {
    this.titulo = titulo;
    this.detalhes = detalhes;
    this.foto = foto;
  }

  public String getTitulo () {
    return titulo;
  }

  public void setTitulo (String titulo) {
    this.titulo = titulo;
  }

  public String getDetalhes () {
    return detalhes;
  }

  public void setDetalhes (String detalhes) {
    this.detalhes = detalhes;
  }

  public int getFoto () {
    return foto;
  }

  public void setFoto (int foto) {
    this.foto = foto;
  }
}
