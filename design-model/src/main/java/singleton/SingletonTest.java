package singleton;

/**
 * @author liukai
 * @date 2022-04-30
 * @description 单列模式确保一个类在任何状态下都只有一个实例，并提供一个全局访问点
 */
public class SingletonTest {

    public static void main(String[] args) {
        HungrySingleton instanceOne = HungrySingleton.getInstance();
        HungrySingleton instanceTwo = HungrySingleton.getInstance();
        System.out.println(instanceOne == instanceTwo);
    }
}