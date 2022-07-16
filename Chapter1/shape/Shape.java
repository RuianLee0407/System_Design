package Chapter1.shape;

public class Shape {
    // this is the instance variable of the parent class
    // 子類別也會擁有 x1 , y1
    int x1;
    int y1;
    public void printOrigin(){
        System.out.printf("the origin is (%d , %d)",x1,y1);
    }    
}
