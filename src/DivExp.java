import com.sun.org.apache.xpath.internal.operations.Div;

public class DivExp extends Expression {

    Expression left;
    Expression right;
    public DivExp(Expression l,Expression r){
        super();
        this.left=l;
        this.right=r;
    }
    @Override
    public String show() {
        return "("+left.show()+"/"+right.show()+")";
    }

    @Override
    public int evaluate() {
        return left.evaluate()/right.evaluate();
    }
}
