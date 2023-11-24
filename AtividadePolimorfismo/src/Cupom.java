class Cupom {
    public void aplicarCupom(Compra compra, String codigoCupom) {
        System.out.println("Cupom '" + codigoCupom + "' aplicado à compra '" + compra.getNome() + "'.");
    }
}
