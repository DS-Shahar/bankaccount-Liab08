package Explorer;

public class Rectangle {
	private int length;
    private int width;
 
     public Rectangle(int length, int width) {
         this.length = length;
         this.width = width;
     }
     
     public void draw() {
    	 for(int i=0;i<length;i++) {
    		 for(int j=0;j<width;j++) {
    			 System.out.print("x");
        	 }
    		 System.out.println();
    	 }

     }

     public int calcArea() {
    	 int ca = length*width;
    	 return ca;
     }
     
     public int calcPerimeter() {
    	 int cp = 2*length +2*width;
    	 return cp;
     }
     
     public void scale(int factor){
    	length = factor*length;
    	width = factor*width;
     }
}
