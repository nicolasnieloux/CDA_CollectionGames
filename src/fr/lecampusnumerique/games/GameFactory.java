package fr.lecampusnumerique.games;

import fr.lecampusnumerique.games.connect4.Connect4;
import fr.lecampusnumerique.games.tictactoe.TicTacToe;
import fr.lecampusnumerique.games.gomoku.Gomoku;

public class GameFactory {

   public static Game createGame(GameCollection gameCollection) {
        return switch (gameCollection) {
            case GameCollection.GOMOKU -> new Gomoku();
            case GameCollection.TICTACTOE -> new TicTacToe();
            case GameCollection.CONNECT4 -> new Connect4();
        };
    }
}