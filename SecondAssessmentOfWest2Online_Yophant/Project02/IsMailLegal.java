import java.util.Scanner;
/*
要求：
* 1>邮箱不能为空
* 2>邮箱必须包含@和.
* 3>@必须在.的前面
*/

public class IsMailLegal {
    public static boolean isLegal(String email) {
        // 判断邮箱信息不能为空
        if (email.length() == 0) {
            System.out.println("邮箱不能为空!");
            return false;
        }
        // 判断邮箱信息必须包含@和.
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("邮箱格式不合法!");
            return false;
        }
        // 判断邮箱信息@必须在.的前面
        if (email.indexOf("@") > email.indexOf(".")) {
            System.out.println("邮箱格式不合法!");
            return false;
        }
        System.out.println("邮箱合法");
        return true;
    }

    public static void main(String[] args) {
        String email = null;
        Scanner sn = new Scanner(System.in);
        System.out.println("请输入邮箱:");
        email = sn.next();
        isLegal(email);
    }

}