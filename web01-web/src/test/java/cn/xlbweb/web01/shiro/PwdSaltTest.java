package cn.xlbweb.web01.shiro;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;

/**
 * @auther: bobi
 * @date: 2018/7/13 20:23
 * @description:
 */
public class PwdSaltTest {

    @Test
    public void testMD5(){
        String pwd = "111111";
        String salt = "abcdefghijklmnopqrstuvwxyz";
        /**
         *  Md5Hash(Object source, Object salt, int hashIterations)
         *  source：明文，原始密码
         *  salt：盐，通过使用随机数
         *  hashIterations：散列次数
         */
        Md5Hash md5Hash = new Md5Hash(pwd, salt, 2);
        String md5Pwd = md5Hash.toString();
        System.out.println(md5Pwd);

        /**
         *  SimpleHash(String algorithmName, Object source, Object salt, int hashIterations)
         *  algorithmName：算法名称
         *  source：明文，原始密码
         *  salt：盐
         *  hashIterations：散列次数
         */
        SimpleHash simpleHash = new SimpleHash("md5", pwd, salt, 2);
        System.out.println(simpleHash);
    }
}
