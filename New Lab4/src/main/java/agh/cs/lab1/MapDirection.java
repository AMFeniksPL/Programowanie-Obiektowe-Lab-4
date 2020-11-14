package agh.cs.lab1;

public enum MapDirection{
    NORTH,
    SOUTH,
    EAST,
    WEST;

    public String toString(){
        String kierunekPl;
        switch(this){
            case NORTH:
                kierunekPl = "Północ";
                break;
            case SOUTH:
                kierunekPl = "Południe";
                break;
            case EAST:
                kierunekPl = "Wschód";
                break;
            case WEST:
                kierunekPl = "Zachód";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + this);
        }
        return kierunekPl;
    }

    public MapDirection next()
    {
        MapDirection result=null;
        switch(this) {
            case NORTH:
                result = EAST;
                break;
            case SOUTH:
                result = WEST;
                break;
            case EAST:
                result = SOUTH;
                break;
            case WEST:
                result = NORTH;
                break;
        }
        return result;
    }

    public MapDirection previous()
    {
        MapDirection result=null;
        switch(this) {
            case NORTH:
                result = WEST;
                break;
            case SOUTH:
                result = EAST;
                break;
            case EAST:
                result = NORTH;
                break;
            case WEST:
                result = SOUTH;
                break;
        }
        return result;
    }

    public Vector2d toUnitVector(){
        Vector2d kierunekPl;
        switch(this){
            case NORTH:
                kierunekPl = new Vector2d(0,1);
                break;
            case SOUTH:
                kierunekPl = new Vector2d(0,-1);
                break;
            case EAST:
                kierunekPl = new Vector2d(1,0);
                break;
            case WEST:
                kierunekPl = new Vector2d(-1,0);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + this);
        }
        return kierunekPl;
    }
}


