public class MinExp extends Expression{

    Expression value;
    public MinExp( Expression val){
        super();

        value=val;


    }
    @Override
    public String show() {
        return "("+"-"+value.show()+")";
    }

    @Override
    public int evaluate() {
        return -1*value.evaluate();
    }
}
