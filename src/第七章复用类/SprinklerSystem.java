package 第七章复用类;

/**
 * @ClassName: ReuseClass
 * @Author: liugui
 * @Date: 2020-03-12 22:13
 **/
public class SprinklerSystem {
    private String value1,value2,value3,value4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        return "SprinklerSystem{" +
                "value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                ", value3='" + value3 + '\'' +
                ", value4='" + value4 + '\'' +
                ", source=" + source +
                ", i=" + i +
                ", f=" + f +
                '}';
    }

    public static void main(String[] args) {
        SprinklerSystem system = new SprinklerSystem();
        System.out.println(system);
    }
}


class WaterSource{
    private String s;
    WaterSource(){
        System.out.println("WaterSource");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}