public class ChristmasTree{

  private String type;
  private String size;
  private Decoration[] branches;

  public ChristmasTree(String type, String size) {
    this.type = type;
    this.size = size;
    this.branches = new Decoration [50];
  }

  public String getType() {
    return this.type;
  }

  public String getSize() {
    return this.size;
  }

  public int decorationCount(){
    int count = 0;
    for (Decoration decoration : branches) {
      if (decoration != null){
        count ++;
      }
    }
    return count;
  }

  public boolean branchesOccupied(){
    return this.decorationCount() == branches.length;
  }

  public void addDecoration(Decoration bauble){
    if (branchesOccupied()) {
      return;
    }
    int decorationCount = this.decorationCount();
    branches[decorationCount] = bauble; 
  }

  public void removeDecoration(){
    for (int i = 0; i < branches.length; i++){
      branches[i] = null;
    }
  }

}