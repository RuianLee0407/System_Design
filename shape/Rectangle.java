package shape;
import java.util.Scanner;

public class Rectangle{
    // instance variable    
    int x1;
    int y1;
    int w;
    int h;
    final String CHS_NAME = "長方形";
    // public to make other program use this method to create object
    // public Circle(int x1, int y1, int radius){
    //     this.x1 = x1;
    //     this.y1 = y1;
    //     this.radius = radius;
    // }
    private String next;
    
    public void show(){
        System.out.printf(CHS_NAME + "在" + "(%d , %d)的座標位置顯示。\n",this.x1,this.y1);
        System.out.printf("面積大小為%d \n",this.w * this.h);
    }

    public void setValue(){
        Scanner cin = new Scanner(System.in);
        System.out.printf("請輸入x座標\n");
        this.x1 = cin.nextInt();
        System.out.printf("請輸入y座標\n");
        this.y1 = cin.nextInt();
        System.out.printf("請輸入長度\n");
        this.h = cin.nextInt();
        System.out.printf("請輸入寬度\n");
        this.w = cin.nextInt();
        this.show();
    }
    public void setValue2(){
        Scanner cin = new Scanner(System.in);
        String text = cin.nextLine();
        cin.close();
        String[] tokens = text.split(" ");
        int values[] = new int[tokens.length];
        for(int i=0;i<tokens.length;i++){
            values[i] = Integer.parseInt(tokens[i]);
        }
        this.x1 = values[0];
        this.y1 = values[1];
        this.w = values[2];
        this.h = values[3];
        this.show();
    }
}

