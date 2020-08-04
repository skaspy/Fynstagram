import ea.Bild;
import ea.Knoten;

/**
 * Klasse für aktive Spieler
 * Struktur aus dem Beispiel demo-netzwerkgame-master
 */
public class Player extends Knoten {



    private float posX;
    private float posY;

    private int walkspeed = 4; // Laufgeschwindigkeit


    private ImageCollection2 IC2;

    public Player(float posX,float posY){

        super();
        this.posX=posX;
        this.posY=posY;

        IC2= new ImageCollection2(this.posX,this.posY,"./Assets/SpielerTest/Spieler");
        IC2.Init();

        this.add(IC2);

        ;

    }

    @Override
    public void verschieben(float dX, float dY) {
        super.verschieben(dX, dY);
        posX= posX+dX;
        posY= posY+dY;

    }
/*
    @Override

    public void positionSetzen(float x, float y) {
        super.positionSetzen(x, y);
        posX= x;
        posY= y;
    }

     */
float lastX = posX;
    public void WalkLeft() {
        IC2.walkLeft(walkspeed);
        //IC.verschieben(-walkspeed,0);
    }

    public void WalkRight(){
        IC2.walkRight(walkspeed);
        //IC.verschieben(walkspeed,0);
    }
    public void WalkBottom(){
        IC2.walkBottom(walkspeed);
        //IC.verschieben(0, walkspeed);
    }
    public void WalkTop(){
        IC2.walkTop(walkspeed);
        //IC.verschieben(0, -walkspeed);
    }

    //public ImageCollection getIC(){   return IC; }





    public float getCenterX(){
        return (posX+this.getBreite()/2);
    }
    public float getCenterY(){
        return (posY+this.getHoehe()/2);
    }
    public int getWalkspeed(){
        return walkspeed;
    }
}