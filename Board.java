import java.util.Random;

public class Board {
    private int[] board = {4, 4, 4, 4, 4, 4, 0, 4, 4, 4, 4, 4, 4, 0};
    private int[] labels = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N'};

    private void PrintBoardLine(int _dots, boolean _newLine) {
        for (int i = 0; i < _dots; i++) {
            System.out.print("*");
        }
        if (_newLine) {
            System.out.println();
        }
    }

    private void PrintDottedLine(int _dots, boolean _newLine) {
        for (int i = 0; i < _dots; i++) {
            System.out.print("*    ");
        }
        if (_newLine) {
            System.out.println("*");
        }
    }

    private void PrintTopPlayer() {
        for(int i = 13; i > 6; i--) {
            System.out.printf("*  %c  ", labels[i]);
        }
        PrintDottedLine(1, true);

        for(int i = 13; i > 6; i--) {
            System.out.printf("* %2d ", board[i]);
        }

        PrintDottedLine(1, true);
    }

    private void PrintBottomPlayer() {
        PrintDottedLine(1, false);
        for(int i = 0; i <= 6; i++) {
            System.out.printf("* %2d ", board[i]);
        }
        PrintDottedLine(1, false);
        PrintBoardLine(1, true);

        for(int i = 0; i <= 6; i++) {
            System.out.printf("* %c ", labels[i]);
        }
        PrintBoardLine(1, true);
    }

    public void printBoard() {
        PrintBoardLine(41, true);
        PrintDottedLine(8, false);
        PrintBoardLine(1, true);
        PrintTopPlayer();

        PrintDottedLine(8, false);
        PrintBoardLine(1, true);
        PrintBoardLine(41, true);
        PrintDottedLine(8, false);
        PrintBoardLine(1, true);
        PrintBottomPlayer();

        PrintDottedLine(8, false);
        PrintBoardLine(1, true);
        PrintBoardLine(41, true);
    }

    int makeMove(Player _player) {
        Random random = new Random();
        int returnValue = 0;
        char choice;

        System.out.println(_player.getName() +" escolheu das casas "+ labels[_player.getStart()] +" a "+ labels[_player.getEnd()] +": ");
        choice = input.next().toUperCase().charAt(0);
        returnValue = random.nextInt(3);
        System.out.println("Você escolheu a casa " + returnValue + "!");
        return returnValue;
    }

    public int checkEmptySlot() {
        int returnValue = 0, p1 = 0, p2 = 0;

        for(int i = 0; i < 7; i++) {
            if(board[i] != 0) {
                p1 = 0;
                break;
            } else {
                p1 = 1;
            }
        }

        for(int i = 8; i < 12; i++) {
            if(board[i] != 0) {
                p2 = 0;
                break;
            } else {
                p2 = 1;
            }
        }

        returnValue = p1 + p2;

        return returnValue;
    }
}
