package Aula4;
import java.util.Scanner;

//import Aula4.Produto;
public class ProdutoTestar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Produto produto = new Produto();
        System.out.print("digite o nome do produto: ");
        produto.nome = input.nextLine();
        System.out.print("digite a marca do produto: ");
        produto.marca = input.nextLine();
        System.out.print("digite o valor do produto: ");
        produto.valor = input.nextDouble();

        System.out.println(produto.marca +"\n"+ produto.nome + "\n"+ produto.valor + "R$");
    }
}
