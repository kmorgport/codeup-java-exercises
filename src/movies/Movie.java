package movies;

public class Movie {
    private String name;
    private String category;

    Movie(String name,String category){
        this.name = name;
        this.category = category;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getCategory(){
        return this.category;
    }
    public void setCategory(String newCategory){
        this.category = newCategory;
    }
}
