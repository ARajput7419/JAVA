
class Aa{
    Number aniket(){
        return 10;
    }
}
class Ab extends Aa{
    Integer aniket(){
        return 20;
    }
}


class Practice  {


    public static void main(String[] args) {
     Aa op = new Aa();
     Number ya = op.aniket();
     System.out.println(ya);
    }
}