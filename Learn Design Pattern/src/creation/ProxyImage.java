package creation;

public class ProxyImage implements Image{
	RealImage realImage;
    String imageName;
	public ProxyImage(String imageName){
		this.imageName=imageName;
	}
	
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		if(realImage==null){
			realImage=new RealImage(imageName);
		}
		realImage.Display();
	}

}
