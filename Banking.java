class Banking{
    String name;
    int age;
    long aadhar;

    public double withdraw(){
        double balance;


        return balance;
    }

    public double deposit(){
        double balance;

        return balance;
    }
    void getInfo(){
        System.out.println("Enter the Name");
        this.name=sc.nextLine();
        System.out.println("Enter the Age");
        this.age=sc.nextInt();
        System.out.println("Enter the Aadhar no.");
        this.aadhar=sc.next();
    }
    void displayInfo(name){
        try{
        System.out.println("Name= "+name\n+"Age="+age\n+"Aadhar no.="+aadhar\n+"Balance="+balance);
        }
        except{
            System.out.println("Name not found");
        }
    }
}