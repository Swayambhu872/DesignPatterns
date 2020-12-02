public class Main {
    public static void main(String [] args) {
        Cities cities = new Cities();
       Iterator it =  cities.getIterator();
       int index =0;
       try {
           while (it.hasNext()) {

               System.out.println(cities.cityNames[index]);
               ++index;
           }
       } catch (Exception ArrayIndexOutOfBoundsException) {
           System.out.println("Traversal complete");
       }
    }
}
