package shape;

import java.util.Scanner;

public class Circle extends Shape{
    // instance variable    
    int radius;
    final String CHS_NAME = "圓形";
    // public to make other program use this method to create object
    // public Circle(int x1, int y1, int radius){
    //     this.x1 = x1;
    //     this.y1 = y1;
    //     this.radius = radius;
    // }
    
    public void show(){
        System.out.printf(CHS_NAME + "在" + "(%d , %d)的座標位置顯示。\n",this.x1,this.y1);
        System.out.printf("半徑大小為%d \n",this.radius);
    }

    public void setValue(){
        Scanner cin = new Scanner(System.in);
        System.out.printf("請輸入x座標\n");
        this.x1 = cin.nextInt();
        System.out.printf("請輸入y座標\n");
        this.y1 = cin.nextInt();
        System.out.printf("請輸入半徑\n");
        this.radius = cin.nextInt();
        this.show();
    }
    public void setValue2(){
        Scanner cin = new Scanner(System.in);
        String text = cin.nextLine();
        String[] tokens = text.split(" ");
        cin.close();
        int values[] = new int[tokens.length];
        for(int i=0;i<tokens.length;i++){
            values[i] = Integer.parseInt(tokens[i]);
        }
        this.x1 = values[0];
        this.y1 = values[1];
        this.radius = values[2];
        this.show();
    }
}
