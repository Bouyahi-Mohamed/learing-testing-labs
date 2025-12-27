package Lab1;

class Calculator {

    public int addTen(int a){
        if (a < 0 ){
            throw new IllegalArgumentException("le valeur est pas positive");
        }else if  (a == 0){
            throw new IllegalArgumentException("le valeur est zero");
        }
        return a+10;
    }
}
