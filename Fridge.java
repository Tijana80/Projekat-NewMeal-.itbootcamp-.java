
import java.util.List;

public class Fridge {
   private List<Nutriment>nutriments;

    public Fridge(List<Nutriment> nutriments) {
        this.nutriments = nutriments;
        
    }

    public List<Nutriment> getNutriments() {
        return nutriments;
    }
public void add(Nutriment n){
    if(!nutriments.contains(n))
nutriments.add(n);
    for(Nutriment nn:nutriments){
    if(nn.getName()==n.getName()){
    nn.setWeight(nn.getWeight()+n.getWeight());}}
 
}


 public void remove(Nutriment n)
 { nutriments.remove(n);}
 
  public void remove(Nutriment n,double weight) {
     for(int i=0;i<nutriments.size();i++)  {
        if(nutriments.get(i).getName()==n.getName())
    nutriments.get(i).setWeight(nutriments.get(i).getWeight()-weight);} 
 
    }
     
  
      }
    

