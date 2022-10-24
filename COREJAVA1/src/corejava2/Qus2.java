package corejava2;




public class Qus2 {
    public boolean powerTwo(int n) {
      while (n != 1)
      {
          if (n % 2 != 0)
              return false;
          n = n / 2;
      }
      return true;
    }
    public static void main(String[] args) {
       
        Qus2 obj = new Qus2();
        
        int a =128 ;
        
        boolean b = obj.powerTwo(a);
        if(b)
        System.out.println("a  is Power of 2");
        else
            System.out.println("a is not power of 2");
    }

 

}


