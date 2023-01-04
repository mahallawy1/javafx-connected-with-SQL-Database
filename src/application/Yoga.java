package application;

import java.util.ArrayList;



public class Yoga extends Class{

	public Yoga(int capacity, int id, String classdate) {
        super(capacity, id, classdate);
    }

    public ArrayList<Member> getB() {
        return b;
    }

    public void setB(ArrayList<Member> b) {
        this.b = b;
    }

    @Override
    public String toString() {
          return "Class{" + "capacity=" + super.getCapacity() + ", id=" + super.getID() + ", classdate=" + super.getClassdate() + ", classtype= Yoga"   + ", Trainer : "+ super.getTrainer()+ '}'+", class members :"+ super.b+'}';
    }

    @Override
    public void setTrainer(Trainer trainer) {
        super.setTrainer(trainer); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Trainer getTrainer() {
        return super.getTrainer(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setClassdate(String classdate) {
        super.setClassdate(classdate); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setID(int id) {
        super.setID(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setCapacity(int capacity) {
        super.setCapacity(capacity); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getClassdate() {
        return super.getClassdate(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getID() {
        return super.getID(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getCapacity() {
        return super.getCapacity(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    

  
}
