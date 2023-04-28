public class Pokemon  {
    protected String name;
    protected int hitPoints;
    protected String move;
    protected int movePower;
    protected int attackSpeed;

    Pokemon(String n, int HP, String m, int MP, int AS){
        this.name = n;
        this.hitPoints = HP;
        this.move = m;
        this.movePower = MP;
        this.attackSpeed = AS;
    }

    public String getName(){
        return name;
    }

    public int getHitPoints(){
        return hitPoints;
    }

    public String getMove(){
        return move;
    }

    public int getMovePower(){
        return movePower;
    }

    public int getAttackSpeed(){
        return attackSpeed;
    }

    public String setName(String n){
        name = n;
        return name;
    }

    public int setHitPoints(int HP){
        hitPoints = HP;
        return hitPoints;
    }

    public String setMove(String m){
        move = m;
        return move;
    }

    public int setMovePower(int MP){
        movePower = MP;
        return movePower;
    }

    public int setAttackSpeed(int AS){
        attackSpeed = AS;
        return attackSpeed;
    }

    public String displayPokemonStats(){
        return "----------------\nName: " + name + "\nHit Points: " + hitPoints + "\nMove: " + move + "\nMove Power: " + movePower + "\nAttack Speed: " + attackSpeed;
    }
}
