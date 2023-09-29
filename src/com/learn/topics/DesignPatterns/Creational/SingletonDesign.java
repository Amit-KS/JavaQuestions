package com.learn.topics.DesignPatterns.Creational;

import java.io.Serializable;

public final class SingletonDesign implements Serializable {
    private static SingletonDesign instance;

    //To protect against reflection
    public SingletonDesign() throws Exception {
        if(instance!=null){
            throw new IllegalStateException("Instance creation not be created using reflection");
        }

    }

    @Override
    //To protect against clone
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    //To protect against serialization
     protected Object readResolve(){
        return instance;
     }

    public static synchronized SingletonDesign getInstance() {

        if(instance==null){
            try {
                instance = new SingletonDesign();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            return instance;
        }
return instance;

    }

}
