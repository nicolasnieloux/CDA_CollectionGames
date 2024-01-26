package fr.lecampusnumerique.games.utils;

import fr.lecampusnumerique.games.GameCollection;

public class GameLauncher {

    public GameLauncher(){
        //Afficher la liste de type de jeu
        System.out.println("Bienvenue chez Charly's Games");
        for(GameCollection game :  GameCollection.values()){
            System.out.println(game);
        }

    }
//    createGame();
}
