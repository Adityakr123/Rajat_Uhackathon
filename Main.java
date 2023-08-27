// import java.lang.*;

class Shovel{
    int N;
    Double PayloadTime;
    Shovel(){}
    Shovel(Double PT){
        this.PayloadTime = PT;
    }
}

class Dumper extends Shovel{
    double ND;
    int Capacity;
    Double Haul;
    int speed;
    Dumper(){

    }

    Dumper(int Capacity){
        this.Capacity=Capacity;
    }

    int Speed(){
        if(Capacity == 50)
        {
            speed = 15;
        }
        else if(Capacity == 25)
        {
            speed = 20;
        }
        else{
            speed = 25;
        }
        return speed;
    }
    
    double Haul(double time){
        double Pt = 5.5;
        Haul = Pt + time;
        return Haul;
    }
    int NoOfDumper(){
        return 0;
    }
}

public class Main{

    public static void main(String[] args) {
        Dumper obj = new Dumper(50);
        Shovel obj1 = new Shovel(5.0);
        
        int speed = obj.Speed();
        double distance = 4.2;
        
        double time = distance/speed;
        double HaulTime = obj.Haul(time);
        double loadTime = obj1.PayloadTime;
        obj.ND = HaulTime/loadTime;
        double numberOftruck = obj.ND;
        System.out.printf("Number of trucks are: %d", (int)numberOftruck);
    }
}