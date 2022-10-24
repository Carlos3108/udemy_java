package oo.heranca;

public class Player {

    int vida = 100;
    int x;
    int y;

    boolean atacar(Player oponente){
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);
        if (deltaX == 0 && deltaY == 1){
            oponente.vida -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -=10;
            return true;
        } else {
        return false;
        }
    }
    boolean andar(Direcao direcao){
        switch (direcao) {
            case NORTE -> y++;
            case SUL -> y--;
            case LESTE -> x++;
            case OESTE -> x--;
        }
        return true;
    }
}
