package annotations;

/**
 * Created by Mickey on 2017/2/15.
 * 使用注解
 */
public class PasswordUtils {
    @UseCase(id = 1 , description = "validatePassword")
    public  boolean validatePassword(String password){
        return  password.matches("\\w*\\d\\w*");
    }

    @UseCase(id = 2 )
    public String encryptPassword(String password){
        return  new StringBuilder(password).reverse().toString();
    }
}
