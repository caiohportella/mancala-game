import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Player[] players = new Player[2];
        int current;
        Scanner input = new Scanner(System.in);
        board.printBoard();

        System.out.println("Bem-vindo ao jogo da Mancala!\n Digite o nome do jogador 1: ");
        players[0] = new Player(input.nextLine());
        System.out.println("Digite o nome do jogador 2: ");
        players[1] = new Player(input.nextLine());
        current = 0;

        boolean loop = true;
        do {
            System.out.println("\n" + players[current].getName() + " é a sua vez!");
            System.out.println("Digite o número da casa que deseja jogar: ");
            int choice = input.nextInt();
            if (choice < 0 || choice > 13) {
                System.out.println("Número inválido!");
                continue;
            }
            if (board.play(choice, current)) {
                current = (current + 1) % 2;
            } else {
                System.out.println("Não há peças suficientes na casa!");
            }
            board.printBoard();
            loop = board.checkEnd();
        } while (loop);
    }
}