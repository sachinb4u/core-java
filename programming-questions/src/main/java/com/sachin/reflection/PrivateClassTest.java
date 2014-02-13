package com.sachin.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created with IntelliJ IDEA.
 * User: sbhosale
 * Date: 12/2/13
 * Time: 7:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrivateClassTest {



    public  static void main (String[] agrs){
        try {
            Class<?> pvClass =  Class.forName(PrivateClass.class.getName());
            Constructor<?>[] contrs = pvClass.getDeclaredConstructors();
            contrs[0].setAccessible(true);
            Object obj = contrs[0].newInstance(new Object[]{});
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (InvocationTargetException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (InstantiationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}


final class PrivateClass{

    private PrivateClass(){
        System.out.println("In private constructor");
    }


}
