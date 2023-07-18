public class MediaGeral {

    public void MediaTotal(){
    PrimeiraNota primeiraNota = new PrimeiraNota();
    int notaUm = primeiraNota.Nota1;

    SegundaNota segundaNota = new SegundaNota();
    int notaDois = segundaNota.Nota2;

    TerceiraNota terceiraNota = new TerceiraNota();
    int notaTres = terceiraNota.Nota3;

    QuartaNota quartaNota = new QuartaNota();
    int notaQuatro = quartaNota.Nota4;

    double Media = (double) (notaUm + notaDois + notaTres + notaQuatro) / 4;
        System.out.println("Calculando aqui... Sua média geral é de " + Media);
    }

}


