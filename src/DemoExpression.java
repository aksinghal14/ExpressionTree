
public class DemoExpression {
    public static void main(String[] args) {
        Expression e=new Lit(5);
        System.out.println(e.show()+" value is "+e.evaluate() );
        Expression exp2 = new AddExp(new Lit(1), new Lit(1));
        System.out.println(exp2.show() + " evaluates to " + exp2.evaluate());
        Expression exp3 = new MutExp(new Lit(3), new SubExp(new Lit(3), new Lit(-2)));
        System.out.println(exp3.show() + " evaluates to " + exp3.evaluate());
        Expression exp4 = new DivExp(new Lit(7), new MinExp(new Lit(-3)));
        System.out.println(exp4.show() + " evaluates to " + exp4.evaluate());


    }
}
