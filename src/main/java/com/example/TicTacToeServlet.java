package com.example;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class TicTacToeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final int SIZE = 3;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    request.getRequestDispatcher("/index.html").forward(request, response);
	}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        char[][] board = (char[][]) session.getAttribute("board");
        Character currentPlayer = (Character) session.getAttribute("currentPlayer");

        if (request.getParameter("reset") != null) {
            session.invalidate();
            response.sendRedirect("tictactoe");
            return;
        }

        String move = request.getParameter("move");
        if (move != null && board != null && currentPlayer != null) {
            String[] parts = move.split(",");
            int row = Integer.parseInt(parts[0]);
            int col = Integer.parseInt(parts[1]);

            if (board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }

            session.setAttribute("board", board);
            session.setAttribute("currentPlayer", currentPlayer);
        }

        response.sendRedirect("tictactoe");
    }

    private String checkWinner(char[][] board) {
        for (int i = 0; i < SIZE; i++) {
            // Rows and columns
            if (board[i][0] != ' ' &&
                board[i][0] == board[i][1] && board[i][1] == board[i][2])
                return String.valueOf(board[i][0]);

            if (board[0][i] != ' ' &&
                board[0][i] == board[1][i] && board[1][i] == board[2][i])
                return String.valueOf(board[0][i]);
        }

        // Diagonals
        if (board[0][0] != ' ' &&
            board[0][0] == board[1][1] && board[1][1] == board[2][2])
            return String.valueOf(board[0][0]);

        if (board[0][2] != ' ' &&
            board[0][2] == board[1][1] && board[1][1] == board[2][0])
            return String.valueOf(board[0][2]);

        return null;
    }

    private boolean isDraw(char[][] board) {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (board[i][j] == ' ')
                    return false;
        return checkWinner(board) == null;
    }
}
