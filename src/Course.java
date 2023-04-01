public class Course {

     public int id = 10;
     public String print() {
          String str = String.format("\"---<%d>---\"", id);
          System.out.println(str);
          return str;



}
}
