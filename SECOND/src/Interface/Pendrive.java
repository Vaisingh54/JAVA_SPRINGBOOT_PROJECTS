package Interface;



public interface Pendrive {
   //constants----> variables of Interface public, static, final
   public static final String name="Tansient";
   
   
   
   public void read();
   public default void write() {
       hello();
       System.out.println("Writing");
   }
   
   private void hello()
   {
       System.out.println("Hello world!!");
   }
   public void scan();
   public default void format() {
       System.out.println("Formatting");
   }
   



}
