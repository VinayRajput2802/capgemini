package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
    private String name;
    @Autowired
    @Qualifier("petrol")
    private IEngine engine;
    @Autowired
    @Qualifier("mrf")
    private ITyre tyre;

    public Car(){}

    public Car(PetrolEngine engine,MRFtyre tyre){
        this.engine = engine;
        this.tyre = tyre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public ITyre getTyre() {
        return tyre;
    }

    public void setTyre(ITyre tyre) {
        this.tyre = tyre;
    }

    public void PrintCarDetails(){
        System.out.println("Car Name: "+this.name);
        System.out.println("Car Engine: "+this.engine.getBHP());
        System.out.println("Car Tyre: "+this.tyre.getTyre());
    }

}
