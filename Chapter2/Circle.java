import javax.lang.model.util.Elements.Origin;

class Circle{
    // field
    // field 的功能 就是紀錄 物件的狀態 或屬性
    // 可以 是這些 資料成員 為 實例變數(Instance variable)
    // 透過 類別建立 並放入不同的值，就能建立多個不同的物件
    private int x1;
    private int y1;
    private int radius;
    private String color;
    // 封裝 Step1 => 設定為 私有


    // this method called Constructor
    // 可以快速的幫你 初始化 實體變數
    public Circle(int x1,  int y1, int radius){
        this.x1 = x1;
        this.y1 = y1;
        this.radius = radius;
    }

    // 設定 getter and setter 方法為 public，讓外部可以使用設定 field值 
    public void setColor(String color){
        this.color = color;
        System.out.println("color:"+this.color);
    }

    // this is called method
    // 用來實作 物件 所具備 擁有 的行為 或稱 功能
    public void showInfo(){
        System.out.printf("Origin:(%d , %d) \n",this.x1,this.y1);
        System.out.printf("Radius:%d \n",this.radius);
    }


}