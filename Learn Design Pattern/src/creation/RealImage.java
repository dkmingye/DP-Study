package creation;

public class RealImage implements Image{
	
	public RealImage(String imageName){
		LoadImageFromDb(imageName);
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("Display Image");
	}
	
	public void LoadImageFromDb(String imageName){
		System.out.println("Load Image from Database! "+imageName);
	}

}
