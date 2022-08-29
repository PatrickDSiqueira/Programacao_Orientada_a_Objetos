package br_com_pratica1_questao3_notasAlunos;

public class NotasAlunos {
    
    public String avaliarRecuperação(double notaAV1, double notaAV2, double notaAE ){
        String resultado = "";
        double mediaNota = (notaAV1 + notaAV2 + notaAE) / 3;

        if (mediaNota >= 60 ) {
            resultado = "Aprovado";
        } else{
            resultado = "Reprovado";
        }
        

        return resultado;
    }
    
}
