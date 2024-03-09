import stack.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main implements Sample {
    public static void main(String[] args) {
     Stack myStack=new Stack(4);

     myStack.getTop();
     myStack.getHeight();

     myStack.printStack();

    }

    @Override
    public void darw() {
        System.out.println("i = ");
    }
}