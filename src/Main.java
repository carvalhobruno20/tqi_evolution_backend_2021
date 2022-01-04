import br.com.desafio.dominio.Cliente;
import br.com.desafio.dominio.Empretimo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Joao");
        cliente1.setCpf("1111111111111");
        cliente1.setEndereco("Rua Teste");
        cliente1.setRg("222222222");
        cliente1.setRenda("R$ 40000,00");
        cliente1.setEmail("teste@teste.com.br");
        cliente1.setSenha("teste");



        LocalDate localDate = LocalDate.now();
        Empretimo cliente2 = new Empretimo();
        cliente2.setParcela(80);
        cliente2.totalParcela();
        cliente2.setValorEmprestimo(450000);
        cliente2.setDataPrimeiraParcela(localDate.plusMonths(3));

        //System.out.println(cliente2);
    }
}
