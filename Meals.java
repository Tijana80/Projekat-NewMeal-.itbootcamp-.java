
import java.util.ArrayList;
import java.util.List;


public class Meals {
  private ArrayList<Meal>meals;

    public Meals(ArrayList<Meal> meals) {
        this.meals = meals;
    }


    public ArrayList<Meal> getMeals() {
        return meals;
    }
    
   
    public void remove(Meal m){
    if(meals.contains(m))
        meals.remove(m);}
    
    public ArrayList<Meal> search(String s){
    ArrayList<Meal> res=new ArrayList<>();
    for(Meal m:meals){
    if(m.getName().contains(s)){
     res.add(m);}}
    return res;
    }
    
    public ArrayList<Meal> search(double kcal){
    ArrayList<Meal>res1=new ArrayList<>();
    for(Meal m:meals){
    if(m.getKcal()<kcal){
    res1.add(m);}}
    return res1;}

   
    
    public boolean add(Meal m){
    if(!meals.contains(m))
        meals.add(m);
    return true;}
    
    public ArrayList<Meal>search(List<Nutriment>nutriment){
    ArrayList<Meal> res2=new ArrayList<>();
    for(Meal m:meals){
    if(meals.containsAll(nutriment)){
    res2.add(m);}}
    return res2;}

    @Override
    public String toString() {
        String ret="";
        for(Meal m:meals)
      ret+=m.toString() +"\n";
        return ret;
    }
    
    
    
}