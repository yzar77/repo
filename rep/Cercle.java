public class Cercle{
	private float x;
	private float y;
	Cercle(float xx, float yy)
	{
		this.x=xx;
		this.y=yy;
	}
	Cercle(){
		this.y=12;
		this.x=24;
	}
	Cercle(Cercle a){
		a.y=this.y;
		a.x=this.x;
	}
	public String toString(){
		return x + " " + y;
	}
	public boolean equals(Cercle a){
		if(a.x == this.x && a.y == this.y){
			return true;
		}		
		else {
			return false;
		}
	}
}