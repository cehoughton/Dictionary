import java.util.ArrayList;




public class Definition {
  private String mInputDef;
  private static ArrayList<Definition> instances =new ArrayList<Definition>();
  private int mId;


  public Definition(String inputDef) {
  mInputDef = inputDef;
  instances.add(this);
  mId = instances.size();
  }

  public String getInputDef() {
    return mInputDef;
  }

  public static ArrayList<Definition> all() {
      return instances;
  }

  public static Definition find(int id) {
      try {
          return instances.get(id - 1);
      } catch (IndexOutOfBoundsException iobe) {
          return null;
      }
  }
  public static void clear() {
        instances.clear();
  }

   public int getId() {
    return mId;
  }
}
