import java.util.Arrays;

public
class House{


    private int floorsNumber;
    private String address;
    private String[] residentsName;

    public int getFloorsNumber(){
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber){
        this.floorsNumber = floorsNumber;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }


    public String getResidentsName(){
        String temp = "";
        for (String s : residentsName){
            temp += s+" - ";
        }
        return temp;
    }

    public String[] setResidentsName(String[] residentsName){
        this.residentsName = residentsName;
        return residentsName;
    }

    @Override
    public String toString(){
        return "House{"+
                "floorsNumber="+floorsNumber+
                ", address='"+address+'\''+
                ", residentsName="+Arrays.toString(residentsName)+
                '}';
    }
}
