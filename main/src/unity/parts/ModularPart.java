package unity.parts;

public class ModularPart{
    public ModularPartType type;
    int x,y;
    float ax,ay;
    int[] panelingIndexes;

    //editor only fields
    boolean valid = false;



    public ModularPart(ModularPartType type, int x, int y){
        this.type = type;
        this.x = x;
        this.y = y;
        panelingIndexes = new int[type.w * type.h];
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }
    public void setPos(int x, int y){
        this.x = x;
        this.y = y;
    }

    public float getAx(){
        return ax;
    }

    public float getAy(){
        return ay;
    }
}