
class Room1{
    int length;
    int breadth;
    Room1(int x,int y){
        length=x;
        breadth=y;
    }
        int area(){
            return  length*breadth;
        }
    }

    class Bedroom extends Room1{
        int height;
        Bedroom(int x,int y,int z){
            super(x,y);
            height=z;
        }
        int volume(){
            return length*breadth*height;
        }
    }
        class Inheritance{
            public static void main(String a[]){
                Bedroom room1=new Bedroom(6,7,8);
                int area=room1.area();
                int volume=room1.volume();
               System.out.print("area="+area);
               System.out.print("volume="+volume);

                }
            }