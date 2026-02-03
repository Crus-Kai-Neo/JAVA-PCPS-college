package week3PracticalTasks;

public class SmartDevice {
    int deviceID;
    String deviceName;
    boolean status;
    int batteryLevel;

    SmartDevice(int deviceID,String deviceName,boolean status,int batteryLevel){
        this.deviceID = deviceID;
        this.deviceName = deviceName;
        this.status = status;
        this.batteryLevel = batteryLevel;
    }

    public void changeStatus(){
        status = !status;
    }
    public void checkBatteryStatus(){
        System.out.println(batteryLevel);
    }
    public void show(){
        System.out.println("device id: " + deviceID);
        System.out.println("device name: " + deviceName);
        System.out.println("Status: " + status);
        System.out.println("battery level: " + batteryLevel);
    }
}

class ExampleSmartDevice{
    public static void main(String[] args){
        SmartDevice s1 = new SmartDevice(001,"TV", true, 90);
        SmartDevice s2 = new SmartDevice(002,"Washing Machine", false, 80);
        SmartDevice s3 = new SmartDevice(003,"AC", true, 50);

        s1.changeStatus();


    }
}