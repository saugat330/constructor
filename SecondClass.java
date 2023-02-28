public class SecondClass {
    public int width;
    public int height;

    // paramertixed constructor
    SecondClass(int q ,int w){
        width=q;
        height=w;
    }


    public void second(){
        int result=width*height;
        System.out.println("this is second");
        System.out.println("area is result"+ result);
    }
    
}
