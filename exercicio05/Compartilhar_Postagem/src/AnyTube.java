class AnyTube implements PlataformaSocial {

    @Override
    public void compartilharPostagem(Postagem postagem) {
        System.out.println("Você compartilhou essa postagem no AnyTube: " + postagem.getTitulo());
    }

    @Override
    public void compartilharImagem(Postagem postagem) throws Exception {
        throw new Exception("Ocorreu um erro ao compartilhar essa postagem no AnyTube.");
    }

    @Override
    public void compartilharVideo(Postagem postagem) {
        System.out.println("Você compartilhou esse vídeo no AnyTube: " + postagem.getTitulo());
    }
}
