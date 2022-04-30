package singleton;

/**
 * @author liukai
 * @date 2022-04-30
 * @descripition 饿汉单列模式在类加载的时候就会初始化，并创建单例对象
 * 优点：没有加锁，执行效率高，用户体验好
 * 缺点：类加载时就被初始化，无论使用与否都占用着空间，浪费内存
 */
public class HungrySingleton {

    //    public static final HungrySingleton hungrySingleton = new HungrySingleton();
    //或者使用静态代码块方式
    private static final HungrySingleton hungrySingleton;
    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}