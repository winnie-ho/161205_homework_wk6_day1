import java.util.*;

public class ChristmasTree{

  private String type;
  private String size;
  private ArrayList<Decoratable> branches;

  public ChristmasTree(String type, String size) {
    this.type = type;
    this.size = size;
    this.branches = new ArrayList<Decoratable>();
  }

  public String getType() {
    return this.type;
  }

  public String getSize() {
    return this.size;
  }

  public int decorationCount(){
    return branches.size();
  }

  public void addDecoration(Decoratable decoration){
    branches.add(decoration);
  }

  public Decoratable breakDecoration() {
    if (decorationCount() > 0) {
      return branches.remove(0);
    }
    return null;
   }

  public void removeAllDecorations(){
    branches.clear();
  }
}