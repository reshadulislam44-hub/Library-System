public class libary {
    String name ;
    String number;
    int browdedbook;
    int dayskept;
    float fine ;

    libary(String name ,String number ,int browdedbook,int dayskept,float fine){
        this.name=name;
        this .number = number ;
        this .browdedbook = browdedbook ;
        this .dayskept= dayskept;
        this.fine = fine;
    }


    void showdetails(){
        System.out.println("name "+name);
        System.out.println("number "+number);
        System.out.println("browed book  "+browdedbook);
        System.out.println("fine "+fine);

    }
    void calculate(){
        if (dayskept >7){
            fine=50f;
        }
    }
    void update(){
        System.out.println("name "+name);
        System.out.println("number "+number);
        System.out.println("browed book  "+browdedbook);
        System.out.println("fine "+fine);
    }

}


