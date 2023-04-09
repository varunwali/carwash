import java.util.Scanner;

interface x1 {
    void allot();

    void release();

    void carDet();
}

class car implements x1 {
    Scanner n = new Scanner(System.in);
    public String cname;
    int chN;
    String Date;
    int number;

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setChN(int chN) {
        this.chN = chN;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getCname() {
        return cname;
    }

    public void setnumber(int number) {
        this.number = number;
    }

    public int getnumber() {
        return number;
    }

    public void allot() {
        if (number < 3) {
            System.out.println("Your " + cname + " is Taken in for Service");
            System.out.println("kindly wait for 30 mins");
        } else {
            System.out.println("NO Washing for today you can come tommorrow");
        }
    }

    public void carDet() {
        System.out.println("\n\nName is : " + cname);
        System.out.println("Chassi Number is : " + chN);
        System.out.println("Service Done :" + Date);
        System.out.println("next Service is in 120 Days From " + Date);
    }

    public void release() {
        while (true) {
            System.out.println("Your " + cname + " is Ready !!!\n kindly Pay the Charge ");
            int charge = n.nextInt();
            if (charge == 400 || charge == 500 || charge == 300) {
                System.out.println("--> Thank You Please Visit again <---");
                break;
            } else {
                throw new IllegalStateException("Make Valid Payment Please");
            }
        }
    }
}

public class carwash {
    public static void main(String[] args) {
        car c1 = new car();
        int ch, v = 0;
        System.out.println("--> WELCOME TO CAR Service Centre <--\n");
        Scanner inp = new Scanner(System.in);
        while (true) {
            System.out.println("* enter Your Choice plzz *");
            System.out.println("1.Entry\n2.Exit\n3.Details of car");
            ch = inp.nextInt();
            if (ch == 1) {
                v++;
            }
            if (v > 1) {
                System.out.println("Please wait for:" + (v - 1) * 30);
            }
            try {
                int y = 10 / ch;
            } catch (Exception e) {
                System.out.println("---> u written 0 Write Correct Option!!!!!! <---");
            }
            switch (ch) {
                case 1:
                    System.out.println("Please Enter Details Of your Vehicle");
                    System.out.println("Enter Name :"); // taking car details from user
                    inp.nextLine();
                    String car1 = inp.nextLine();
                    c1.setCname(car1);
                    System.out.println("Enter Chassi Number :");
                    int t = inp.nextInt();
                    c1.setChN(t);
                    c1.setnumber(v);
                    System.out.println("Choose Your Plan");
                    System.out.println(
                            "1.Basic Wash------> Rs. 400 \n2.Foam Wash------> Rs. 600 \n3.Oil CheckUp------> Rs. 300 ");
                    int i = inp.nextInt();
                    System.out.println("Enter Todays Date");
                    String u = inp.nextLine();
                    c1.setDate(u);
                    switch (i) {
                        case 1:
                            System.out.println("\nYOU CHOOSE BASIC WASH");
                            c1.allot();
                            break;
                        case 2:
                            System.out.println("\nYOU CHOSE FOAM WASH");
                            c1.allot(); // calling functions
                            break;
                        case 3:
                            System.out.println("\nYOU CHOSE OIL CHECK");
                            c1.allot();
                            break;
                        default:
                            System.out.println("\nchoose a option");
                            break;
                    }
                    break;
                case 2:
                    c1.release();
                    break;
                case 3:
                    c1.carDet();
                    break;
                default:
                    System.out.println("Enter Valid Choice");
            }
        }
    }
}