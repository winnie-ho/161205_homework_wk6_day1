import static org.junit.Assert.*;
import org.junit.*;

public class TestChristmasTree{
  ChristmasTree christmasTree1;
  Bauble bauble;
  Lights lights;


  @Before
  public void before() {
    christmasTree1 = new ChristmasTree("Douglas Fir", "Large");
    bauble = new Bauble();
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
  public void
    canRemoveAllDecorations(){
      christmasTree1.addDecoration(bauble);
      christmasTree1.addDecoration(lights);
      assertEquals(2, christmasTree1.decorationCount());
      christmasTree1.removeAllDecorations();
      assertEquals(0, christmasTree1.decorationCount());
    }

    @Test
    public void breakDecoration() {
      christmasTree1.addDecoration(bauble);
      Decoratable decoration = christmasTree1.breakDecoration();
      Bauble original = (Bauble)decoration;
      // assertNotNull(food);
      // assertNotNull makes sure that something is returned, regardless if it is a salmon or a human. 
      assertEquals("Shiney sparkly baubles", original.sparkle());
    }

}