public class MediadeNota {

    public static void main(String[] args){
    
    PrimeiraNota primeiraNota = new PrimeiraNota();
    primeiraNota.notaPrimaria();

    SegundaNota segundaNota = new SegundaNota();
    segundaNota.notaSecundaria();

    TerceiraNota terceiraNota = new TerceiraNota();
    terceiraNota.notaTerceária();

    QuartaNota quartaNota = new QuartaNota();
    quartaNota.notaQuarta();

    MediaGeral mediaGeral = new MediaGeral();
    mediaGeral.MediaTotal();
    }

}