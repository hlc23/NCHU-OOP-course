package HW4;

public class Person {
    private String name;
    
    Person(){
        this.name = "N/A";
    }

    Person(String name){
        this.name = name != null ? name : "N/A";
    }

    Person(Person theObject){
        this.name = theObject.name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name != null ? name : "N/A";
    }

    @Override
    public String toString(){
        return "Name: " + this.name; 
    }

    @Override
    public boolean equals(Object object){
        if (object instanceof Person){
            return this.name.equals(((Person)object).name);
        }
        return false;
    }
}
