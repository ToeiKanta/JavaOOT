
package oot.lab7;

public class Ball implements Move{
    private int x,y;
    public Ball(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "The current location of the ball = (" + x +"," + y + ")";
    }
    @Override
    public void moveUp() {
        y++;
        System.out.print("Ball move up location: ");
        System.out.println("(" +x+ ","+y+ ")");
    }

    @Override
    public void moveDown() {
        y--;
        System.out.print("Ball move down location: ");   
        System.out.println("(" +x+ ","+y+ ")");
    }

    @Override
    public void moveLeft() {
        x--;
        System.out.print("Ball move left location: ");  
        System.out.println("(" +x+ ","+y+ ")");
    }

    @Override
    public void moveRight() {
        x++;
        System.out.print("Ball move right location: ");   
        System.out.println("(" +x+ ","+y+ ")");
    }
    
}
