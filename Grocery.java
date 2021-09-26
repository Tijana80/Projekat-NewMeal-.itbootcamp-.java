
public abstract class Grocery implements Energy{
    private String company;
    private String name;

    public Grocery(String company, String name) {
        this.company = company;
        this.name = name;
    }
    

    public Grocery(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
        
    }

    public String getCompany() {
        return company;
    }
   
    public abstract boolean equals(Object o);
}

    
    
    

