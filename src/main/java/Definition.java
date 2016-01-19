import java.util.ArrayList;




public class Definition {
  private String mInputDef;
  private boolean mIsCompleted;
  private static ArrayList<Definition> instances =new ArrayList<Definition>();
  private int mId;


  public Definition(String inputDef) {
  mInputDef = inputDef;
  mIsCompleted = false;
  instances.add(this);
  mId = instances.size();
  }

  public String getInputDef() {
    return mInputDef;
  }

  public boolean isCompleted() {
    return mIsCompleted;
  }

  public void completeDefinition() {
    this.mIsCompleted = true;
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
