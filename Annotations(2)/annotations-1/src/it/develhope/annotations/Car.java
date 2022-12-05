package it.develhope.annotations;

public class Car{
    private String modelName;
    private int mileage;

    public Car(String modelName,int mileage){
        this.setModelName(modelName);
        this.setMileage(mileage);
    }

    /**
     * Method that prints the car details in one line
     */
    @Deprecated
    public void printCarDetails(){
        System.out.println("Car model name; "+this.modelName+" Mileage: "+this.mileage);
    }

    /**
     * Method that prints the car details in multiple lines
     */
    public void getCarDetails(){
        System.out.printf("Car model name %s %n Mileage %d ",this.modelName,this.mileage);
    }


    public String getModelName(){
        return modelName;
    }

    public void setModelName(String modelName){
        this.modelName = modelName;
    }

    public int getMileage(){
        return mileage;
    }

    public void setMileage(int mileage){
        this.mileage = mileage;
    }
}
