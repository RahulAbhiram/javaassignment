import java.util.Scanner;

 class TicTacToe 
{

    static String[][] board = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
    static String player = "X";

    public static void main(String[] args) 
    {
        while (true) {
            printBoard();
            System.out.print("Enter row and column for " + player + " : ");
            Scanner scan = new Scanner(System.in);
            int row = scan.nextInt();
            int col = scan.nextInt();
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col].equals(" ")) {
                board[row][col] = player;
                
                if (isWin()) {
                    System.out.println(player + " wins!");
                    printBoard();
                    break;
                }
                if (isDraw()) {
                    System.out.println("It's a draw!");
                    printBoard();
                    break;
                }
            }
                     else {
                        System.out.println("Invalid move, try again");
                    }
                    if (row >= 0 && row < 3 && col >= 0 && col < 3) {
                       
                    if (player.equals("X")) {
                            player = "O";
                        } else {
                            player = "X";
                        }
                        }
                }
            }
        
            public static boolean isWin() {
                return (rowWin() || colWin() || diagonalWin());
            }
        
            public static boolean rowWin() {
                for (int i = 0; i < 3; i++) {
                    if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]) && !board[i][0].equals(" ")) {
                        return true;
                    }
                }
                return false;
            }
        
            public static boolean colWin() {
                for (int i = 0; i < 3; i++) {
                    if (board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]) && !board[0][i].equals(" ")) {
                        return true;
                    }
                }
                return false;
            }
        
            public static boolean diagonalWin() {
                if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[0][0].equals(" ")) {
                    return true;
                }
                if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[0][2].equals(" ")) {
                    return true;
                }
                return false;
            }
        
            public static boolean isDraw() {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (board[i][j].equals(" ")) {
                            return false;
                        }
                    }
                }
                return true;
                }
        
            public static void printBoard()
            {
              System.out.println(board);
            }
    }
