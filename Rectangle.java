
class Rectangle{
    int length, width;
    /*void area(int x,int y){
        length=x;
        width=y;
        int area=length*width;
        System.out.println("Length of rectangle is: "+length);
        System.out.println("Width of rectangle is: "+width);
        System.out.println("Area of rectangle is: "+area);
    }
    public static void main(String args[]){
        Rectangle rect=new Rectangle();//object  of class  creation
        rect.area(5,10);
    }
}
*/

        //Implementation of this Keyword for area of rectangle
     
    

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        int result = this.length * this.width;
        System.out.println("Area of rectangle: " + result);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        r.area();
    }
}
