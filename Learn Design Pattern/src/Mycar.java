
public class Mycar {
	int x;
	public Mycar(int x){
		this.x=x;
	}
    public void printNum(){
    	System.out.println("car number : "+x);
    }
    
    private void printNumx(){ //you will not see this method outside of this class
    	System.out.println("car number : "+x);
    }
    
    static class theTier{
      static void printTierSize(){
        	System.out.println("the tier size is : "+9999);
        }
    	
    }
}
