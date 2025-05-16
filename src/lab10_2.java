class Customer {
	private String Gender;
	private Clothes clothes;
	private Pants pants;
  
	public Customer(String Gender, String Size, String Color, int Waistline) {
		this.Gender = Gender;
		this.clothes = new Clothes(Size, Color);
		this.pants = new Pants(Waistline); 
		this.ShowInfo(clothes, pants);
	}
  
	private class Clothes{
		private String Size;
		private String Color;
		
		public Clothes(String Size2, String color2) {
			this.Size = Size2;
			this.Color = color2;
		}
		
		public String getSize() {
			return this.Size;
		}
		public String getColor() {
			return this.Color;
		}
		
	}
	private class Pants{
		private int Waistline;
		public Pants(int waistline2) {
			this.Waistline = waistline2;
		}
		public int getWaistline() {
			return this.Waistline;
		}
	}
  
	private void ShowInfo(Clothes clothes, Pants pants) {
		System.out.println("Gender:" + this.Gender);
		System.out.println("Size:" + clothes.getSize());
		System.out.println("Color:" + clothes.getColor());
		System.out.println("Waistline:" + pants.getWaistline());
	}
}