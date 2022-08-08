public class Player {
    private String name;
    private int playerNumber, start, end, mancala;

    public Player() {
        name = "none";
        playerNumber = 0;
    };

    public Player(String n, int _player) {
        name = n;
        playerNumber = _player;
        if(_player == 1) {
            start = 0;
            end = 5;
            mancala = 6;
        } else {
            start = 7;
            end = 12;
            mancala = 13;
        }
    }

    public String getName(){
        return name;
    }
    
    public int getStart() {
        return start;
    }
    
    public int getEnd() {
        return end;
    }

    public int getMancala() {
        return mancala;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }
    
    public void setName(String n) {
        name = n;
    }
}