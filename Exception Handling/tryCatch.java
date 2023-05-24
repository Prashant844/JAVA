class exception_handle_using_trycatch {
  public static void main(String[] args) {
    System.out.println("..........Start of the code...........");
    System.out.println(" ");

    // try block
    try {
      int x = 10 / 0;
      System.out.println("Value of the X is =" + x);
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("..........Rest of the code...........");
  }
}
