package br.com.pergunta2;

public class AchadoPerdido implements Publicacao2 {

    String titulo = "";
    String descricao = "";
    String foto = "";
    String tipo = "";
    String local_achado = "";
    String data_hora = "";
    String status = "";

    public String getTitulo() {
        return titulo;
    }

    public AchadoPerdido(String titulo, String descricao, String tipo, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.status = status;
    }

    public void completaDados(String foto, String local_achado, String data_hora) {
        this.foto = foto;
    this.local_achado = local_achado;
    this.data_hora =data_hora;
   }

//    public Boolean buscarTitulo(String titulo){
//     return this.getTitulo().equals(titulo);
//    }

//    public String visualizarDetalhes(){
//     this.toString();
//    }

@Override
public String toString() {
    return "AchadoPerdido [titulo=" + titulo + ", descricao=" + descricao + ", foto=" + foto + ", tipo=" + tipo
            + ", local_achado=" + local_achado + ", data_hora=" + data_hora + ", status=" + status + "]";
}

@Override
public boolean buscarTitulo(String titulo) {
    // TODO Auto-generated method stub
    return this.getTitulo().equals(titulo);

    
}

@Override
public String visualizarDetalhes() {
    // TODO Auto-generated method stub
        return this.toString();
    
}

}
