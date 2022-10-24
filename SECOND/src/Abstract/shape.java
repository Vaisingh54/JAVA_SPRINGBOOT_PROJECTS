package Abstract;

public abstract class shape {
	
	private float area;
	private float perimeter;
	

	     public abstract void calArea();
		
		public abstract void calPerimeter();

	
		
		public float getArea() {
			return area;
		}

		public void setArea(float area) {
			this.area = area;
		}

		public float getPerimeter() {
			return perimeter;
		}

		public void setPerimeter(float perimeter) {
			this.perimeter = perimeter;
		}
		
		
		public void print() {
			System.out.println("area is"+area);
			System.out.println("perimeter is"+perimeter);
		}
	

}
