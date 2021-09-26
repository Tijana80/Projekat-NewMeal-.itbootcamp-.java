
import java.util.ArrayList;
import java.util.List;



public class Meal implements Energy{
 private  int  id;
   private  ArrayList  <Nutriment> nutriments;
  private String name; 

    public Meal(ArrayList<Nutriment> nutriments, String name) {
        this.nutriments = nutriments;
        this.name = name;
    }
    public Meal(){
    nutriments=new ArrayList<>();}

    public Meal(int id) {
        this.id = id;
    }
    

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public void add(Nutriment n){
        if(!nutriments.contains(n)){
        nutriments.add(n);}
        
        for(Nutriment nn:nutriments){
            if(nn.getName()==n.getName())
         nn.setWeight(n.getWeight()+n.getWeight());
        }
     
    }
   
    public void remove(Nutriment n){
  nutriments.remove(n);}
    
     
  public void remove(Nutriment n,double weight) {
    for(int i=0;i<nutriments.size();i++)  {
        if(nutriments.get(i).getName()==n.getName())
    nutriments.get(i).setWeight(nutriments.get(i).getWeight()-weight);}
  
    }
   
  
  public double getKcal(){
  double totalKcal=0;
  for(Nutriment n:nutriments) 
      totalKcal+=n.getKcal();
  return totalKcal;}
  
  
  public double getProteins(){
  double totalProteins=0;
  for(Nutriment n:nutriments)
      totalProteins+=n.getProteins();
  return totalProteins;}
  
  public double getFats(){
  double totalFats=0;
  for(Nutriment n:nutriments)
      totalFats+=n.getFats();
  return totalFats;}
  
   public double getFiber(){
  double totalFiber=0;
  for(Nutriment n:nutriments)
      totalFiber+=n.getFiber();
  return totalFiber;}
   
    public double getCarbohydrates(){
  double totalCarbohydrates=0;
  for(Nutriment n:nutriments)
      totalCarbohydrates+=n.getCarbohydrates();
  return totalCarbohydrates;}



    @Override
    public boolean equals(Object o) {
        Meal m=(Meal)o;
        if(this.id==m.getId()) 
        return true; 
        return false;
    }

    

    @Override
    public String toString() {
        return   "Name: " + name +"\n" + "Nutriments: " + nutriments ;
    }
    
    
}
