
public class TestGogglesIteratorDemo {
	
	public static void main(String[] args) {  
        GoggleRepository goggleRepository = new GoggleRepository();  
        System.out.println("Goggles ............ \n");  
        for(Iterator iter = goggleRepository.getIterator(); iter.hasNext();){  
            String goggle = (String)iter.next();  
            System.out.println(goggle);  
         }      
  }  

}
