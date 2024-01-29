package fr.lecampusnumerique.games.utils;

import fr.lecampusnumerique.games.Game;
import fr.lecampusnumerique.games.GameCollection;
import fr.lecampusnumerique.games.GameFactory;

public class GameLauncher {

    private Game game;
    private GameCollection gameCollection;

    private View view = new View();

    public GameLauncher() {

        view.displayWelcomeMessage();
        //Afficher la liste de type de jeu
        for (GameCollection gameCollection : GameCollection.values()) {
            System.out.println(gameCollection);
        }
        //Récupère la valeur de l'utilisateur
        String inputUser = InputUser.GetInputUser();
        //Récupère le jeu dans l'enum avec inputUser
        this.gameCollection = getGameTypeFromUserInput(inputUser);

    }


    public void startGame() {
        game = GameFactory.createGame(gameCollection);
        game.start();
    }

    private GameCollection getGameTypeFromUserInput(String userInput) {
        return GameCollection.valueOf(userInput.toUpperCase().trim());
    }
}
