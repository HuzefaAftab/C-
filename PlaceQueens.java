import java.util.Arrays;
import java.util.Scanner;
public class PlaceQueens {

    /*
    Name = Huzefa Aftab
    Description = This program will maintain and print a chessboard that allows the user to place Queen pieces. 
     */
    public static void main(String[] args) {
       runMenu();
    }
    
    public static void runMenu(){
        Scanner kb = new Scanner(System.in);
        char option = 'c';
        String menuStr = "\nq - quit \n"
                + "r - reset, \n"
                + "m - make, \n"
                + "a - add queen,\n"
                + "d - delete queen, \n"
                + "c - count queen, \n"
                + "p - print board\n";
        String user;
        int sz, row, col;
        char[][] board = null;
        
        for (;option != 'q';){
            System.out.print(menuStr);
            System.out.print("\nEnter option: ");
            user = kb.next();
            user = user.toLowerCase();
            option = user.charAt(0);
            if (option == 'q'){
                System.out.println("Good bye!");
            }
            else if (option == 'r') { // reset
                resetBoard(board);
                printBoard(board);
            }
            else if (option == 'm') { // Make board
                System.out.print("Enter board size: ");
                sz = kb.nextInt();
                kb.nextLine();
                board = createBoard(sz);
                printBoard(board);
            }
            else if (option == 'a') { // add a queen
                System.out.print("Enter row and column (1-N): ");
                row = kb.nextInt();
                col = kb.nextInt();
                placePiece(board, 'Q', row-1, col-1);    
                printBoard(board);
            } 
            else if (option == 'd') {  //Delete queen
                System.out.print("Enter row and column (1-N): ");
                row = kb.nextInt();
                col = kb.nextInt();
                deleteQueen(board, row-1, col-1);                                                
            }
            else if (option == 'c'){ // Count
                int ct = countQueens(board);
                System.out.println("Counted queens on board: " + ct);
            }
            else if (option == 'p'){  //Print
                printBoard(board);
            }
            else{
                System.out.println("Not a valid menu option.");
            }
        }
    }
  
    
    public static void setRow(int row, char[][] board){
        int c;
        if (board==null){
            return;
        }
        for(c = 0; c < board[row].length; c++) {
            if (board[row][c] != 'Q') {
                board[row][c] = '*';
            }
        }
    }
    public static void setCol(int col, char[][] board){
        int r;
        if (board==null){
            return;
        }
        for(r = 0; r < board.length; r++) {
            if (board[r][col] != 'Q') {
                board[r][col] = '*'; // ^
            }
        }
    }
    
    public static void setDiag(int row, int col, char [][] board){
        int c,r, sz;
        
        if (board==null){
            return;
        }
        sz = board.length;
        //int numCols = board.length;        
        // diagonal going up and to the left
        for(r = row, c = col; r >=0 && c>=0; r--,c--) {
            if (board[r][c] != 'Q') {
                board[r][c] = '*';
            }
        }

        // diagonal going up and to the right
        for(r = row, c = col; r >=0 && c<sz; r--,c++) {
            if (board[r][c] != 'Q') {
                board[r][c] = '*';
            }
        }
        
        // diagonal going down and to the right
        for(r = row, c = col; r <sz && c<sz; r++,c++) {
            if (board[r][c] != 'Q') {
                board[r][c] = '*';
            }
        }
    
        // diagonal going down and to the left
        for(r = row, c = col; r <sz && c>=0; r++,c--) {
            if (board[r][c] != 'Q') {
                board[r][c] = '*';
            }
        }
    
    }

    public static void resetBoard(char[][] board){
        int r,c;
        if (board == null){
            System.out.println("Not a valid board.");
            return;
        }
        for(r = 0; r<board.length; r++){
            for(c=0; c<board[0].length; c++){
                board[r][c] = ' ';
            }                
        }
    }
    
    public static char[][] createBoard(int size){
        char[][] board = new char[size][size];
        resetBoard(board);
        return board;
    }
    
      
    public static void printBoard(char[][] board){
        int r,c;
        String lineStr;
        
        if (board == null){
            System.out.println("Not a valid board.");
            return;
        }
        
        lineStr = "\n---";
        for(r = 0; r<board.length; r++){
            lineStr = lineStr+"----";
        }        
        System.out.print("  |"); 
        for(c=0; c<board[0].length; c++){
            System.out.printf("%3d|", (c+1) );
        }
        System.out.println(lineStr);
        for(r = 0; r<board.length; r++){
            System.out.printf( "%2d|", (r+1) );
            for(c=0; c<board[0].length; c++){
                System.out.printf(" %c |", board[r][c]);
            }                
            System.out.println(lineStr);
        }
        
    }
          
    public static void placePiece(char[][] board, char piece, int row, int col){
        if (board==null){
            
            return;
        }
        if (row <0 || row >=board.length || col <0 || col >=board[0].length) {
            System.out.println("Invalid row or column.");
            return;
        }        
        if (piece == 'Q'){            
            setRow(row, board);
            setCol(col, board);
            setDiag(row,col, board);
            board[row][col] = piece;
            //printBoard(board);
        }
    }        
    
    public static void deleteQueen(char[][] board, int row, int col){
        if (board==null){
            return;
        }
        
        if (row <0 || row >=board.length || col <0 || col >=board[0].length) {
            System.out.println("Invalid row or column.");
            return;
        }
        
        if (board[row][col] != 'Q') {
            System.out.println("There is no queen at this position.");
            return;
        }
        
        board[row][col] = ' '; // delete this queen so that it does not show up in count
        int r,c,k,count = countQueens(board);
        int[] qRows = new int[count];
        int[] qCols = new int[count];
        k=0;
        for(r=0; r<board.length; r++){
            for(c=0; c<board[0].length; c++){
                if (board[r][c] == 'Q') {
                    qRows[k] = r;
                    qCols[k] = c;
                    k = k+1;
                }
            }
        }
        
        resetBoard(board);
        for(k=0; k<qRows.length; k++){
            placePiece(board,'Q',qRows[k],qCols[k]);
        }
        printBoard(board);
    }
    
    public static int countQueens(char[][] board){
        int count, r,c;
        if (board==null){
            return 0;
        }
        
        for(count = 0, r=0; r<board.length; r++){
            for(c=0; c<board[0].length; c++){
                if (board[r][c] == 'Q') {
                    count++;
                }
            }
        }
        return count;                
    }
    
}

