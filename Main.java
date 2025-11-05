

public class Main {
    public static void main(String[] args) {
        libary [] l = new libary[2];

        l[0]=new libary("reshad", "01774787708",182,8,0);
        l[1]=new libary("Sabrina","01718098981",124,5,  0);
        for(int j=0;j<2;j++){
            l[j].showdetails();
            l[j].calculate();
            l[j].update();

        }


    }
}
