class ReturningValueType  {
  public static void main(String[] args) {
    int area;
    area = getArea(3,4);
    System.out.println(area);
  }

  public static int getArea (int height, int width){
    return height * width;
  }
}
