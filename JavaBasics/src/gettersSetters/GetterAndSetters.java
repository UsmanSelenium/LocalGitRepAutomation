package gettersSetters;

class GetterAndSetters {
	private int sID;
	private String sName;
	private String sClass;

//To access PRIVATE Variables in other class, we need create Setters and Getters
	public int getsID(){
		return sID;		
	}
	
	public void setsID(int sID) {
		this.sID = sID;
	}
	
	public String getsName() {
		return sName;
	}
	
	public void setsName(String sName) {
		this.sName= sName;
	}
	
	public String getsClassName() {
		return sClass;
	}
	
	public void setsClassName(String sClass) {
		this.sClass = sClass;
	}
}

