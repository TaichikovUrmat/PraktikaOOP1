public class Rectangle {

  int length;
  int widht;

  public Rectangle(){}

  public Rectangle(int length, int widht){
      this.length =length;
      this.widht = widht;
  }
   public int setLengtth(){
       return length;
   }
   public int getWidht(){
      return widht;
   }


    public void Rrrrrr(){
      this.length = 5;
      this.widht = 7;

      int suum = (length*widht);
        System.out.println(suum);
    }
}