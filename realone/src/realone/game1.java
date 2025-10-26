package realone;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class game1 {
    static char[][] board = {
        { ' ', ' ', ' ' },
        { ' ', ' ', ' ' },
        { ' ', ' ', ' ' }
    };

    static char currentPlayer = 'X';  
    static boolean game1Won = false; 
    static JButton[][] buttons = new JButton[3][3];  
    static JLabel statusLabel = new JLabel("Player X's turn", JLabel.CENTER);
    

    static ImageIcon xIcon = new ImageIcon("x.png"); 
    static ImageIcon oIcon = new ImageIcon("o.png"); 

    public game1() {
        JFrame frame = new JFrame("Tic-Tac-Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

       
        JPanel boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(3, 3)); 

      
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 60));
                buttons[i][j].setFocusPainted(false);
                buttons[i][j].addActionListener(new ButtonClickListener(i, j));
                boardPanel.add(buttons[i][j]);
            }
        }

    
        statusLabel.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(statusLabel, BorderLayout.NORTH);
        frame.add(boardPanel, BorderLayout.CENTER);

       
        frame.setVisible(true);
    }

   
    static class ButtonClickListener implements ActionListener {
        int row, col;

        ButtonClickListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
          
            if (board[row][col] != ' ') {
                return;
            }

          
            board[row][col] = currentPlayer;
            if (currentPlayer == 'X') {
                buttons[row][col].setIcon(xIcon); 
            } else {
                buttons[row][col].setIcon(oIcon);
            }

          
            if (checkWin(currentPlayer)) {
                statusLabel.setText("Player " + currentPlayer + " wins!");
                game1Won = true;
                disableButtons();
            } else if (isBoardFull()) {
               
                statusLabel.setText("It's a draw!");
            } else {
               
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                statusLabel.setText("Player " + currentPlayer + "'s turn");
            }
        }
    }

  
    static boolean checkWin(char player) {
      
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

   
    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

   
    static void disableButtons() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setEnabled(false);
            }
        }
    }

  
    public static void main(String[] args) {
     
        new game1();
    }
}

