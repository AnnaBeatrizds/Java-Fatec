public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Gerente("João", 101);
        Funcionario funcionario2 = new Vendedor("Maria", 102);
        Funcionario funcionario3 = new Faxineiro("Pedro", 103);

        funcionario1.baterPonto();
        funcionario1.fecharCaixa();
        ((Gerente) funcionario1).realizarVenda();

        funcionario2.baterPonto();
        funcionario2.fecharCaixa();
        ((Vendedor) funcionario2).realizarVenda();

        funcionario3.baterPonto();
        ((Faxineiro) funcionario3).solicitarMaterial();
    }
}
