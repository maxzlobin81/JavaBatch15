package class27;

public class Car extends Insurance {
    String carModel;
Car(String carModel,String insuranceName) {
    this.carModel=carModel;
    super.insuranceName=insuranceName;
  }
}