import static org.junit.Assert.assertEquals;
import org.junit.*;

public class TestChristmasTree{
  ChristmasTree christmasTree1;
  Decoration bauble;

  @Before
  public void before() {
    christmasTree1 = new ChristmasTree("Douglas Fir", "Large");
    bauble = new Decoration();
  }

  @Test
  public void treeHasType() {
    assertEquals("Douglas Fir", christmasTree1.getType());
 }

 @Test
   public void treeHasSize() {
    assertEquals("Large", christmasTree1.getSize());
 }

 @Test
  public void treeStartsBare(){
    assertEquals(0, christmasTree1.decorationCount());
  }

  @Test
  public void canAddDecoration(){
    christmasTree1.addDecoration(bauble);
    assertEquals(1, christmasTree1.decorationCount());
  }

  @Test
  public void cannotAddDecorationsWhenBranchesAreFull(){
    for (int i = 0; i < 55; i++){
      christmasTree1.addDecoration(bauble);
    }
    assertEquals(50, christmasTree1.decorationCount());
  }

  @Test
  public void
    canRemoveDecorations(){
      christmasTree1.addDecoration(bauble);
      assertEquals(1, christmasTree1.decorationCount());
      christmasTree1.removeDecoration();
      assertEquals(0, christmasTree1.decorationCount());
    }

}