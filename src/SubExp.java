public class SubExp extends Expression {
    Expression left;
    Expression right;
    public SubExp(Expression l, Expression r){
        super();
        left=l;
        right=r;


    }
    @Override
    public String show() {
        return "("+left.show()+"-"+right.show()+")";
    }

    @Override
    public int evaluate() {
        return left.evaluate()-right.evaluate();
    }
}
