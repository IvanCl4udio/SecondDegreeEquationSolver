public class Calculate {

  public Root calculateDelta(Root root) {
    root.setDelta(root.getB() * root.getB() - 4 * root.getA() * root.getC());
    return root;
  }

  public Root calculateRoots(Root root) {
    double delta = root.getDelta();
    if (delta < 0) {
      System.out.println("Delta negative. Impossible to continue with this program");
      return root;
    }
    root.setX1(
        (-root.getB() + Math.sqrt(root.getDelta())) / 2 * root.getA());
    root.setX2(
        (-root.getB() - Math.sqrt(root.getDelta())) / 2 * root.getA());
    return root;
  }
}