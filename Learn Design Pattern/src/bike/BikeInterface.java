package bike;

//In its most common form, 
//an interface is a group of related methods with empty bodies.

interface BikeInterface {

//  wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}


//The Java platform provides an enormous class library 
//(a set of packages) suitable for use in your own applications. 
//This library is known as the "Application Programming Interface", or "API" for short. 