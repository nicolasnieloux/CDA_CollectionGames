package fr.lecampusnumerique.games.utils;

import fr.lecampusnumerique.games.Game;
import fr.lecampusnumerique.games.GameCollection;
import fr.lecampusnumerique.games.GameFactory;

public class GameLauncher {

    private Game game;
    private GameCollection gameCollection;

    public GameLauncher() {
        //Afficher la liste de type de jeu
        System.out.println("Bienvenue chez Charly's Games");
        for (GameCollection gameCollection : GameCollection.values()) {
            System.out.println(gameCollection);
        }
        String inputUser = InputUser.GetInputUser();
        this.gameCollection = getGameTypeFromUserInput(inputUser);

    }


    public void startGame(){
        game = GameFactory.createGame(gameCollection);
        game.start();
    }

    private GameCollection getGameTypeFromUserInput(String userInput) {
        return GameCollection.valueOf(userInput.toUpperCase().trim());
    }
}
