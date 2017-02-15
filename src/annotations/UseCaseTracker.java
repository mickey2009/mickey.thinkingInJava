package annotations;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Mickey on 2017/2/15.
 * 反射处理注解
 */
public class UseCaseTracker {
    public static void trackUseCases(List<Integer> userCases, Class<?> cl) {
        for (Method method : cl.getDeclaredMethods()) {
            UseCase useCase = method.getAnnotation(UseCase.class);
            if (useCase != null) {
                System.out.println("Find UseCase: id=" + useCase.id() + " , description=" + useCase.description());
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<>(Arrays.asList(1, 2, 3));
        trackUseCases(useCases, PasswordUtils.class);
    }
}
