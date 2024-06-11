package GenericsListSet;

public class Box <T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        Box<String> name =new Box<>();
        Box<Integer> age = new Box<>();
        name.setT("Ade");
        age.setT(20);
        System.out.println(name.getT());
        System.out.println(age.getT());
    }
}
