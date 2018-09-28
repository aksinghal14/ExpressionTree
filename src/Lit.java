public class Lit extends Expression {
    int value;
    public Lit(int value){
        super();
        this.value=value;
    }
    @Override
    public String show() {
        if(value<0){
            return "("+""+value+")";

        }


        return ""+value;
    }

    @Override
    public int evaluate() {
        return value;
    }
}
