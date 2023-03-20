class Main {
  public static void main(String[] args) {
    Root root = new Root(1,-3,2);
    Calculate calc = new Calculate();
    calc.calculateDelta(root);
    calc.calculateRoots(root);
    System.out.println("Delta = " + root.getDelta());
    System.out.println("X1 = " + root.getX1());
    System.out.println("X2 = " + root.getX2());
    
  }
}