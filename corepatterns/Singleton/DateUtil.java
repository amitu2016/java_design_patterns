package corepatterns.Singleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable{

    private static final long serialVersionUID = 1L;

    private static volatile DateUtil instance;

    private DateUtil(){

    }

    public static DateUtil getInstance(){ 
        
        if (instance == null) {
            synchronized(DateUtil.class){
                if (instance == null) {
                    instance = new DateUtil();
                }
            }
        }  
        return instance;  
    } 

    //To handle the serialization issue
    protected Object readResolve(){
        return instance;
    }

    //To handle cloning of object
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}