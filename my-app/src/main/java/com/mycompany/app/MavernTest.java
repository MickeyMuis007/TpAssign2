package com.mycompany.app;

/**
 * Created by student on 2016/03/06.
 */
public class MavernTest {
    private boolean dog;
    private boolean cat;
    private float balance;
    private int age;

    public void setAge(int a){
        age = a;
    }
    public void setBalance(float b){
        balance = b;
    }
    public void setDog(boolean d){
        dog = d;
    }
    public void setCat(boolean c){
        cat = c;
    }
    public float getBalance()
    {
        return balance;
    }
    public int getAge()
    {
        return age;
    }
    public MavernTest getObject()
    {
        return this;
    }
    public boolean hasDog() {
        return dog;
    }
    public boolean hasCat(){
        return cat;
    }
}
