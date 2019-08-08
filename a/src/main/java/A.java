import org.apache.commons.lang3.StringUtils;

import common.HelloUtil;
public class A {
    
    public static void main (String[] args) {
        System.out.println(StringUtils.SPACE + HelloUtil.hello(args[0]));
    }

}