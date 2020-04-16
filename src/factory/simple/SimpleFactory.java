package factory.simple;

/**
 * @author: Guowei
 * 2020-04-15
 *
 */
public class SimpleFactory {
    //规定类型
    public static Human makeHumanBySex(String sex) {
        if ("man".equals(sex)) {
            return new Man();
        } else if ("woman".equals(sex)) {
            return new Woman();
        } else {
            throw new RuntimeException("性别不重要");
        }

    }

    public static Human makeHumanByClass(Class sex) {
        Human human = null;
        try {
            human = (Human) Class.forName(sex.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return human;
    }

}
