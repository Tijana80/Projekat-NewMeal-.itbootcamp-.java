
import java.util.ArrayList;





public abstract class Nutriment extends Grocery{
  
    private double weight;
    private double kcal;
    private double proteins;
    private double carbohydrates;
    private double fats;
    private double fiber;

    public Nutriment(double weight, double kcal, double proteins, double carbohydrates, double fats, double fiber, String company, String name) {
        super(company, name);
        this.weight = weight;
        this.kcal = kcal;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.fiber = fiber;
    }

    
 ArrayList<Nutriment>n=new ArrayList<>();
  

    public double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public double getKcal() {
        return kcal;
    }

    public void setKcal(double kcal) {
        this.kcal = kcal;
    }

    public double getProteins() {
        return proteins;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;} 

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public double getFiber() {
        return fiber;
    }

    public void setFiber(double fiber) {
        this.fiber = fiber;
    }
    
   
  public void  update(String company,String name,Double weight,Double kcal,Double proteins,Double carbohydrates,Double fats,Double fiber) 
  {for(Nutriment nt:n){
  if(nt.getCompany().equals(company)&& nt.getName().equals(name)){
  nt.setWeight(weight);
  nt.setProteins(proteins);
  nt.setKcal(kcal);
  nt.setCarbohydrates(carbohydrates);
  nt.setFats(fats);
  nt.setFiber(fiber);
  return;}
      
      }
  
  }
  
  
    @Override
    public boolean equals(Object o) {
        Nutriment n=(Nutriment)o;
       if(super.getName().equals(n.getName()) && super.getCompany().equals(n.getCompany()))
       return true;
       return false;
    }

    @Override
    public String toString() {
        return "Company: " + super.getCompany()+ "\n"+
                "Name: "+ super.getName() + "\n"+
                "Weight: 100g" + "\n" +
                "Kcal: " +kcal +"\n"+
                "Proteins: " + proteins+ "%" +"\n"+
                "Carbohydrates: " + carbohydrates + "%" + "\n"+
                "Fats: " + fats + "%" +"\n"+
                "Fiber: " + fiber + "%" + "\n";          
    }
  
public String totalNutrientTable(){
return "Weight: " + weight+ "\n"+
        "Proteins: "+(weight/10)*proteins +"\n"+
        "Kcal: " + (weight/10)*kcal + "\n"+
        "Proteins: " + (weight/10)*proteins +"\n"+
        "Carbohydrates: " + (weight/10)*carbohydrates +"\n" +
        "Fats: " +(weight/10)*fats + "\n"+
        "Fiber: " +(weight/10)*fiber +"\n";}
}  
  
  
  
  
 

